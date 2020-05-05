package p001o;

import java.util.StringTokenizer;
import net.lingala.zip4j.util.InternalZipConstants;

/* renamed from: o.ن */
public class C0254 {

    /* renamed from: ʳ */
    public static final int f1372 = 34;

    /* renamed from: ʴ */
    public static final int f1373 = 35;

    /* renamed from: ʹ */
    public static final int f1374 = 22;

    /* renamed from: ʻ */
    public static final int f1375 = 5;

    /* renamed from: ʼ */
    public static final int f1376 = 6;

    /* renamed from: ʽ */
    public static final int f1377 = 7;

    /* renamed from: ʾ */
    public static final int f1378 = 10;

    /* renamed from: ʿ */
    public static final int f1379 = 11;

    /* renamed from: ˆ */
    public static final int f1380 = 36;

    /* renamed from: ˇ */
    public static final String[] f1381 = { C0483.m2490("Unknown", new String[0]), "BMW", "Volkswagen",
            "GM / Opel / Vauxhall", "Chrysler", "Ford", "Honda", "Hyundai", "Toyota", "Nissan", "Kia", "Lexus", "Mazda",
            "Mitsubishi", "Mercedes-Benz", "Lotus", "Rover", "Daewoo", "Izuzu", "Citroen", "Fiat", "Renault", "Audi",
            "Jaguar", "AstonMartin", "DAF", "Dodge", "Jeep", "Seat/Audi/Volkswagen", "Triumph", "Chevrolet", "Pontiac",
            "Plymouth", "Subaru", "Smart", "Volvo", "Buick" };

    /* renamed from: ˈ */
    public static final int f1382 = 12;

    /* renamed from: ˉ */
    public static final int f1383 = 13;

    /* renamed from: ˊ */
    public static final int f1384 = 0;

    /* renamed from: ˋ */
    public static final int f1385 = 1;

    /* renamed from: ˌ */
    public static final int f1386 = 14;

    /* renamed from: ˍ */
    public static final int f1387 = 15;

    /* renamed from: ˎ */
    public static final int f1388 = 2;

    /* renamed from: ˏ */
    public static final int f1389 = 3;

    /* renamed from: ˑ */
    public static final int f1390 = 16;

    /* renamed from: ˡ */
    public static final String[] f1391 = { "10T", "Oshkosh", "11V", "Ottawa", "137", "AM General, Hummer", "15G",
            "Gillig", "17N", "John Deere", "18X", "WRV", "19U", "Acura", "1A4", "Chrysler", "1A8", "Chrysler", "1AC",
            "AMC", "1AM", "AMC", "1B3", "Dodge", "1B4", "Dodge", "1B6", "Dodge", "1B7", "Dodge", "1B7", "Dodge", "1BA",
            "Blue Bird", "1BB", "Blue Bird", "1BD", "Blue Bird", "1C3", "Chrysler", "1C4", "Chrysler", "1C8",
            "Chrysler", "1C9", "Chance", "1CY", "Crane Carrier", "1D3", "Dodge", "1D4", "Dodge", "1D5", "Dodge", "1D7",
            "Dodge", "1D8", "Dodge", "1EC", "Fleetwood", "1F1", "Ford", "1F6", "Ford", "1FA", "Ford", "1FB", "Ford",
            "1FC", "Ford", "1FD", "Ford", "1FE", "Ford", "1FM", "Ford", "1FT", "Ford", "1FU", "Freightliner", "1FV",
            "Freightliner", "1G1", "Chevrolet", "1G2", "Pontiac", "1G3", "Oldsmobile", "1G4", "Buick", "1G5",
            "GM, Pontiac", "1G6", "Cadillac", "1G8", "Chevrolet, Saturn", "1GA", "Chevrolet", "1GB", "Chevrolet", "1GC",
            "Chevrolet", "1GD", "GM", "1GE", "Cadillac", "1GF", "Flexible", "1GG", "Isuzu", "1GH", "GM", "1GJ", "GM",
            "1GK", "GM", "1GM", "Pontiac", "1GN", "Chevrolet", "1GT", "GM", "1GY", "Cadillac", "1HG", "Honda", "1HS",
            "International", "1HT", "International", "1HV", "International", "1J4", "Jeep", "1J7", "Jeep", "1J8",
            "Jeep", "1JC", "Jeep", "1JD", "AMC", "1JT", "Jeep", "1L1", "Lincoln", "1LN", "Lincoln", "1M1", "Mackv",
            "1M2", "Mack", "1M3", "Mack", "1M8", "MCI", "1ME", "Mercury", "1MR", "Lincoln", "1N4", "Nissan", "1N6",
            "Nissan", "1N9", "Neoplan", "1NK", "Kenworth", "1NP", "Peterbilt", "1NX", "Toyota", "1P3", "Plymouth",
            "1P4", "Plymouth", "1P7", "Plymouth", "1P9", "Panoz", "1RF", "Roadmaster", "1S9", "Saleen", "177", "Thomas",
            "1T8", "Thomas", "1TU", "TMC", "1V1", "Volkswagen", "1VW", "Volkswagen", "1WA", "Autostar", "1WB",
            "Autostar", "1WU", "White Volvo", "1WV", "Winnebago", "1XK", "Kenworth", "1XM", "AMC", "1XP", "Peterbilt",
            "1Y1", "Chevrolet, Geo", "1YV", "Mazda", "1Z3", "Mitsubishi", "1Z5", "Mitsubishi", "1Z7", "Mitsubishi",
            "1ZV", "Ford", "1ZW", "Mercury", "2A3", "Chrysler", "2A4", "Chrysler", "2A8", "Chrysler", "2B1", "Orion",
            "2B3", "Dodge", "2B4", "Dodge", "2B5", "Dodge", "2B6", "Dodge", "2B7", "Dodge", "2B8", "Dodge", "2BC",
            "Jeep", "2C1", "Chevrolet", "2C3", "Chrysler", "2C4", "Chrysler", "2C7", "Pontiac", "2C8", "Chrysler",
            "2CC", "AMC, Eagle", "2CK", "Geo, Pontiac", "2CM", "AMC", "2CN", "Chevrolet", "2D4", "Dodge", "2D6",
            "Dodge", "2D7", "Dodge", "2D8", "Dodge", "2E3", "Eagle", "2FA", "Ford", "2FD", "Ford", "2FM", "Ford", "2FT",
            "Ford", "2FU", "Freightliner", "2FV", "Freightliner", "2FW", "Sterling", "2FZ", "Sterling", "2G0", "GM",
            "2G1", "Chevrolet", "2G2", "Pontiac", "2G3", "Oldsmobile", "2G4", "Buick", "2G5", "GM", "2G7", "Pontiac",
            "2G8", "Chevrolet", "2GA", "Chevrolet", "2GB", "Chevrolet", "2GD", "GM", "2GJ", "GM", "2GK", "GM", "2GN",
            "Chevrolet", "2GT", "GM", "2HG", "Honda", "2HH", "Acura", "2HJ", "Honda", "2HK", "Honda", "2HM", "Hyundai",
            "2HN", "Acura", "2HS", "International", "2HT", "International", "2J4", "Jeep", "2LM", "Lincoln", "2M2",
            "Mack", "2ME", "Mercury", "2MH", "Mercury", "2MR", "Mercury", "2NK", "Kenworth", "2NP", "Peterbilt", "2P3",
            "Plymouth", "2P4", "Plymouth", "2P5", "Plymouth", "2P9", "Prevost", "2PC", "Prevost", "2S2", "Suzuki",
            "2S3", "Suzuki", "2T1", "Toyota", "2T2", "Lexus", "2WK", "Western Star Trucks", "2WL",
            "Western Star Trucks", "2XK", "Kenworth", "2XM", "Eagle", "2XP", "Peterbilt", "3A4", "Chrysler", "3A8",
            "Chrysler", "3AB", "Dina", "3AL", "Freightliner", "3B3", "Dodge", "3B4", "Dodge", "3B6", "Dodge", "3B7",
            "Dodge", "3BK", "Kenworth", "3BP", "Peterbilt", "3C3", "Chrysler", "3C4", "Chrysler", "3C8", "Chrysler",
            "3CA", "Chrysler", "3D3", "Dodge", "3D5", "Dodge", "3D6", "Dodge", "3D7", "Dodge", "3FA", "Ford", "3FC",
            "Ford", "3FD", "Ford", "3FE", "Ford", "3FR", "Ford", "3FT", "Ford", "3G1", "Chevrolet", "3G2", "Pontiac",
            "3G4", "Buick", "3G5", "Buick", "3G7", "Pontiac", "3GB", "Chevrolet", "3GC", "Chevrolet", "3GD", "GM",
            "3GE", "Chevrolet", "3GK", "GM", "3GN", "Chevrolet", "3GT", "GM", "3GY", "Cadillac", "3HA", "International",
            "3HG", "Honda", "3HM", "Honda", "3HS", "International", "3HT", "International", "3LN", "Lincoln", "3MA",
            "Mercury", "3ME", "Mercury", "3N1", "Nissan", "3NK", "Kenworth", "3NM", "Peterbilt", "3P3", "Plymouth",
            "3TM", "Toyota", "3VW", "Volkswagen", "3WK", "Kenworth", "45V", "Utilimaster", "46G", "Gillig", "49H",
            "Sterling", "4A3", "Mitsubishi", "4A4", "Mitsubishi", "4B3", "Dodge", "4C3", "Chrysler", "4CD", "Oshkosh",
            "4DR", "Genesis", "4E3", "Eagle", "4F2", "Mazda", "4F4", "Mazda", "4G1", "Chevrolet", "4G2", "Pontiac",
            "4GD", "GM", "4GT", "Isuzu", "4JG", "Mercedes-Benz", "4KB", "Chevrolet", "4KD", "GM", "4KL", "Isuzu", "4M2",
            "Mercury", "4N1", "Nissan", "4N2", "Nissan", "4NU", "Isuzu", "4P3", "Plymouth", "4S1", "Isuzu", "4S2",
            "Isuzu", "4S3", "Subaru", "4S4", "Subaru", "4S6", "Honda", "4S7", "Spartan", "4SL", "Magnum", "4T1",
            "Toyota", "4T3", "Toyota", "4TA", "Toyota", "4US", "BMW", "4UZ", "Freightliner", "4V1", "Volvo", "4V2",
            "Volvo", "4V4", "Volvo", "4V5", "Volvo", "4VA", "Volvo", "4VG", "Volvo", "4VH", "Volvo", "4VL", "Volvo",
            "4VM", "Volvo", "4VZ", "Spartan", "5AS", "GEM", "5B4", "Workhorse", "5CK", "Western Star Trucks", "5FN",
            "Honda", "5FY", "New Flyer", "5GA", "Buick", "5GR", "Hummer", "5GT", "Hummer", "5GZ", "Saturn", "5J6",
            "Honda", "5J8", "Acura", "5KJ", "Western Star Trucks", "5KK", "Western Star Trucks", "5LM", "Lincoln",
            "5LT", "Lincoln", "5N1", "Nissan", "5N3", "Infiniti", "5NM", "Hyundai", "5NP", "Hyundai", "5PV", "Hino",
            "5S3", "Saab", "5SX", "Amercian LeFrance", "5T4", "Workhorse", "5TB", "Toyota", "5TD", "Toyota", "5TE",
            "Toyota", "5TF", "Toyota", "5UM", "BMW", "5UX", "BMW", "5Y2", "Pontiac", "6G2", "Pontiac", "6MM",
            "Mitsubishi", "6MP", "Mercury", "9BF", "Ford", "9BW", "Volkswagen", "9DW", "Volkswagen", "J81", "Chevrolet",
            "J87", "Isuzu", "J8B", "Chevrolet", "J8D", "GM", "J8Z", "Chevrolet", "JA3", "Mitsubishi", "JA4",
            "Mitsubishi", "JA7", "Mitsubishi", "JAA", "Isuzu", "JAB", "Isuzu", "JAC", "Isuzu", "JAE", "Acura", "JAL",
            "Isuzu", "JB3", "Dodge", "JB4", "Dodge", "JB7", "Dodge", "JC2", "Ford", "JD1", "Daihatsu", "JD2",
            "Daihatsu", "JE3", "Eagle", "JF1", "Subaru", "JF2", "Subaru", "JF3", "Subaru", "JF4", "Saab", "JG1",
            "Chevrolet", "JG7", "Pontiac", "JGC", "Geo", "JH4", "Acura", "JHB", "Hino", "JHL", "Honda", "JHM", "Honda",
            "JJ3", "Chrysler", "JL6", "Mitsubishi", "JLS", "Sterling", "JM1", "Mazda", "JM2", "Mazda", "JM3", "Mazda",
            "JMZ", "Mazda", "JN1", "Nissan", "JN3", "Nissan", "JN4", "Nissan", "JN6", "Nissan", "JN8", "Nissan", "JNA",
            "Nissan", "JNK", "Infiniti", "JNR", "Infiniti", "JNX", "Infiniti", "JP3", "Plymouth", "JP4", "Plymouth",
            "JP7", "Plymouth", "JR2", "Isuzu", "JS2", "Suzuki", "JS3", "Suzuki", "JS4", "Suzuki", "JT2", "Toyota",
            "JT3", "Toyota", "JT4", "Toyota", "JT5", "Toyota", "JT6", "Lexus", "JT8", "Lexus", "JTD", "Toyota", "JTE",
            "Toyota", "JTH", "Lexus", "JTJ", "Lexus", "JTK", "Scion", "JTL", "Scion", "JTM", "Toyota", "JTN", "Toyota",
            "JW6", "Mitsubishi", "JW7", "Mitsubishi", "KL1", "Chevrolet", "KL2", "Pontiac", "KL5", "Suzuki", "KL7",
            "Asuna", "KLA", "Daewoo", "KM8", "Hyundai", "KMF", "Hyundai", "KMH", "Hyundai", "KNA", "Kia", "KND",
            "Hyundai, Kia", "KNJ", "Ford", "KPH", "Mitsubishi", "LES", "Isuzu", "LM5", "Isuzu", "ML3", "Dodge", "SA9",
            "Morgan", "SAJ", "Jaguar", "SAL", "Land Rover", "SAT", "Triumph", "SAX", "Sterling", "SCA", "Rolls-Royce",
            "SCB", "Bentley", "SCC", "Lotus", "SCF", "Aston Martin", "SHH", "Honda", "SHS", "Honda", "TRU", "Audi",
            "VF1", "Eagle", "VF3", "Peugeot", "VG6", "Mack", "W06", "Cadillac", "WA1", "Audi", "WAU", "Audi", "WBA",
            "BMW", "WBS", "BMW", "WBX", "BMW", "WD0", "Dodge", "WD1", "Dodge", "WD2", "Dodge", "WD5", "Dodge", "WD8",
            "Dodge", "WDB", "Mercedes-Benz", "WDC", "Mercedes-Benz", "WDD", "Mercedes-Benz", "WDP", "Dodge", "WDX",
            "Dodge", "WDY", "Dodge", "WF0", "Ford", "WF1", "Ford", "WKK", "Fahrzeugwerke", "WME450", "Smart", "WME451",
            "Smart", "WME452", "Smart", "WME454", "Smart", "WME", "Mercedes-Benz", "WMW", "Mini", "WP0", "Porsche",
            "WP1", "Porsche", "WUA", "Audi", "WV2", "Volkswagen", "WV3", "Volkswagen", "WVG", "Volkswagen", "WVW",
            "Volkswagen", "XTA", "Lada", "YB3", "Volvo", "YS3", "Saab", "Y53", "Saab", "YV1", "Volvo", "YV2", "Volvo",
            "YV4", "Volvo", "YV5", "Volvo", "ZA9", "Lamborghini", "ZAM", "Maserati", "ZAR", "Alfa Romeo", "ZC2",
            "Chrysler", "ZFA", "Fiat", "ZFF", "Ferrari", "ZHW", "Lamborghini" };

    /* renamed from: ͺ */
    public static final int f1392 = 8;

    /* renamed from: ՙ */
    public static final int f1393 = 23;

    /* renamed from: י */
    public static final int f1394 = 24;

    /* renamed from: ـ */
    public static final int f1395 = 17;

    /* renamed from: ٴ */
    public static final int f1396 = 25;

    /* renamed from: ᐝ */
    public static final int f1397 = 4;

    /* renamed from: ᐧ */
    public static final int f1398 = 18;

    /* renamed from: ᐨ */
    public static final int f1399 = 19;

    /* renamed from: ᴵ */
    public static final int f1400 = 26;

    /* renamed from: ᵎ */
    public static final int f1401 = 27;

    /* renamed from: ᵔ */
    public static final int f1402 = 28;

    /* renamed from: ᵢ */
    public static final int f1403 = 29;

    /* renamed from: ι */
    public static final int f1404 = 9;

    /* renamed from: ⁱ */
    public static final int f1405 = 30;

    /* renamed from: ﹳ */
    public static final int f1406 = 20;

    /* renamed from: ﹶ */
    public static final int f1407 = 31;

    /* renamed from: ﹺ */
    public static final int f1408 = 32;

    /* renamed from: ｰ */
    public static final int f1409 = 33;

    /* renamed from: ﾞ */
    public static final int f1410 = 21;

    /* renamed from: ˊ */
    public static final int m1254(String str) {
        String upperCase = str.toUpperCase();
        for (int i = 0; i < f1391.length; i += 2) {
            if (upperCase.startsWith(f1391[i])) {
                return m1257(f1391[i + 1]);
            }
        }
        return 0;
    }

    /* renamed from: ˊ */
    public static final String m1255(int i) {
        return f1381[i];
    }

    /* renamed from: ˋ */
    public static final String m1256(String str) {
        String upperCase = str.toUpperCase();
        for (int i = 0; i < f1391.length; i += 2) {
            if (upperCase.startsWith(f1391[i])) {
                return f1391[i + 1];
            }
        }
        return C0483.m2490("Unknown", new String[0]);
    }

    /* renamed from: ˎ */
    public static final int m1257(String str) {
        for (int i = 0; i < f1381.length; i++) {
            if (str.toLowerCase().startsWith(f1381[i].toLowerCase())) {
                return i;
            }
        }
        for (int i2 = 0; i2 < f1381.length; i2++) {
            if (str.contains(f1381[i2])) {
                return i2;
            }
        }
        for (int i3 = 0; i3 < f1381.length; i3++) {
            if (str.contains(InternalZipConstants.f103) || str.contains(",")) {
                StringTokenizer stringTokenizer = new StringTokenizer(str, "/,", false);
                while (stringTokenizer.hasMoreElements()) {
                    if (stringTokenizer.nextToken().trim().contains(f1381[i3])) {
                        return i3;
                    }
                }
                continue;
            }
        }
        return 0;
    }
}
