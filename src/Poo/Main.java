package Poo;

public class Main {
    public static void main(String[] args) {

        Carro spark = new Carro("chevrolet", "spark", 2009, "normal", "normal", 1000, "EF567", "4 ruedas", "cambios", "gasolina", 4);
        Carro spark1 = new Carro("chevrolet", "spark", 2009, "normal", "normal", 1000, "ABC123", "hatchback", "manual", "gasolina", 5);
        Carro corolla = new Carro("toyota", "corolla", 2020, "normal", "deportivo", 2000, "XYZ456", "sedan", "automatica", "gasolina", 4);
        Carro civic = new Carro("honda", "civic", 2018, "deportivo", "deportivo", 1500, "DEF789", "sedan", "manual", "gasolina", 4);
        Carro mustang = new Carro("ford", "mustang", 2021, "deportivo", "deportivo", 5000, "GHI012", "coupe", "automatica", "gasolina", 2);
        Carro mazda3 = new Carro("mazda", "mazda3", 2019, "normal", "normal", 2000, "JKL345", "sedan", "automatica", "gasolina", 4);
        Carro golf = new Carro("volkswagen", "golf", 2017, "hatchback", "deportivo", 1400, "MNO678", "hatchback", "manual", "gasolina", 5);
        Carro model3 = new Carro("tesla", "model3", 2022, "futurista", "deportivo", 0, "PQR901", "sedan", "automatica", "electrico", 4);
        Carro duster = new Carro("renault", "duster", 2021, "camioneta", "normal", 1600, "STU234", "suv", "manual", "gasolina", 5);
        Carro picanto = new Carro("kia", "picanto", 2018, "normal", "normal", 1250, "VWX567", "hatchback", "manual", "gasolina", 5);
        Carro tucson = new Carro("hyundai", "tucson", 2020, "camioneta", "normal", 2000, "YZA890", "suv", "automatica", "gasolina", 5);
        Carro x5 = new Carro("bmw", "x5", 2022, "lujo", "deportivo", 3000, "BCD123", "suv", "automatica", "gasolina", 5);
        Carro a4 = new Carro("audi", "a4", 2021, "lujo", "deportivo", 2000, "EFG456", "sedan", "automatica", "gasolina", 4);
        Carro c200 = new Carro("mercedes", "c200", 2019, "lujo", "normal", 2000, "HIJ789", "sedan", "automatica", "gasolina", 4);
        Carro wrangler = new Carro("jeep", "wrangler", 2020, "todoterreno", "normal", 3600, "KLM012", "suv", "automatica", "gasolina", 3);
        Carro sentra = new Carro("nissan", "sentra", 2018, "normal", "normal", 1800, "NOP345", "sedan", "manual", "gasolina", 4);
        Carro porshe = new Carro("porsche", "911", 2023, "deportivo", "deportivo", 3000, "QRS678", "coupe", "automatica", "gasolina", 2);
        Carro march = new Carro("nissan", "march", 2016, "normal", "normal", 1600, "TUV901", "hatchback", "manual", "gasolina", 5);
        Carro tracker = new Carro("chevrolet", "tracker", 2021, "camioneta", "normal", 1200, "WXY234", "suv", "automatica", "gasolina", 5);
        Carro kwid = new Carro("renault", "kwid", 2022, "normal", "normal", 1000, "ZAB567", "hatchback", "manual", "gasolina", 5);
        Carro swift = new Carro("suzuki", "swift", 2019, "deportivo", "normal", 1200, "CDE890", "hatchback", "manual", "gasolina", 5);
        Carro hilux = new Carro("toyota", "hilux", 2022, "camioneta", "normal", 2800, "FGH123", "pickup", "manual", "diesel", 4);
        Carro cx5 = new Carro("mazda", "cx5", 2021, "camioneta", "deportivo", 2500, "IJK456", "suv", "automatica", "gasolina", 5);
        Carro ranger = new Carro("ford", "ranger", 2020, "camioneta", "normal", 3200, "LMN789", "pickup", "automatica", "diesel", 4);
        Carro rio = new Carro("kia", "rio", 2017, "normal", "normal", 1400, "OPQ012", "sedan", "manual", "gasolina", 4);
        Carro leaf = new Carro("nissan", "leaf", 2021, "futurista", "normal", 0, "RST345", "hatchback", "automatica", "electrico", 5);
        Carro cooper = new Carro("mini", "cooper", 2019, "deportivo", "deportivo", 1500, "UVW678", "hatchback", "manual", "gasolina", 3);
        Carro cayenne = new Carro("porsche", "cayenne", 2022, "lujo", "deportivo", 3000, "XYZ901", "suv", "automatica", "gasolina", 5);
        Carro creta = new Carro("hyundai", "creta", 2021, "camioneta", "normal", 1600, "ABC345", "suv", "automatica", "gasolina", 5);
        Carro polo = new Carro("volkswagen", "polo", 2020, "normal", "normal", 1600, "HAKD980", "SUV", "manual", "gasolina", 4);

        // eestrellas amarillas
        Estrella sol = new Estrella("amarillo", 5, "pequeno", 10, 100);
        Estrella alfaCentauri = new Estrella("amarillo", 6, "mediano", 12, 80);
        Estrella capella = new Estrella("amarillo", 8, "grande", 16, 90);
        Estrella tauCeti = new Estrella("amarillo", 5, "mediano", 10, 75);

        // Estrellas Azules
        Estrella rigel = new Estrella("azul", 5, "pequeno", 10, 100);
        Estrella vega = new Estrella("azul", 6, "grande", 12, 85);
        Estrella spica = new Estrella("azul", 8, "mediano", 16, 95);
        Estrella regulus = new Estrella("azul", 5, "grande", 10, 70);

        // Estrellas Rojas
        Estrella betelgeuse = new Estrella("rojo", 5, "mediano", 10, 90);
        Estrella antares = new Estrella("rojo", 6, "pequeno", 12, 60);
        Estrella aldebaran = new Estrella("rojo", 8, "grande", 16, 100);
        Estrella arcturus = new Estrella("rojo", 5, "mediano", 10, 80);

        // Estrellas Verdes
        Estrella zuben = new Estrella("verde", 5, "pequeno", 10, 70);
        Estrella jade = new Estrella("verde", 6, "mediano", 12, 85);
        Estrella esmeralda = new Estrella("verde", 8, "grande", 16, 90);
        Estrella malaquita = new Estrella("verde", 5, "pequeno", 10, 65);

        // Estrellas Blancas
        Estrella sirio = new Estrella("blanco", 5, "grande", 10, 100);
        Estrella procyon = new Estrella("blanco", 6, "mediano", 12, 95);
        Estrella altair = new Estrella("blanco", 8, "pequeno", 16, 80);
        Estrella deneb = new Estrella("blanco", 5, "grande", 10, 90);


        System.out.println(sirio.color + sirio.puntas + sirio.tamano + sirio.esquinas + sirio.brillo);



    }
}
