/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   light_side.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: axbal <marvin@42.fr>                       +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/01/07 13:59:34 by axbal             #+#    #+#             */
/*   Updated: 2019/02/23 16:03:01 by axbal            ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "rt.h"

int			side_light_check(t_dot origin, t_dot inter, t_dot inter2, t_obj *o)
{
	float	d1;
	float	d2;

	d1 = two_point_dist(origin, inter);
	d2 = two_point_dist(origin, inter2);
	if (d1 <= d2)
		return (1);
	if (d2 < d1 && check_lim(o, inter2) == -1)
		return (2);
	return (0);
}

int			call_side_light_check(t_sec_r s, t_obj *obj, t_data *d)
{
	t_dot	d1;
	t_dot	d2;
	t_dot	org;
	int		ret;

	if (obj->type == PLANE)
		return (1);
	org = d->light[d->l]->pos;
	if (d->t[0] != find_right_distance(d, org, s.lo, s.inter))
		fswap(&(d->t[0]), &(d->t[1]));
	d1 = get_hitpoint(d->light[d->l]->pos, s.lo, d->t[0]);
	d2 = get_hitpoint(d->light[d->l]->pos, s.lo, d->t[1]);
	ret = side_light_check(org, d1, d2, obj);
	org = d->cam->pos;
	test_object(d, s.o_ray, obj, d->cam->pos);
	if (d->t[0] != find_right_distance(d, org, s.o_ray, s.inter))
		fswap(&(d->t[0]), &(d->t[1]));
	d1 = get_hitpoint(d->cam->pos, s.o_ray, d->t[0]);
	d2 = get_hitpoint(d->cam->pos, s.o_ray, d->t[1]);
	if (ret == 0 || ret != side_light_check(org, d1, d2, obj))
		return (-1);
	return (1);
}
