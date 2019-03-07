camera {
	pos(30,10,50)
	rotation(40,-90,0)
}

object {
	type(cylinder)
	pos(-25, 0, 30)
	rotation(90, 0)
	radius(5)
	color(125, 137, 94)
}

object {
	type(cylinder)
	pos(25, 0, 30)
	rotation(90, 0)
	radius(5)
	color(125, 137, 94)
}

object {
	type(cylinder)
	pos(-25, 0, 80)
	rotation(90, 0)
	radius(5)
	color(125, 137, 94)
}

object {
	type(cylinder)
	pos(25, 0, 80)
	rotation(90, 0)
	radius(5)
	color(125, 137, 94)
}

object {
	type(sphere)
	pos(-25, 25, 30)
	radius(8)
	color(125, 137, 94)
}

object {
	type(sphere)
	pos(25, 25, 30)
	radius(8)
	color(125, 137, 94)
}

object {
	type(sphere)
	pos(-25, 25, 80)
	radius(8)
	color(125, 137, 94)
}

object {
	type(sphere)
	pos(25, 25, 80)
	radius(8)
	color(125, 137, 94)
}

object {
	type(sphere)
	pos(-25, -25, 30)
	radius(8)
	color(125, 137, 94)
}

object {
	type(sphere)
	pos(25, -25, 30)
	radius(8)
	color(125, 137, 94)
}

object {
	type(sphere)
	pos(-25, -25, 80)
	radius(8)
	color(125, 137, 94)
}

object {
	type(sphere)
	pos(25, -25, 80)
	radius(8)
	color(125, 137, 94)
}


object {
	type(sphere)
	pos(0, -18, 55)
	radius(8)
	rlim_z(-8, 1)
	color(125, 137, 228)
	mirror(50)
}


object {
	type(plane)
	pos(0, 25, 0)
	rotation(90, 0)
	color(254,195, 248)
}

object{
	type(plane)
	pos(0, -25, 0)
	rotation(90, 0)
	color(125, 195, 218)
	squared
}

object{
	type(plane)
	pos(0, 0, 100)
	rotation(0, 0)
	color(189, 215, 168)
}

object{
	type(plane)
	pos(-40, 0, 0)
	rotation(0, 90)
	color(189, 215, 168)
}

object{
	type(plane)
	pos(40, 0, 0)
	rotation(0, 90)
	color(189, 215, 168)
}

object{
	type(plane)
	pos(0, 0, -20)
	rotation(0, 0)
	color(189, 215, 168)
}

light{
	pos(-10,15,55)
}

light{
	pos(10,15,55)
}
