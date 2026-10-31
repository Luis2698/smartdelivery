/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdelivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import smartdelivery.model.*;
import smartdelivery.repository.*;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired private PedidoRepository pedidoRepository;
    @Autowired private UsuarioRepository usuarioRepository;
    @Autowired private ComercioRepository comercioRepository;
    @Autowired private ProductoRepository productoRepository;

    @Override
    public void run(String... args) throws Exception {
        
        // 1. BURGER KING
        Comercio bk = comercioRepository.save(new Comercio(
            "Burger King", "Hamburguesas", "Calzada Asunción, Amatitlán", "1711-0000",
            "20-35 min", "Gratis", "A la Parrilla", 4.8,
            "https://upload.wikimedia.org/wikipedia/commons/8/85/Burger_King_logo_%281999%E2%80%932020%29.svg"
        ));
        productoRepository.save(new Producto("Combo Whopper", 52.00, 65.00, "20% DTO", "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400", bk));
        productoRepository.save(new Producto("Combo Quesoburguesa Doble", 42.00, 52.00, "19% DTO", "https://images.unsplash.com/photo-1550547660-d9450f859349?w=400", bk));
        productoRepository.save(new Producto("King de Pollo", 45.00, 55.00, "18% DTO", "https://images.unsplash.com/photo-1626082927389-6cd097cdc6ec?w=400", bk));
        productoRepository.save(new Producto("Combo Whopper Tejano Doble (Mediano / Grande)", 62.00, 78.00, "20% DTO", "https://images.unsplash.com/photo-1586190848861-99aa4a171e90?w=400", bk));

        // 2. PIZZA HUT
        Comercio ph = comercioRepository.save(new Comercio(
            "Pizza Hut", "Pizzería", "Centro Comercial Plaza Amatitlán", "1730-1111",
            "25-40 min", "Q 10.00", "Pizzas Gigantes", 4.7,
            "https://upload.wikimedia.org/wikipedia/sco/d/d2/Pizza_Hut_logo.svg"
        ));
        productoRepository.save(new Producto("Pizza Super Supreme", 120.00, 145.00, "17% DTO", "https://images.unsplash.com/photo-1513104890138-7c749659a591?w=400", ph));
        productoRepository.save(new Producto("Pizza Meat Lovers", 125.00, 150.00, "16% DTO", "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?w=400", ph));
        productoRepository.save(new Producto("Pizza de Pepperoni", 95.00, 115.00, "17% DTO", "https://images.unsplash.com/photo-1628840042765-356cda07504e?w=400", ph));
        productoRepository.save(new Producto("Quesadillas de Queso", 35.00, 45.00, "22% DTO", "https://images.unsplash.com/photo-1599974579688-8dbdd335c77f?w=400", ph));
        productoRepository.save(new Producto("Pan con Ajo", 25.00, 32.00, "21% DTO", "https://images.unsplash.com/photo-1573140247632-f8fd74997d5c?w=400", ph));
        productoRepository.save(new Producto("Bastones de Canela", 30.00, 38.00, "21% DTO", "https://images.unsplash.com/photo-1509440159596-0249088772ff?w=400", ph));

        // 3. POLLO CAMPERO
        Comercio campero = comercioRepository.save(new Comercio(
            "Pollo Campero", "Pollo Frito", "Plaza Amatitlán", "1777-0000",
            "15-30 min", "Q 10.00", "Sabor Campero", 4.9,
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Pollo_Campero_logo.svg/512px-Pollo_Campero_logo.svg.png"
        ));
        productoRepository.save(new Producto("Pollo Frito Tradicional", 65.00, 80.00, "18% DTO", "https://images.unsplash.com/photo-1626645738196-c2a7c87a8f58?w=400", campero));
        productoRepository.save(new Producto("Pollo Frito Extra Crispy", 68.00, 82.00, "17% DTO", "https://images.unsplash.com/photo-1562967914-608f82629710?w=400", campero));
        productoRepository.save(new Producto("Pollo Agradecido", 140.00, 165.00, "15% DTO", "https://images.unsplash.com/photo-1587593810167-a84920ea0781?w=400", campero));
        productoRepository.save(new Producto("Empanadas de Pollo", 28.00, 35.00, "20% DTO", "https://images.unsplash.com/photo-1604382354936-07c5d9983bd3?w=400", campero));
        productoRepository.save(new Producto("Papas Fritas", 18.00, 24.00, "25% DTO", "https://images.unsplash.com/photo-1573080496219-bb080dd4f877?w=400", campero));
        productoRepository.save(new Producto("Molletes de Pollo", 32.00, 40.00, "20% DTO", "https://images.unsplash.com/photo-1509722747041-616f39b57569?w=400", campero));
        productoRepository.save(new Producto("Torta Campero", 38.00, 48.00, "20% DTO", "https://images.unsplash.com/photo-1521305916504-4a1121188589?w=400", campero));
        productoRepository.save(new Producto("Sundae de Fresa", 16.00, 20.00, "20% DTO", "https://images.unsplash.com/photo-1563805042-7684c019e1cb?w=400", campero));

        // 4. LA ESTANCIA
        Comercio estancia = comercioRepository.save(new Comercio(
            "La Estancia", "Parrillada / Churrascos", "Plaza Amatitlán", "2400-2222",
            "30-45 min", "Q 15.00", "Cortes Premium", 4.9,
            "https://images.unsplash.com/photo-1544025162-d76694265947?w=200"
        ));
        productoRepository.save(new Producto("Puyazo Importado", 135.00, 160.00, "15% DTO", "https://images.unsplash.com/photo-1544025162-d76694265947?w=400", estancia));
        productoRepository.save(new Producto("Entraña a la Parrilla", 145.00, 175.00, "17% DTO", "https://images.unsplash.com/photo-1558030006-450675393462?w=400", estancia));
        productoRepository.save(new Producto("Lomo de Aguja", 125.00, 150.00, "16% DTO", "https://images.unsplash.com/photo-1544025162-d76694265947?w=400", estancia));
        productoRepository.save(new Producto("Sopa de Cebolla", 42.00, 50.00, "16% DTO", "https://images.unsplash.com/photo-1547592166-23ac45744acd?w=400", estancia));
        productoRepository.save(new Producto("Papas al Horno con Crema y Tocino", 32.00, 40.00, "20% DTO", "https://images.unsplash.com/photo-1518013431117-eb1465fa5752?w=400", estancia));
        productoRepository.save(new Producto("Choripán", 38.00, 46.00, "17% DTO", "https://images.unsplash.com/photo-1626700051175-6818013e1d4f?w=400", estancia));
        productoRepository.save(new Producto("Pastel de Zanahoria", 28.00, 35.00, "20% DTO", "https://images.unsplash.com/photo-1621303837174-89787a7d4729?w=400", estancia));

        // 5. EL MACARONE
        Comercio macarone = comercioRepository.save(new Comercio(
            "El Macarone", "Italiana / Pastas", "Calle Real, Amatitlán", "2330-4444",
            "20-35 min", "Q 10.00", "Pastas & Pizzas", 4.6,
            "https://images.unsplash.com/photo-1555396273-367ea4eb4db5?w=200"
        ));
        productoRepository.save(new Producto("Lasagna Bolognesa", 48.00, 60.00, "20% DTO", "https://images.unsplash.com/photo-1574894709920-11b28e7367e3?w=400", macarone));
        productoRepository.save(new Producto("Spaghetti Alfredo", 45.00, 55.00, "18% DTO", "https://images.unsplash.com/photo-1621996346565-e3d5d6281288?w=400", macarone));
        productoRepository.save(new Producto("Fettuccine con Pollo", 52.00, 65.00, "20% DTO", "https://images.unsplash.com/photo-1645112411341-6c4fd023714a?w=400", macarone));
        productoRepository.save(new Producto("Pan con Ajo Especial", 22.00, 28.00, "21% DTO", "https://images.unsplash.com/photo-1573140247632-f8fd74997d5c?w=400", macarone));
        productoRepository.save(new Producto("Ensalada César", 35.00, 44.00, "20% DTO", "https://images.unsplash.com/photo-1550304943-4f24f54ddde9?w=400", macarone));
        productoRepository.save(new Producto("Pizza de Queso", 75.00, 90.00, "16% DTO", "https://images.unsplash.com/photo-1513104890138-7c749659a591?w=400", macarone));
        productoRepository.save(new Producto("Tiramisú", 26.00, 32.00, "18% DTO", "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?w=400", macarone));

        // 6. MCDONALD'S
        Comercio mc = comercioRepository.save(new Comercio(
            "McDonald's", "Comida Rápida", "Calzada Asunción, Amatitlán", "1770-0000",
            "15-25 min", "Gratis", "McMenú Especial", 4.9,
            "https://upload.wikimedia.org/wikipedia/commons/3/36/McDonald%27s_Golden_Arches.svg"
        ));
        productoRepository.save(new Producto("Big Mac", 45.00, 55.00, "18% DTO", "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400", mc));
        productoRepository.save(new Producto("Cuarto de Libra con Queso", 48.00, 58.00, "17% DTO", "https://images.unsplash.com/photo-1550547660-d9450f859349?w=400", mc));
        productoRepository.save(new Producto("McNuggets de Pollo", 38.00, 46.00, "17% DTO", "https://images.unsplash.com/photo-1562967914-608f82629710?w=400", mc));
        productoRepository.save(new Producto("McPapas", 18.00, 22.00, "18% DTO", "https://images.unsplash.com/photo-1573080496219-bb080dd4f877?w=400", mc));
        productoRepository.save(new Producto("McMuffin de Huevo y Salchicha", 28.00, 35.00, "20% DTO", "https://images.unsplash.com/photo-1550547660-d9450f859349?w=400", mc));
        productoRepository.save(new Producto("Sundae de Chocolate", 15.00, 18.00, "16% DTO", "https://images.unsplash.com/photo-1563805042-7684c019e1cb?w=400", mc));
        productoRepository.save(new Producto("McFlurry", 22.00, 28.00, "21% DTO", "https://images.unsplash.com/photo-1572490122747-3968b75cc699?w=400", mc));

        // 7. LOS CEBOLLINES
        Comercio cebollines = comercioRepository.save(new Comercio(
            "Los Cebollines", "Comida Mexicana", "Carretera al Sur, Amatitlán", "2411-3333",
            "30-50 min", "Q 15.00", "Buffet & Tacos", 4.8,
            "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?w=200"
        ));
        productoRepository.save(new Producto("Anafre de Frijoles con Queso", 42.00, 50.00, "16% DTO", "https://images.unsplash.com/photo-1599974579688-8dbdd335c77f?w=400", cebollines));
        productoRepository.save(new Producto("Tacos al Pastor", 55.00, 68.00, "19% DTO", "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?w=400", cebollines));
        productoRepository.save(new Producto("Enchiladas Suizas", 65.00, 80.00, "18% DTO", "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?w=400", cebollines));
        productoRepository.save(new Producto("Fajitas Mixtas", 85.00, 105.00, "19% DTO", "https://images.unsplash.com/photo-1544025162-d76694265947?w=400", cebollines));
        productoRepository.save(new Producto("Sopa Azteca", 38.00, 46.00, "17% DTO", "https://images.unsplash.com/photo-1547592166-23ac45744acd?w=400", cebollines));
        productoRepository.save(new Producto("Quesadillas de Carne", 52.00, 65.00, "20% DTO", "https://images.unsplash.com/photo-1599974579688-8dbdd335c77f?w=400", cebollines));
        productoRepository.save(new Producto("Churros Con Cajeta", 28.00, 35.00, "20% DTO", "https://images.unsplash.com/photo-1509440159596-0249088772ff?w=400", cebollines));

        // 8. CAFÉ BARISTA
        Comercio barista = comercioRepository.save(new Comercio(
            "Café Barista", "Cafetería / Repostería", "Centro Comercial Flores del Lago", "2250-5555",
            "15-25 min", "Q 10.00", "Café Gourmet", 4.9,
            "https://images.unsplash.com/photo-1501339847302-ac426a4a7cbb?w=200"
        ));
        productoRepository.save(new Producto("Cappuccino de la Casa", 26.00, 32.00, "18% DTO", "https://images.unsplash.com/photo-1534778101976-62847782c213?w=400", barista));
        productoRepository.save(new Producto("Espresso Doble", 18.00, 22.00, "18% DTO", "https://images.unsplash.com/photo-1510591509098-f4fdc6d0ff04?w=400", barista));
        productoRepository.save(new Producto("Latte Cold Brew", 30.00, 38.00, "21% DTO", "https://images.unsplash.com/photo-1517701604599-bb29b565090c?w=400", barista));
        productoRepository.save(new Producto("Bagel de Pavo y Queso", 38.00, 46.00, "17% DTO", "https://images.unsplash.com/photo-1550547660-d9450f859349?w=400", barista));
        productoRepository.save(new Producto("Muffin de Arándanos", 22.00, 28.00, "21% DTO", "https://images.unsplash.com/photo-1607958996333-41aef7caefaa?w=400", barista));
        productoRepository.save(new Producto("Croissant de Jamón y Queso", 28.00, 35.00, "20% DTO", "https://images.unsplash.com/photo-1555507036-ab1f4038808a?w=400", barista));
        productoRepository.save(new Producto("Granita de Café", 32.00, 40.00, "20% DTO", "https://images.unsplash.com/photo-1572490122747-3968b75cc699?w=400", barista));

        // 9. STARBUCKS
        Comercio starbucks = comercioRepository.save(new Comercio(
            "Starbucks", "Cafetería", "Plaza Amatitlán", "2280-6666",
            "15-30 min", "Q 12.00", "Starbucks Rewards", 4.9,
            "https://upload.wikimedia.org/wikipedia/en/d/d3/Starbucks_Corporation_Logo_2011.svg"
        ));
        productoRepository.save(new Producto("Caramel Macchiato", 36.00, 44.00, "18% DTO", "https://images.unsplash.com/photo-1534778101976-62847782c213?w=400", starbucks));
        productoRepository.save(new Producto("Frappuccino de Chip de Chocolate", 40.00, 48.00, "16% DTO", "https://images.unsplash.com/photo-1572490122747-3968b75cc699?w=400", starbucks));
        productoRepository.save(new Producto("Iced Vanilla Latte", 34.00, 42.00, "19% DTO", "https://images.unsplash.com/photo-1517701604599-bb29b565090c?w=400", starbucks));
        productoRepository.save(new Producto("Espresso", 20.00, 25.00, "20% DTO", "https://images.unsplash.com/photo-1510591509098-f4fdc6d0ff04?w=400", starbucks));
        productoRepository.save(new Producto("Croissant de Almendras", 26.00, 32.00, "18% DTO", "https://images.unsplash.com/photo-1555507036-ab1f4038808a?w=400", starbucks));
        productoRepository.save(new Producto("Cake Pop", 18.00, 22.00, "18% DTO", "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=400", starbucks));
        productoRepository.save(new Producto("Muffin de Chispas de Chocolate", 24.00, 30.00, "20% DTO", "https://images.unsplash.com/photo-1607958996333-41aef7caefaa?w=400", starbucks));

        // 10. DOMINO'S PIZZA
        Comercio dominos = comercioRepository.save(new Comercio(
            "Domino's Pizza", "Pizzería", "Calle Real, Amatitlán", "1730-0000",
            "20-35 min", "Gratis", "Domino's 30 Min", 4.8,
            "https://upload.wikimedia.org/wikipedia/commons/3/3e/Domino%27s_pizza_logo.svg"
        ));
        productoRepository.save(new Producto("Pizza ExtravaganZZa", 115.00, 140.00, "17% DTO", "https://images.unsplash.com/photo-1513104890138-7c749659a591?w=400", dominos));
        productoRepository.save(new Producto("Pizza Pepperoni Feast", 95.00, 115.00, "17% DTO", "https://images.unsplash.com/photo-1628840042765-356cda07504e?w=400", dominos));
        productoRepository.save(new Producto("Dominos Cheesy Bread", 38.00, 48.00, "20% DTO", "https://images.unsplash.com/photo-1573140247632-f8fd74997d5c?w=400", dominos));
        productoRepository.save(new Producto("Cinna Stix", 28.00, 35.00, "20% DTO", "https://images.unsplash.com/photo-1509440159596-0249088772ff?w=400", dominos));
        productoRepository.save(new Producto("Papas con Queso", 25.00, 32.00, "21% DTO", "https://images.unsplash.com/photo-1573080496219-bb080dd4f877?w=400", dominos));
        productoRepository.save(new Producto("Alitas de Pollo", 48.00, 60.00, "20% DTO", "https://images.unsplash.com/photo-1562967914-608f82629710?w=400", dominos));
        productoRepository.save(new Producto("Pizza Deluxe", 105.00, 130.00, "19% DTO", "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?w=400", dominos));

        if (usuarioRepository.count() == 0) {
            Usuario u1 = usuarioRepository.save(new Usuario("Carlos López", "carlos@gmail.com", "5555-1234"));
            pedidoRepository.save(new Pedido("2da Calle 4-15, Zona 1, Amatitlán | Combo: Combo Whopper (1 Unid) | Bebida: Coca-Cola Fría | Extra: Sin cebolla ni pepinillos | Tiempo Est.: 20-35 min", 52.00, "CREADO", "EFECTIVO", u1));
        }
    }
}