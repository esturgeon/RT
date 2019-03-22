camera {
	pos(0,-1,-20)
	rotation(0,0,10)
}

object {
	shiny
	type(sphere)
	pos(-1,-1,20)
	radius(2)
	color(200,100,190)
}

object {
	shiny
	type(sphere)
	pos(-10,-1,15)
	radius(3)
	color(110,20,120)
}

object {
	shiny
	type(sphere)
	pos(-20,-1,10)
	radius(4)
	color(125,123,100)
}

object {
	type(plane)
	pos(0,0,200)
	rotation(45,45, 0)
	color(125,149,238)
}

object {
	shiny
	type(cylinder)
	pos(5,0,30)
	radius(2)
	rotation(20,-60, 0)
	color(255,255,0)
}

object {
	type(cone)
	shiny
	pos(20, 5, 50)
	angle(5)
	rotation(60, 20, 0)
	color(212, 164, 149)
}

light {
	pos(-30,-30,-20)
}
