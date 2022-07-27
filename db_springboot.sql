create database if not exists springboot;
use springboot;
select * from hamburguesa;

INSERT INTO hamburguesa
SET descripcion = '100g de carne, cheddar, panceta, tomate y lechuga',
	imagen = 'https://www.infobae.com/new-resizer/sh0cQBavobeT-OvaLzu-VP5mi5A=/992x558/filters:format(webp):quality(85)/arc-anglerfish-arc2-prod-infobae.s3.amazonaws.com/public/FJKXKQKMMJBV7KQ7XQ3YNFO7LU.jpg',
    nombre = 'Clásica',
    precio = 1000.0;
    
INSERT INTO hamburguesa
SET descripcion = '200g de carne, bacon, cheddar, cebolla caramelizada, lecha',
	imagen = 'https://cdn1.parksmedia.wdprapps.disney.com/resize/mwImage/1/1080/1080/75/vision-dam/digital/parks-platform/parks-global-assets/disney-springs/DisneySprings_D-LuxeBurger_FULL_StackBurgerSouthern-1x1.jpg?2022-01-05T21:40:51+00:00',
    nombre = 'Grill Burger',
    precio = 1300.0;
    
INSERT INTO hamburguesa
SET descripcion = '200g de pollo crispy, pepino, cheddar, tomate, lechuga',
	imagen = 'https://www.chicken.ca/wp-content/uploads/2020/09/Moist-Chicken-Burgers.jpg',
    nombre = 'Crispy',
    precio = 1300.0;
    
INSERT INTO hamburguesa
SET descripcion = '600g de pollo carne, cebolla caramelizada, bacon, cheddar, pepino, tomate, lechuga',
	imagen = 'https://media.istockphoto.com/photos/favourite-burger-toppings-picture-id469660542?k=20&m=469660542&s=612x612&w=0&h=1LfG2K-CgB78QgcXJllD8riD3WyPLFUfR0tfihlEmhw=',
    nombre = 'Obelisco',
    precio = 2000.0;
    
    