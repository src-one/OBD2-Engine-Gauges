package p001o;

import android.content.Context;
import android.graphics.Canvas;
import java.io.Serializable;
import java.text.NumberFormat;
import org.prowl.torque.landing.FrontPage;
import org.prowl.torque.pid.PID;
import twitter4j.HttpResponseCode;

/* renamed from: o.ᒐ */
public abstract class C0432 implements Serializable {

    /* renamed from: ī */
    public static final int f2468 = 16716420;

    /* renamed from: ĭ */
    public static final int f2469 = 16716421;

    /* renamed from: İ */
    public static final int f2470 = 16716331;

    /* renamed from: ı */
    public static final int f2471 = 10;

    /* renamed from: ĺ */
    public static final int f2472 = 16716422;

    /* renamed from: ļ */
    public static final int f2473 = 16716423;

    /* renamed from: ŀ */
    public static final int f2474 = 16716424;

    /* renamed from: ł */
    public static final int f2475 = 16716426;

    /* renamed from: ŗ */
    public static final int f2476 = 16716432;

    /* renamed from: ſ */
    public static final int f2477 = 16716433;

    /* renamed from: Ɩ */
    public static final int f2478 = 16716332;

    /* renamed from: Ɨ */
    public static final int f2479 = 16716434;

    /* renamed from: ƚ */
    public static final int f2480 = 16716435;

    /* renamed from: ǃ */
    public static final int f2481 = 67;

    /* renamed from: Ǐ */
    public static final int f2482 = 16716436;

    /* renamed from: ǐ */
    public static final int f2483 = 16716437;

    /* renamed from: Ȉ */
    public static final int f2484 = 16716364;

    /* renamed from: Ȋ */
    public static final int f2485 = 16716438;

    /* renamed from: ȋ */
    public static final int f2486 = 16716365;

    /* renamed from: ɨ */
    public static final int f2487 = 16716366;

    /* renamed from: ɩ */
    public static final int f2488 = 40;

    /* renamed from: ɪ */
    public static final int f2489 = 16716367;

    /* renamed from: ɹ */
    public static final int f2490 = 16716333;

    /* renamed from: ɾ */
    public static final int f2491 = 16716368;

    /* renamed from: ɿ */
    public static final int f2492 = 16716369;

    /* renamed from: ʅ */
    public static final int f2493 = 16716439;

    /* renamed from: ʟ */
    public static final int f2494 = 16716370;

    /* renamed from: ʰ */
    public static final int f2495 = 16716371;

    /* renamed from: ʲ */
    public static final int f2496 = 73;

    /* renamed from: ʳ */
    public static final int f2497 = 4;

    /* renamed from: ʴ */
    public static final int f2498 = 5;

    /* renamed from: ʵ */
    public static final int f2499 = 41;

    /* renamed from: ʶ */
    public static final int f2500 = 16716334;

    /* renamed from: ʸ */
    public static final int f2501 = 42;

    /* renamed from: ʺ */
    public static final int f2502 = 97;

    /* renamed from: ʾ */
    public static final Object f2503 = new Object();

    /* renamed from: ʿ */
    public static final String f2504 = "BARO";

    /* renamed from: ˀ */
    public static final int f2505 = 43;

    /* renamed from: ˁ */
    public static final int f2506 = 52;

    /* renamed from: ˆ */
    public static final int f2507 = 6;

    /* renamed from: ˇ */
    public static final int f2508 = 7;

    /* renamed from: ˈ */
    public static final String f2509 = "RANDOM";

    /* renamed from: ˌ */
    public static final String f2510 = "bar";

    /* renamed from: ˍ */
    public static final String f2511 = "graph";

    /* renamed from: ː */
    public static final int f2512 = 74;

    /* renamed from: ˑ */
    public static final String f2513 = "halfmeter";

    /* renamed from: ˡ */
    public static final int f2514 = 8;

    /* renamed from: ˢ */
    public static final int f2515 = 6;

    /* renamed from: ˣ */
    public static final int f2516 = 75;

    /* renamed from: ˤ */
    public static final int f2517 = 7;

    /* renamed from: ˮ */
    public static final int f2518 = 9;

    /* renamed from: Ι */
    public static final int f2519 = 98;

    /* renamed from: Ϊ */
    public static final int f2520 = 16716372;

    /* renamed from: ί */
    public static final int f2521 = 16716440;

    /* renamed from: ι */
    public static final int f2522 = 8;

    /* renamed from: ϊ */
    public static final int f2523 = 16716335;

    /* renamed from: І */
    public static final int f2524 = 99;

    /* renamed from: Ї */
    public static final int f2525 = 16716373;

    /* renamed from: г */
    public static final int f2526 = 16716374;

    /* renamed from: і */
    public static final int f2527 = 16716289;

    /* renamed from: ї */
    public static final int f2528 = 16716290;

    /* renamed from: Ӏ */
    public static final int f2529 = 16716291;

    /* renamed from: ג */
    public static final int f2530 = 16716336;

    /* renamed from: ד */
    public static final int f2531 = 16716441;

    /* renamed from: ו */
    public static final int f2532 = 33;

    /* renamed from: ז */
    public static final int f2533 = 16716337;

    /* renamed from: ן */
    public static final int f2534 = 16716338;

    /* renamed from: נ */
    public static final int f2535 = 16716339;

    /* renamed from: ר */
    public static final int f2536 = 16716340;

    /* renamed from: ױ */
    public static final int f2537 = 16716442;

    /* renamed from: ײ */
    public static final int f2538 = 16716292;

    /* renamed from: د */
    public static final int f2539 = 16716341;

    /* renamed from: ذ */
    public static final int f2540 = 16716375;

    /* renamed from: ـ */
    public static final String f2541 = "meter";

    /* renamed from: ڊ */
    public static final int f2542 = 16716376;

    /* renamed from: ڌ */
    public static final String f2543 = C0483.m2490(C0679.f3931, new String[0]);

    /* renamed from: ڍ */
    public static final String f2544 = C0483.m2490("not ready", new String[0]);

    /* renamed from: ہ */
    public static final int f2545 = 16716342;

    /* renamed from: ۃ */
    public static boolean f2546 = true;

    /* renamed from: ۥ */
    public static final int f2547 = 10;

    /* renamed from: ۦ */
    public static final int f2548 = 49;

    /* renamed from: ܙ */
    public static final int f2549 = 16716377;

    /* renamed from: ܝ */
    public static final int f2550 = 16716343;

    /* renamed from: ৲ */
    public static final int f2551 = 9;

    /* renamed from: ง */
    public static final int f2552 = 16716378;

    /* renamed from: ว */
    public static final int f2553 = 16716379;

    /* renamed from: า */
    public static final int f2554 = 16716344;

    /* renamed from: เ */
    public static final int f2555 = 31;

    /* renamed from: ๅ */
    public static final int f2556 = 16732673;

    /* renamed from: Ꭵ */
    public static final int f2557 = 82;

    /* renamed from: ᐞ */
    public static final int f2558 = 16732674;

    /* renamed from: ᐟ */
    public static final int f2559 = 5;

    /* renamed from: ᐠ */
    public static final int f2560 = 11;

    /* renamed from: ᐡ */
    public static final int f2561 = 17;

    /* renamed from: ᐢ */
    public static final int f2562 = 34;

    /* renamed from: ᐣ */
    public static final int f2563 = 16715781;

    /* renamed from: ᐤ */
    public static final int f2564 = 50;

    /* renamed from: ᐥ */
    public static final int f2565 = 16716345;

    /* renamed from: ᐦ */
    public static final int f2566 = 16716380;

    /* renamed from: ᐧ */
    public static final String f2567 = "readout";

    /* renamed from: ᐩ */
    public static final int f2568 = 16715782;

    /* renamed from: ᐪ */
    public static final int f2569 = 16;

    /* renamed from: ᑉ */
    public static final int f2570 = 16716293;

    /* renamed from: ᑊ */
    public static final int f2571 = 16715783;

    /* renamed from: ᑋ */
    public static final int f2572 = 16716294;

    /* renamed from: ᑦ */
    public static final int f2573 = 16716295;

    /* renamed from: ᒃ */
    public static final int f2574 = 16716346;

    /* renamed from: ᒄ */
    public static final int f2575 = 16716381;

    /* renamed from: ᒡ */
    public static final int f2576 = 20;

    /* renamed from: ᒢ */
    public static final int f2577 = 21;

    /* renamed from: ᒻ */
    public static final int f2578 = 35;

    /* renamed from: ᒼ */
    public static final int f2579 = 16716382;

    /* renamed from: ᒽ */
    public static final int f2580 = 11;

    /* renamed from: ᒾ */
    public static final int f2581 = 16716296;

    /* renamed from: ᓐ */
    public static final int f2582 = 16732675;

    /* renamed from: ᓑ */
    public static final int f2583 = 16716383;

    /* renamed from: ᓒ */
    public static final int f2584 = 16716347;

    /* renamed from: ᓪ */
    public static final int f2585 = 16716297;

    /* renamed from: ᓫ */
    public static final int f2586 = 16716298;

    /* renamed from: ᓭ */
    public static final int f2587 = 16732676;

    /* renamed from: ᓯ */
    public static final int f2588 = 16732677;

    /* renamed from: ᓱ */
    public static final int f2589 = 16748544;

    /* renamed from: ᓴ */
    public static final Object[][] f2590 = {
            new Object[] { Integer.valueOf(4096), Integer.valueOf(f2600), "Speed (GPS)", Float.class, "GPS Spd",
                    Integer.valueOf(0), Integer.valueOf(160), "km/h", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(4096), Integer.valueOf(f2635), "GPS Altitude", Float.class, "GPS Height",
                    Integer.valueOf(0), Integer.valueOf(100), "m", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(4096), Integer.valueOf(f2679), "Acceleration Sensor(Total)", Float.class,
                    "Accel", Integer.valueOf(-1), Integer.valueOf(1), "g", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(4096), Integer.valueOf(f2676), "Acceleration Sensor(Z axis)", Float.class,
                    "Accel(z)", Integer.valueOf(-1), Integer.valueOf(1), "g", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(47), "Fuel Level (From Engine ECU)", Float.class, "Fuel",
                    Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1), Float.valueOf(3.0f),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(5), "Engine Coolant Temperature", Float.class, "Coolant",
                    Integer.valueOf(-40), Integer.valueOf(f2606), "°C", Integer.valueOf(1), Float.valueOf(-15.0f),
                    Float.valueOf(127.0f) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(10), "Fuel pressure", Float.class, "Fuel Pres",
                    Integer.valueOf(0), Integer.valueOf(765), "kPa", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(11), "Intake Manifold Pressure", Float.class, "Intake",
                    Integer.valueOf(0), Integer.valueOf(255), "kPa", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(16), "Mass Air Flow Rate", Float.class, "MAF",
                    Integer.valueOf(0), Integer.valueOf(100), "g/s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(12), "Engine RPM", Float.class, "Revs",
                    Integer.valueOf(0), Integer.valueOf(10000), "rpm", Float.valueOf(1000.0f),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(7000.0f) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(13), "Speed (OBD)", Float.class, "Speed",
                    Integer.valueOf(0), Integer.valueOf(160), "km/h", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(4), "Engine Load", Float.class, "Load",
                    Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(36), "O2 Sensor1 Equivalence Ratio", Float.class,
                    "O2S1Eq", Integer.valueOf(0), Integer.valueOf(2), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(6), "Fuel Trim Bank 1 Short Term", Float.class, "STFT1",
                    Integer.valueOf(-25), Integer.valueOf(25), "%", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(15), "Intake Air Temperature", Float.class, "Intake",
                    Integer.valueOf(-40), Integer.valueOf(60), "°C", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(14), "Timing Advance", Float.class, "Timing Adv",
                    Integer.valueOf(-64), Double.valueOf(63.5d), "°", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(17), "Throttle Position(Manifold)", Float.class,
                    "Throttle", Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(66), "Voltage (Control Module)", Float.class,
                    "Volts(CM)", Integer.valueOf(0), Integer.valueOf(16), "V", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(16.0f) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2527), "Miles Per Gallon(Instant)", Float.class,
                    "MPG", Integer.valueOf(0), Integer.valueOf(100), "mpg", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2528), "Turbo Boost & Vacuum Gauge", Float.class,
                    "Boost", Integer.valueOf(-20), Integer.valueOf(20), "psi", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(38.0f) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2556), "Miles Per Gallon(Long Term Average)",
                    Float.class, "MPG(avg)", Integer.valueOf(0), Integer.valueOf(100), "mpg", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2529), "Kilometers Per Litre(Instant)", Float.class,
                    "KPL", Integer.valueOf(0), Integer.valueOf(100), "kpl", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2558), "Kilometers Per Litre(Long Term Average)",
                    Float.class, "KPL(avg)", Integer.valueOf(0), Integer.valueOf(100), "kpl", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2538), "Trip Distance", Float.class, "Trip",
                    Integer.valueOf(0), Integer.valueOf(HttpResponseCode.f9468j_), "km", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(4096), Integer.valueOf(f2669), "Acceleration Sensor(X axis)", Float.class,
                    "Accel(x)", Integer.valueOf(-1), Integer.valueOf(1), "g", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(4096), Integer.valueOf(f2673), "Acceleration Sensor(Y axis)", Float.class,
                    "Accel(y)", Integer.valueOf(-1), Integer.valueOf(1), "g", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(20), "Fuel trim bank 1 sensor 1", Float.class, "F/T 1x1",
                    Integer.valueOf(-100), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(21), "Fuel trim bank 1 sensor 2", Float.class, "F/T 1x2",
                    Integer.valueOf(-100), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(22), "Fuel trim bank 1 sensor 3", Float.class, "F/T 1x3",
                    Integer.valueOf(-100), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(23), "Fuel trim bank 1 sensor 4", Float.class, "F/T 1x4",
                    Integer.valueOf(-100), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(24), "Fuel trim bank 2 sensor 1", Float.class, "F/T 2x1",
                    Integer.valueOf(-100), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(25), "Fuel trim bank 2 sensor 2", Float.class, "F/T 2x2",
                    Integer.valueOf(-100), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(26), "Fuel trim bank 2 sensor 3", Float.class, "F/T 2x3",
                    Integer.valueOf(-100), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(27), "Fuel trim bank 2 sensor 4", Float.class, "F/T 2x4",
                    Integer.valueOf(-100), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2604), "O2 Volts Bank 1 sensor 1", Float.class,
                    "O2 1x1", Integer.valueOf(0), Double.valueOf(1.3d), "V", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2632), "O2 Volts Bank 1 sensor 2", Float.class,
                    "O2 1x2", Integer.valueOf(0), Double.valueOf(1.3d), "V", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2637), "O2 Volts Bank 1 sensor 3", Float.class,
                    "O2 1x3", Integer.valueOf(0), Double.valueOf(1.3d), "V", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2644), "O2 Volts Bank 1 sensor 4", Float.class,
                    "O2 1x4", Integer.valueOf(0), Double.valueOf(1.3d), "V", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2652), "O2 Volts Bank 2 sensor 1", Float.class,
                    "O2 2x1", Integer.valueOf(0), Double.valueOf(1.3d), "V", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2653), "O2 Volts Bank 2 sensor 2", Float.class,
                    "O2 2x2", Integer.valueOf(0), Double.valueOf(1.3d), "V", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2654), "O2 Volts Bank 2 sensor 3", Float.class,
                    "O2 2x3", Integer.valueOf(0), Double.valueOf(1.3d), "V", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2660), "O2 Volts Bank 2 sensor 4", Float.class,
                    "O2 2x4", Integer.valueOf(0), Double.valueOf(1.3d), "V", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(70), "Ambient air temp", Float.class, "Air temp",
                    Integer.valueOf(-40), Integer.valueOf(50), "°C", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(51), "Barometric pressure (from vehicle)", Float.class,
                    "Baro", Integer.valueOf(0), Integer.valueOf(255), "kPa", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2680), "Torque", Float.class, "Torque",
                    Integer.valueOf(0), Integer.valueOf(100), "ft-lb", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2682), "Horsepower (At the wheels)", Float.class,
                    "HP", Integer.valueOf(0), Integer.valueOf(100), "hp", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2573), "Litres Per 100 Kilometer(Instant)",
                    Float.class, "LPK", Integer.valueOf(0), Integer.valueOf(100), "l/100km", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2582), "Litres Per 100 Kilometer(Long Term Average)",
                    Float.class, "LPK(avg)", Integer.valueOf(0), Integer.valueOf(100), "l/100km", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2490), "0-60mph Time", Float.class, "0-60mph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2500), "0-100kph Time", Float.class, "0-100kph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2523), "1/4 mile time", Float.class, "1/4m time",
                    Integer.valueOf(0), Integer.valueOf(30), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2530), "1/8 mile time", Float.class, "1/8m time",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(44), "EGR Commanded", Float.class, "EGR",
                    Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(45), "EGR Error", Float.class, "EGR Err",
                    Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(16652293), "Transmission Temperature(Method 1)",
                    Float.class, "Trans", Integer.valueOf(0), Integer.valueOf(105), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(7), "Fuel Trim Bank 1 Long Term", Float.class, "LTFT1",
                    Integer.valueOf(-25), Integer.valueOf(25), "%", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(9), "Fuel Trim Bank 2 Long Term", Float.class, "LTFT2",
                    Integer.valueOf(-25), Integer.valueOf(25), "%", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(8), "Fuel Trim Bank 2 Short Term", Float.class, "STFT2",
                    Integer.valueOf(-25), Integer.valueOf(25), "%", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2550), "GPS vs OBD Speed difference", Float.class,
                    "Spd Diff", Integer.valueOf(0), Integer.valueOf(10), "km/h", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(92), "Engine Oil Temperature", Float.class, "Oil Temp",
                    Integer.valueOf(-40), Integer.valueOf(60), "°C", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2554), "Voltage (OBD Adapter)", Float.class,
                    "Volts(Ad)", Integer.valueOf(0), Integer.valueOf(16), "V", Integer.valueOf(1), Float.valueOf(8.0f),
                    Float.valueOf(16.0f) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(35), "Fuel Rail Pressure", Float.class, "Fuel Rail",
                    Integer.valueOf(0), Integer.valueOf(60), "kPa", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(34), "Fuel Rail Pressure (relative to manifold vacuum)",
                    Float.class, "Fuel Rail", Integer.valueOf(0), Integer.valueOf(60), "kPa", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(60), "Catalyst Temperature (Bank 1,Sensor 1)",
                    Float.class, "Cat B1S1", Integer.valueOf(0), Integer.valueOf(60), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(61), "Catalyst Temperature (Bank 2,Sensor 1)",
                    Float.class, "Cat B2S1", Integer.valueOf(0), Integer.valueOf(60), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(62), "Catalyst Temperature (Bank 1,Sensor 2)",
                    Float.class, "Cat B1S2", Integer.valueOf(0), Integer.valueOf(60), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(63), "Catalyst Temperature (Bank 2,Sensor 2)",
                    Float.class, "Cat B2S2", Integer.valueOf(0), Integer.valueOf(60), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(4096), Integer.valueOf(f2584), "GPS Bearing", Float.class, "GPS Brng",
                    Integer.valueOf(0), Integer.valueOf(360), "°", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(4096), Integer.valueOf(f2565), "GPS Accuracy", Float.class, "GPS Acc",
                    Integer.valueOf(0), Integer.valueOf(100), "m", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(4096), Integer.valueOf(f2574), "GPS Satellites", Float.class, "GPS Sat",
                    Integer.valueOf(0), Integer.valueOf(10), "", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2668), "Transmission Temperature(Method 2)",
                    Float.class, "Trans", Integer.valueOf(0), Integer.valueOf(105), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2602), "Trip distance (stored in vehicle profile)",
                    Float.class, "Odo", Integer.valueOf(0), Integer.valueOf(100), "km", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(37), "O2 Sensor2 Equivalence Ratio", Float.class,
                    "O2S2Eq", Integer.valueOf(0), Integer.valueOf(2), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(38), "O2 Sensor3 Equivalence Ratio", Float.class,
                    "O2S3Eq", Integer.valueOf(0), Integer.valueOf(2), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(39), "O2 Sensor4 Equivalence Ratio", Float.class,
                    "O2S4Eq", Integer.valueOf(0), Integer.valueOf(2), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(40), "O2 Sensor5 Equivalence Ratio", Float.class,
                    "O2S5Eq", Integer.valueOf(0), Integer.valueOf(2), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(41), "O2 Sensor6 Equivalence Ratio", Float.class,
                    "O2S6Eq", Integer.valueOf(0), Integer.valueOf(2), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(42), "O2 Sensor7 Equivalence Ratio", Float.class,
                    "O2S7Eq", Integer.valueOf(0), Integer.valueOf(2), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(43), "O2 Sensor8 Equivalence Ratio", Float.class,
                    "O2S8Eq", Integer.valueOf(0), Integer.valueOf(2), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2610), "O2 Sensor1 wide-range Voltage", Float.class,
                    "O2S1LV", Integer.valueOf(0), Integer.valueOf(8), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2611), "O2 Sensor2 wide-range Voltage", Float.class,
                    "O2S2LV", Integer.valueOf(0), Integer.valueOf(8), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2618), "O2 Sensor3 wide-range Voltage", Float.class,
                    "O2S3LV", Integer.valueOf(0), Integer.valueOf(8), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2631), "O2 Sensor4 wide-range Voltage", Float.class,
                    "O2S4LV", Integer.valueOf(0), Integer.valueOf(8), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2655), "O2 Sensor5 wide-range Voltage", Float.class,
                    "O2S5LV", Integer.valueOf(0), Integer.valueOf(8), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2671), "O2 Sensor6 wide-range Voltage", Float.class,
                    "O2S6LV", Integer.valueOf(0), Integer.valueOf(8), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2695), "O2 Sensor7 wide-range Voltage", Float.class,
                    "O2S7LV", Integer.valueOf(0), Integer.valueOf(8), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2698), "O2 Sensor8 wide-range Voltage", Float.class,
                    "O2S8LV", Integer.valueOf(0), Integer.valueOf(8), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(52), "O2 Sensor1 Equivalence Ratio(alternate)",
                    Float.class, "O2S1Eq", Integer.valueOf(0), Integer.valueOf(2), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(68), "Commanded Equivalence Ratio(lambda)", Float.class,
                    "COMEQR", Integer.valueOf(0), Integer.valueOf(2), "", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2699), "Air Fuel Ratio(Measured)", Float.class,
                    "AFR(m)", Integer.valueOf(0), Integer.valueOf(30), ":1", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2486), "Air Fuel Ratio(Commanded)", Float.class,
                    "AFR(c)", Integer.valueOf(0), Integer.valueOf(30), ":1", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2606), "Exhaust gas temp Bank 1 Sensor 1", Float.class,
                    "EGTB1S1", Integer.valueOf(0), Integer.valueOf(600), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2609), "Exhaust gas temp Bank 2 Sensor 1", Float.class,
                    "EGTB2S1", Integer.valueOf(0), Integer.valueOf(600), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(90), "Relative Accelerator Pedal Position", Float.class,
                    "R ACC", Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(69), "Relative Throttle Position", Float.class, "R THR",
                    Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(71), "Absolute Throttle Position B", Float.class,
                    "A THR2", Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(73), "Accelerator PedalPosition D", Float.class,
                    "PedalD", Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(74), "Accelerator PedalPosition E", Float.class,
                    "PedalE", Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(75), "Accelerator PedalPosition F", Float.class,
                    "PedalF", Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(50), "Evap System Vapour Pressure", Float.class, "EvapP",
                    Integer.valueOf(0), Integer.valueOf(C0301.f1699), "Pa", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2542), "CO₂ in g/km (Average)", Float.class,
                    "Av.CO₂", Integer.valueOf(0), Integer.valueOf(f2606), "g/km", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2540), "CO₂ in g/km (Instantaneous)", Float.class,
                    "CO₂", Integer.valueOf(0), Integer.valueOf(f2606), "g/km", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2489), "0-200kph Time", Float.class, "0-200kph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2570), "Trip average MPG", Float.class, "Trip MPG",
                    Integer.valueOf(0), Integer.valueOf(100), "mpg", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2572), "Trip average KPL", Float.class, "Trip KPL",
                    Integer.valueOf(0), Integer.valueOf(100), "kpl", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2581), "Trip average Litres/100 KM", Float.class,
                    "Trip LPK", Integer.valueOf(0), Integer.valueOf(100), "l/100km", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2552), "Fuel flow rate/minute", Float.class,
                    "Fuel Flow", Integer.valueOf(0), Integer.valueOf(100), "cc/min", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2575), "Fuel flow rate/hour", Float.class,
                    "Fuel Flow", Integer.valueOf(0), Integer.valueOf(100), "l/hr", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2658), "Fuel used (trip)", Float.class, "Fuel Used",
                    Integer.valueOf(0), Integer.valueOf(100), "l", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2566), "Fuel cost (trip)", Float.class, "Fuel Cost",
                    Integer.valueOf(0), Integer.valueOf(100), "cost", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2579), "60-120mph Time", Float.class, "60-120mph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2592), "40-60mph Time", Float.class, "40-60mph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2583), "60-80mph Time", Float.class, "60-80mph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2612), "80-100mph Time", Float.class, "80-100mph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2666), "80-120kph Time", Float.class, "80-120kph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2667), "60-130mph Time", Float.class, "60-130mph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2614), "Average trip speed(whilst moving only)",
                    Float.class, "TripMSpeed", Integer.valueOf(0), Integer.valueOf(16), "km/h", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2620), "100-0kph Time", Float.class, "100-0mph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2622), "60-0mph Time", Float.class, "60-0mph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2623), "Trip Time(Since journey start)", Float.class,
                    "TripTime", Integer.valueOf(0), Integer.valueOf(100), "s", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2625), "Trip time(whilst stationary)", Float.class,
                    "Stopped", Integer.valueOf(0), Integer.valueOf(100), "s", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2626), "Trip time(whilst moving)", Float.class,
                    "Moving", Integer.valueOf(0), Integer.valueOf(100), "s", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2627), "Volumetric Efficiency (Calculated)",
                    Float.class, "Vol.Eff.", Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2647),
                    "Fuel Remaining (Calculated from vehicle profile)", Float.class, "Fuel Rem", Integer.valueOf(0),
                    Integer.valueOf(100), "%", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2641), "Distance to empty (Estimated)", Float.class,
                    "Dist Empt.", Integer.valueOf(0), Integer.valueOf(100), "km", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2649), "Cost per mile/km (Instant)", Float.class,
                    "Cost", Integer.valueOf(0), Integer.valueOf(100), C0248.f1351 + "/km", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2650), "Cost per mile/km (Trip)", Float.class,
                    "Tr.Cost", Integer.valueOf(0), Integer.valueOf(100), C0248.f1351 + "/km", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(67), "Engine Load(Absolute)", Float.class, "Abs Load",
                    Integer.valueOf(0), Integer.valueOf(20000), "%", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2657), "Barometer (on Android device)", Float.class,
                    "Baro", Integer.valueOf(800), Integer.valueOf(1100), "mb", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2659),
                    "Average trip speed(whilst stopped or moving)", Float.class, "Trip Speed", Integer.valueOf(0),
                    Integer.valueOf(16), "km/h", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2662), "Engine kW (At the wheels)", Float.class,
                    "Power", Integer.valueOf(0), Integer.valueOf(100), "kW", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(82), "Ethanol Fuel %", Float.class, "Ethanol",
                    Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(33), "Distance travelled with MIL/CEL lit", Float.class,
                    "MIL On", Integer.valueOf(0), Integer.valueOf(100), "km", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(49), "Distance travelled since codes cleared",
                    Float.class, "MIL Off", Integer.valueOf(0), Integer.valueOf(100), "km", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(31), "Run time since engine start", Float.class,
                    "RunTime", Integer.valueOf(0), Integer.valueOf(100), "s", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2670), "0-30mph Time", Float.class, "0-30mph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2563), "GPS Longitude", Float.class, "GPSLon",
                    Integer.valueOf(0), Integer.valueOf(100), "°", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2568), "GPS Latitude", Float.class, "GPSLat",
                    Integer.valueOf(0), Integer.valueOf(100), "°", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(39321), Integer.valueOf(3), "Fuel Status", Float.class, "Fuel Status",
                    Integer.valueOf(800), Integer.valueOf(1100), "byte", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(39321), Integer.valueOf(18), "Air Status", Float.class, "Air Status",
                    Integer.valueOf(800), Integer.valueOf(1100), "byte", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(39321), Integer.valueOf(f2702), "Tilt(x)", Float.class, "Tilt(x)",
                    Integer.valueOf(0), Integer.valueOf(360), "°", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(39321), Integer.valueOf(f2706), "Tilt(y)", Float.class, "Tilt(y)",
                    Integer.valueOf(0), Integer.valueOf(360), "°", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(39321), Integer.valueOf(f2484), "Tilt(z)", Float.class, "Tilt(z)",
                    Integer.valueOf(0), Integer.valueOf(360), "°", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2701), "DPF Temperature", Float.class, "DPFTemp",
                    Integer.valueOf(0), Integer.valueOf(600), "°C", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(91), "Hybrid Battery Charge (%)", Float.class, "HBATT",
                    Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(94), "Fuel Rate (direct from ECU)", Float.class,
                    "FuelRate", Integer.valueOf(0), Integer.valueOf(100), "L/m", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2672), "0-100mph Time", Float.class, "0-100mph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(97), "Drivers demand engine % torque", Float.class,
                    "DmTorq", Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(98), "Actual engine % torque", Float.class, "ActTorq",
                    Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(99), "Engine reference torque", Float.class, "RefTorq",
                    Integer.valueOf(0), Integer.valueOf(100), "Nm", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2700), "Exhaust gas temp Bank 1 Sensor 2",
                    Float.class, "EGTB1S2", Integer.valueOf(0), Integer.valueOf(1400), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2704), "Exhaust gas temp Bank 1 Sensor 3",
                    Float.class, "EGTB1S3", Integer.valueOf(0), Integer.valueOf(1400), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2468), "Exhaust gas temp Bank 1 Sensor 4",
                    Float.class, "EGTB1S4", Integer.valueOf(0), Integer.valueOf(1400), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2472), "Exhaust gas temp Bank 2 Sensor 2",
                    Float.class, "EGTB2S2", Integer.valueOf(0), Integer.valueOf(1400), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2473), "Exhaust gas temp Bank 2 Sensor 3",
                    Float.class, "EGTB2S3", Integer.valueOf(0), Integer.valueOf(1400), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2474), "Exhaust gas temp Bank 2 Sensor 4",
                    Float.class, "EGTB2S4", Integer.valueOf(0), Integer.valueOf(1400), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2675), "Charge air cooler temperature (CACT)",
                    Float.class, "CACT", Integer.valueOf(0), Integer.valueOf(100), "°C", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2677), "Turbo Pressure Control", Float.class, "TurboPC",
                    Integer.valueOf(0), Integer.valueOf(35), "psi", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2681), "Exhaust Pressure", Float.class, "ExhPres",
                    Integer.valueOf(0), Integer.valueOf(45), "psi", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2688), "DPF Pressure", Float.class, "DPFPres",
                    Integer.valueOf(0), Integer.valueOf(5), "psi", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(1), Integer.valueOf(f2693), "NOx Pre SCR", Float.class, "NOxPre",
                    Integer.valueOf(0), Integer.valueOf(C0301.f1699), "ppm", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2475), "NOx Post SCR", Float.class, "NOxPost",
                    Integer.valueOf(0), Integer.valueOf(C0301.f1699), "ppm", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2674), "100-200kph Time", Float.class, "100-200kph",
                    Integer.valueOf(0), Integer.valueOf(16), "s", Integer.valueOf(1), Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2485), "Percentage of City driving", Float.class,
                    "%City", Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2521), "Percentage of Idle driving", Float.class,
                    "%Idle", Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2493), "Percentage of Highway driving", Float.class,
                    "%Hgwy", Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(39321), Integer.valueOf(f2491), "Acceleration Sensor(X axis damped)",
                    Float.class, "AccD(x)", Integer.valueOf(0), Integer.valueOf(360), "g", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(39321), Integer.valueOf(f2492), "Acceleration Sensor(Y axis damped)",
                    Float.class, "AccD(y)", Integer.valueOf(0), Integer.valueOf(360), "g", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(39321), Integer.valueOf(f2494), "Acceleration Sensor(Z axis damped)",
                    Float.class, "AccD(z)", Integer.valueOf(0), Integer.valueOf(360), "g", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(39321), Integer.valueOf(f2531), "Android device rotation", Float.class,
                    "Rotation", Integer.valueOf(0), Integer.valueOf(360), "°", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) },
            new Object[] { Integer.valueOf(8192), Integer.valueOf(f2537), "Android device Battery Level", Float.class,
                    "BATLVL", Integer.valueOf(0), Integer.valueOf(100), "%", Integer.valueOf(1),
                    Float.valueOf(Float.MIN_VALUE), Float.valueOf(Float.MAX_VALUE) } };

    /* renamed from: ᔅ */
    public static final int f2591 = 44;

    /* renamed from: ᔆ */
    public static final int f2592 = 16716384;

    /* renamed from: ᔇ */
    public static final int f2593 = 15;

    /* renamed from: ᔈ */
    public static final int f2594 = 47;

    /* renamed from: ᔉ */
    public static final int f2595 = 45;

    /* renamed from: ᔊ */
    public static final int f2596 = 60;

    /* renamed from: ᔋ */
    public static final int f2597 = 61;

    /* renamed from: ᔥ */
    public static final long[] f2598 = new long[f2590.length];

    /* renamed from: ᔾ */
    public static final int f2599 = 16716299;

    /* renamed from: ᕀ */
    public static final int f2600 = 16715777;

    /* renamed from: ᕁ */
    public static final int f2601 = 62;

    /* renamed from: ᕐ */
    public static final int f2602 = 16716300;

    /* renamed from: ᕑ */
    public static final int f2603 = 63;

    /* renamed from: ᕝ */
    public static final int f2604 = 16716308;

    /* renamed from: ᕪ */
    public static final int f2605 = 16716348;

    /* renamed from: ᕽ */
    public static final int f2606 = 120;

    /* renamed from: ᖮ */
    public static final int f2607 = 22;

    /* renamed from: ᗮ */
    public static final int f2608 = 14;

    /* renamed from: ᘁ */
    public static final int f2609 = 121;

    /* renamed from: ᙆ */
    public static final int f2610 = 16716352;

    /* renamed from: ᴊ */
    public static final int f2611 = 16716353;

    /* renamed from: ᴖ */
    public static final int f2612 = 16716385;

    /* renamed from: ᴬ */
    public static final int f2613 = 16716386;

    /* renamed from: ᴱ */
    public static final int f2614 = 16716387;

    /* renamed from: ᴲ */
    public static final Integer f2615 = Integer.valueOf(f2614);

    /* renamed from: ᴵ */
    public static final String f2616 = "7";

    /* renamed from: ᴶ */
    public static final int f2617 = 70;

    /* renamed from: ᴷ */
    public static final int f2618 = 16716354;

    /* renamed from: ᴸ */
    public static final int f2619 = 51;

    /* renamed from: ᴾ */
    public static final int f2620 = 16716388;

    /* renamed from: ᵀ */
    public static final int f2621 = 65;

    /* renamed from: ᵁ */
    public static final int f2622 = 16716389;

    /* renamed from: ᵃ */
    public static final int f2623 = 16716390;

    /* renamed from: ᵄ */
    public static final int f2624 = 92;

    /* renamed from: ᵅ */
    public static final int f2625 = 16716391;

    /* renamed from: ᵉ */
    public static final int f2626 = 16716392;

    /* renamed from: ᵊ */
    public static final int f2627 = 16716393;

    /* renamed from: ᵋ */
    public static final int f2628 = 1;

    /* renamed from: ᵌ */
    public static final int f2629 = 23;

    /* renamed from: ᵎ */
    public static final String f2630 = "8";

    /* renamed from: ᵏ */
    public static final int f2631 = 16716355;

    /* renamed from: ᵒ */
    public static final int f2632 = 16716309;

    /* renamed from: ᵓ */
    public static final int f2633 = 24;

    /* renamed from: ᵔ */
    public static final String f2634 = "11";

    /* renamed from: ᵕ */
    public static final int f2635 = 16715792;

    /* renamed from: ᵗ */
    public static final int f2636 = 3;

    /* renamed from: ᵘ */
    public static final int f2637 = 16716310;

    /* renamed from: ᵙ */
    public static final int f2638 = 25;

    /* renamed from: ᵛ */
    public static final int f2639 = 26;

    /* renamed from: ᵞ */
    public static final int f2640 = 93;

    /* renamed from: ᵡ */
    public static final int f2641 = 16716394;

    /* renamed from: ᵢ */
    public static final int f2642 = 55;

    /* renamed from: ᵣ */
    public static final int f2643 = 13;

    /* renamed from: ᵤ */
    public static final int f2644 = 16716311;

    /* renamed from: ᵥ */
    public static final int f2645 = 27;

    /* renamed from: ᵧ */
    public static final int f2646 = 94;

    /* renamed from: ᵪ */
    public static final int f2647 = 16716395;

    /* renamed from: ḯ */
    public static final int f2648 = 16716396;

    /* renamed from: Ị */
    public static final int f2649 = 16716397;

    /* renamed from: ị */
    public static final int f2650 = 16716398;

    /* renamed from: ⁱ */
    public static final int f2651 = 0;

    /* renamed from: ⁿ */
    public static final int f2652 = 16716312;

    /* renamed from: Ⅰ */
    public static final int f2653 = 16716313;

    /* renamed from: ⅰ */
    public static final int f2654 = 16716314;

    /* renamed from: ⅼ */
    public static final int f2655 = 16716356;

    /* renamed from: ゝ */
    public static final int f2656 = 16716399;

    /* renamed from: ー */
    public static final int f2657 = 16716400;

    /* renamed from: ヽ */
    public static final int f2658 = 16716401;

    /* renamed from: 一 */
    public static final int f2659 = 16716402;

    /* renamed from: 丶 */
    public static final int f2660 = 16716315;

    /* renamed from: יִ */
    public static final int f2661 = 12;

    /* renamed from: גּ */
    public static final int f2662 = 16716403;

    /* renamed from: וּ */
    public static final int f2663 = 92;

    /* renamed from: זּ */
    public static final int f2664 = 16716404;

    /* renamed from: יּ */
    public static final int f2665 = 4;

    /* renamed from: נּ */
    public static final int f2666 = 16716405;

    /* renamed from: רּ */
    public static final int f2667 = 16716406;

    /* renamed from: וֹ */
    public static final int f2668 = 180;

    /* renamed from: ﭔ */
    public static final int f2669 = 16716320;

    /* renamed from: ﭕ */
    public static final int f2670 = 16716407;

    /* renamed from: ﭘ */
    public static final int f2671 = 16716357;

    /* renamed from: ﭜ */
    public static final int f2672 = 16716408;

    /* renamed from: ﭠ */
    public static final int f2673 = 16716321;

    /* renamed from: ﭡ */
    public static final int f2674 = 16716416;

    /* renamed from: ﭤ */
    public static final int f2675 = 119;

    /* renamed from: ﯦ */
    public static final int f2676 = 16716322;

    /* renamed from: ﯧ */
    public static final int f2677 = 112;

    /* renamed from: ﯨ */
    public static final int f2678 = 36;

    /* renamed from: ﯩ */
    public static final int f2679 = 16716323;

    /* renamed from: ﯾ */
    public static final int f2680 = 16716325;

    /* renamed from: ﯿ */
    public static final int f2681 = 115;

    /* renamed from: ﹰ */
    public static final int f2682 = 16716326;

    /* renamed from: ﹲ */
    public static final int f2683 = 68;

    /* renamed from: ﹴ */
    public static final int f2684 = 37;

    /* renamed from: ﹶ */
    public static final int f2685 = 1;

    /* renamed from: ﹷ */
    public static final int f2686 = 69;

    /* renamed from: ﹸ */
    public static final int f2687 = 38;

    /* renamed from: ﹹ */
    public static final int f2688 = 122;

    /* renamed from: ﹺ */
    public static final int f2689 = 2;

    /* renamed from: ﹻ */
    public static final int f2690 = 71;

    /* renamed from: ﹼ */
    public static final int f2691 = 90;

    /* renamed from: ﹾ */
    public static final int f2692 = 39;

    /* renamed from: ﹿ */
    public static final int f2693 = 131;

    /* renamed from: ﺑ */
    public static final int f2694 = 91;

    /* renamed from: ﺒ */
    public static final int f2695 = 16716358;

    /* renamed from: ﺗ */
    public static final int f2696 = 16716327;

    /* renamed from: ﺘ */
    public static final int f2697 = 16716417;

    /* renamed from: ﺛ */
    public static final int f2698 = 16716359;

    /* renamed from: ﺩ */
    public static final int f2699 = 16716361;

    /* renamed from: ﺫ */
    public static final int f2700 = 16716418;

    /* renamed from: ﻧ */
    public static final int f2701 = 124;

    /* renamed from: ﻨ */
    public static final int f2702 = 16716362;

    /* renamed from: ﻳ */
    public static final int f2703 = 16716328;

    /* renamed from: ﻴ */
    public static final int f2704 = 16716419;

    /* renamed from: ＿ */
    public static final int f2705 = 16716329;

    /* renamed from: ｨ */
    public static final int f2706 = 16716363;

    /* renamed from: ｰ */
    public static final int f2707 = 3;

    /* renamed from: ﾆ */
    public static final int f2708 = 16716330;

    /* renamed from: ﾟ */
    public static final int f2709 = 18;

    /* renamed from: ľ */
    public boolean f2710 = false;

    /* renamed from: ǀ */
    protected float f2711 = 0.0f;

    /* renamed from: ɔ */
    protected float f2712 = 0.0f;

    /* renamed from: ɟ */
    protected float f2713 = 1.0f;

    /* renamed from: ɺ */
    protected boolean f2714 = false;

    /* renamed from: ʹ */
    public String f2715;

    /* renamed from: ˉ */
    protected float f2716 = Float.MIN_VALUE;

    /* renamed from: ˊ */
    private String f2717 = "";

    /* renamed from: ˋ */
    private String f2718 = "";

    /* renamed from: ˎ */
    private String f2719 = "";

    /* renamed from: ՙ */
    public int f2720 = -9999;

    /* renamed from: י */
    public int f2721 = -9999;

    /* renamed from: ٴ */
    public float f2722 = 1.0f;

    /* renamed from: ৳ */
    public boolean f2723 = false;

    /* renamed from: ฯ */
    protected float f2724 = 1.0f;

    /* renamed from: ᐨ */
    public float f2725 = 0.0f;

    /* renamed from: ᖦ */
    protected float f2726 = 0.0f;

    /* renamed from: ᴗ */
    protected float f2727 = 0.0f;

    /* renamed from: ᴴ */
    public float f2728 = Float.MAX_VALUE;

    /* renamed from: ᴿ */
    public float f2729 = Float.MIN_VALUE;

    /* renamed from: ᵇ */
    public C0816 f2730;

    /* renamed from: ᵖ */
    protected float f2731 = 0.0f;

    /* renamed from: ᵟ */
    protected float f2732 = Float.MAX_VALUE;

    /* renamed from: ḷ */
    protected Float f2733 = Float.valueOf(0.0f);

    /* renamed from: ṙ */
    protected float f2734 = 0.0f;

    /* renamed from: ṛ */
    protected float f2735 = Float.MIN_VALUE;

    /* renamed from: ỉ */
    protected float f2736 = Float.MAX_VALUE;

    /* renamed from: ἰ */
    protected float f2737 = -2.14748365E9f;

    /* renamed from: ἱ */
    protected float f2738 = 2.14748365E9f;

    /* renamed from: ὶ */
    protected float f2739 = Float.MAX_VALUE;

    /* renamed from: ί */
    protected float f2740 = 0.0f;

    /* renamed from: ῐ */
    protected float f2741 = 0.0f;

    /* renamed from: ῑ */
    protected float f2742 = 0.0f;

    /* renamed from: ‿ */
    protected float f2743 = 0.0f;

    /* renamed from: ⁀ */
    protected float f2744 = 0.0f;

    /* renamed from: ⁔ */
    protected float f2745 = 0.0f;

    /* renamed from: 丨 */
    protected float f2746 = 0.0f;

    /* renamed from: 氵 */
    protected float f2747 = 0.0f;

    /* renamed from: 灬 */
    protected float f2748 = 0.0f;

    /* renamed from: ﭙ */
    protected boolean f2749 = false;

    /* renamed from: ﮂ */
    protected Integer f2750 = Integer.valueOf(-1);

    /* renamed from: ﮄ */
    protected float f2751 = 0.0f;

    /* renamed from: ﹳ */
    public long f2752 = 0;

    /* renamed from: ﹽ */
    protected float f2753 = 0.0f;

    /* renamed from: ﺋ */
    protected int f2754;

    /* renamed from: ﺜ */
    protected float f2755 = 0.0f;

    /* renamed from: ﻟ */
    public int f2756;

    /* renamed from: ﾉ */
    public int f2757 = 0;

    /* renamed from: ﾞ */
    public PID f2758;

    /* renamed from: ʴ */
    public static final boolean m2129() {
        return (System.currentTimeMillis() / 300) % 6 < 3;
    }

    /* renamed from: ʼ */
    public static final int m2130(int i) {
        switch (i) {
            case 5:
            case 15:
            case f2617 /* 70 */:
                return "°C".equals(C0248.m1236("°C")) ? 0 : 1;
            case 12:
                return 0;
            case 13:
                return "km/h".equals(C0248.m1236("km/h")) ? 0 : 0;
            default:
                String r2 = m2132(Integer.valueOf(i));
                if ("mph".equals(r2)) {
                    return 0;
                }
                if ("km/h".equals(r2)) {
                    return 0;
                }
                if ("psi".equals(r2)) {
                    return 2;
                }
                if ("miles".equals(r2)) {
                    return 2;
                }
                if ("km".equals(r2)) {
                    return 2;
                }
                if ("%".equals(r2)) {
                    return 2;
                }
                return "s".equals(r2) ? 2 : -1;
        }
    }

    /* renamed from: ˆ */
    public static final boolean m2131() {
        return (System.currentTimeMillis() / 200) % 4 < 2;
    }

    /* renamed from: ˋ */
    public static final String m2132(Integer num) {
        Object[][] objArr;
        for (Object[] objArr2 : f2590) {
            if (objArr2[1].equals(num)) {
                return String.valueOf(objArr2[7]);
            }
        }
        return null;
    }

    /* renamed from: ˎ */
    public static final String m2133(int i) {
        switch (i) {
            case 17:
                return "http://torque-bhp.com/wiki/Throttle_Position";
            case f2527 /* 16716289 */:
            case f2529 /* 16716291 */:
            case f2573 /* 16716295 */:
                return "http://torque-bhp.com/wiki/MPG";
            case f2528 /* 16716290 */:
                return "http://torque-bhp.com/wiki/Boost";
            case f2680 /* 16716325 */:
                return "http://torque-bhp.com/wiki/Horsepower";
            case f2682 /* 16716326 */:
                return "http://torque-bhp.com/wiki/Horsepower";
            case f2699 /* 16716361 */:
                return "http://torque-bhp.com/wiki/Air_Fuel_Ratio(Measured)";
            case f2540 /* 16716375 */:
                return "http://torque-bhp.com/wiki/CO2";
            case f2566 /* 16716380 */:
                return "http://torque-bhp.com/wiki/Trip_Fuel_Cost";
            case f2627 /* 16716393 */:
                return "http://torque-bhp.com/wiki/Volumetric_Efficiency";
            case f2641 /* 16716394 */:
                return "http://torque-bhp.com/wiki/Distance_to_Empty";
            case f2647 /* 16716395 */:
                return "http://torque-bhp.com/wiki/Fuel_Remaining";
            case f2662 /* 16716403 */:
                return "http://torque-bhp.com/wiki/Horsepower";
            default:
                return null;
        }
    }

    /* renamed from: ˏ */
    public static final String m2134(int i) {
        switch (i) {
            case f2502 /* 97 */:
                return "Drivers demand engine % torque";
            case f2519 /* 98 */:
                return "Actual engine % torque";
            case 99:
                return "Engine reference torque";
            case f2600 /* 16715777 */:
                return "GPS Speed";
            case f2563 /* 16715781 */:
                return "GPS Longitude";
            case f2568 /* 16715782 */:
                return "GPS Latitude";
            case f2571 /* 16715783 */:
                return "GPS Bearing";
            case f2635 /* 16715792 */:
                return "Altitude(GPS)";
            case f2527 /* 16716289 */:
                return "MPG";
            case f2528 /* 16716290 */:
                return "Boost";
            case f2529 /* 16716291 */:
                return "KPL";
            case f2538 /* 16716292 */:
                return "Trip Distance";
            case f2570 /* 16716293 */:
                return "Trip mpg";
            case f2572 /* 16716294 */:
                return "Trip kpl";
            case f2581 /* 16716296 */:
                return "Trip LPK";
            case f2585 /* 16716297 */:
                return "Fuel Consumed (This trip)";
            case f2586 /* 16716298 */:
                return "Vacuum";
            case f2599 /* 16716299 */:
                return "Trip Distance(GPS)";
            case f2604 /* 16716308 */:
                return "O2 Sensor 1x1";
            case f2632 /* 16716309 */:
                return "O2 Sensor 1x2";
            case f2637 /* 16716310 */:
                return "O2 Sensor 1x3";
            case f2644 /* 16716311 */:
                return "O2 Sensor 1x4";
            case f2652 /* 16716312 */:
                return "O2 Sensor 2x1";
            case f2653 /* 16716313 */:
                return "O2 Sensor 2x2";
            case f2654 /* 16716314 */:
                return "O2 Sensor 2x3";
            case f2660 /* 16716315 */:
                return "O2 Sensor 2x4";
            case f2669 /* 16716320 */:
                return "Accelerometer (X)";
            case f2673 /* 16716321 */:
                return "Accelerometer (Y)";
            case f2676 /* 16716322 */:
                return "Accelerometer (Z)";
            case f2679 /* 16716323 */:
                return "Accelerometer (Total)";
            case f2680 /* 16716325 */:
                return "Torque";
            case f2682 /* 16716326 */:
                return "HP";
            case f2696 /* 16716327 */:
                return "Drive Cycle RAW data (A)";
            case f2703 /* 16716328 */:
                return "Drive Cycle RAW data (B)";
            case f2705 /* 16716329 */:
                return "Drive Cycle RAW data (C)";
            case f2708 /* 16716330 */:
                return "Drive Cycle RAW data (D)";
            case f2470 /* 16716331 */:
                return "Fuel Status RAW data(A)";
            case f2478 /* 16716332 */:
                return "Air Status RAW data(A)";
            case f2490 /* 16716333 */:
                return "0-60mph time";
            case f2500 /* 16716334 */:
                return "0-100kph time";
            case f2523 /* 16716335 */:
                return "Quarter mile time";
            case f2530 /* 16716336 */:
                return "Eighth mile time";
            case f2539 /* 16716341 */:
                return "ECO Value";
            case f2545 /* 16716342 */:
                return "ECO Value (Avg)";
            case f2550 /* 16716343 */:
                return "GPS vs OBD speed difference";
            case f2554 /* 16716344 */:
                return "Voltage";
            case f2565 /* 16716345 */:
                return "GPS Precision (meters)";
            case f2574 /* 16716346 */:
                return "GPS Satellite lock count";
            case f2584 /* 16716347 */:
                return "GPS Bearing";
            case f2610 /* 16716352 */:
                return "O2S1 Equiv Ratio";
            case f2611 /* 16716353 */:
                return "O2S2 Equiv Ratio";
            case f2618 /* 16716354 */:
                return "O2S3 Equiv Ratio";
            case f2631 /* 16716355 */:
                return "O2S4 Equiv Ratio";
            case f2655 /* 16716356 */:
                return "O2S5 Equiv Ratio";
            case f2671 /* 16716357 */:
                return "O2S6 Equiv Ratio";
            case f2695 /* 16716358 */:
                return "O2S7 Equiv Ratio";
            case f2698 /* 16716359 */:
                return "O2S8 Equiv Ratio";
            case f2699 /* 16716361 */:
                return "Air Fuel Ratio";
            case f2702 /* 16716362 */:
                return "Tilt (X)";
            case f2706 /* 16716363 */:
                return "Tilt (Y)";
            case f2484 /* 16716364 */:
                return "Tilt (Z)";
            case f2486 /* 16716365 */:
                return "Air Fuel Ratio (alt)";
            case f2487 /* 16716366 */:
                return "Compass Bearing(GPS)";
            case f2489 /* 16716367 */:
                return "0-200kph time";
            case f2491 /* 16716368 */:
                return "Acceleromter (X) Filtered";
            case f2492 /* 16716369 */:
                return "Acceleromter (Y) Filtered";
            case f2494 /* 16716370 */:
                return "Acceleromter (Z) Filtered";
            case f2495 /* 16716371 */:
                return "Quarter mile speed";
            case f2520 /* 16716372 */:
                return "Eighth mile speed";
            case f2525 /* 16716373 */:
                return "Max Torque RPM";
            case f2526 /* 16716374 */:
                return "Max HP RPM";
            case f2540 /* 16716375 */:
                return "CO2/km";
            case f2542 /* 16716376 */:
                return "CO2/km (avg)";
            case f2549 /* 16716377 */:
                return "GPS time between position updates";
            case f2552 /* 16716378 */:
                return "Fuel flow rate(minute)";
            case f2553 /* 16716379 */:
                return "Fuel Used (trip) - Deprecated - replaced with pid ff1271";
            case f2566 /* 16716380 */:
                return "Fuel cost (trip)";
            case f2575 /* 16716381 */:
                return "Fuel Flow Rate(hour)";
            case f2579 /* 16716382 */:
                return "60-120mph time";
            case f2583 /* 16716383 */:
                return "60-80mph time";
            case f2592 /* 16716384 */:
                return "40-60mph time";
            case f2612 /* 16716385 */:
                return "80-100mph time";
            case f2613 /* 16716386 */:
                return "Available GPS satellites";
            case f2614 /* 16716387 */:
                return "Average trip speed(whilst moving only)";
            case f2620 /* 16716388 */:
                return "100-0kph braking time";
            case f2622 /* 16716389 */:
                return "60-0mph braking time";
            case f2623 /* 16716390 */:
                return "Total trip time(seconds)";
            case f2625 /* 16716391 */:
                return "Total trip stationary time(seconds)";
            case f2626 /* 16716392 */:
                return "Total trip moving time(seconds)";
            case f2627 /* 16716393 */:
                return "Volumetric Efficiency (calculated)";
            case f2641 /* 16716394 */:
                return "Distance to empty (Estimated)";
            case f2647 /* 16716395 */:
                return "Fuel remaining (Estimated)";
            case f2648 /* 16716396 */:
                return "Trip distance (alternate 1, do not use)";
            case f2649 /* 16716397 */:
                return "Cost per mile/km (Instant)";
            case f2650 /* 16716398 */:
                return "Cost per mile/km (Trip)";
            case f2656 /* 16716399 */:
                return "Trip distance (alternate 2, do not use)";
            case f2657 /* 16716400 */:
                return "Barometric pressure (from android device)";
            case f2658 /* 16716401 */:
                return "Fuel Used (trip)";
            case f2659 /* 16716402 */:
                return "Average trip speed(stopped and moving)";
            case f2662 /* 16716403 */:
                return "Engine Power (kW) at the wheels";
            case f2664 /* 16716404 */:
                return "Trip distance travelled(km) whilst connected to OBD";
            case f2666 /* 16716405 */:
                return "80-120kph time";
            case f2667 /* 16716406 */:
                return "60-130mph time";
            case f2670 /* 16716407 */:
                return "0-30mph time";
            case f2672 /* 16716408 */:
                return "0-100mph time";
            case f2674 /* 16716416 */:
                return "100 to 200kph time";
            case f2697 /* 16716417 */:
                return "Exhaust gas temperature Bank 1 Sensor 1";
            case f2700 /* 16716418 */:
                return "Exhaust gas temperature Bank 1 Sensor 2";
            case f2704 /* 16716419 */:
                return "Exhaust gas temperature Bank 1 Sensor 3";
            case f2468 /* 16716420 */:
                return "Exhaust gas temperature Bank 1 Sensor 4";
            case f2469 /* 16716421 */:
                return "Exhaust gas temperature Bank 2 Sensor 1";
            case f2472 /* 16716422 */:
                return "Exhaust gas temperature Bank 2 Sensor 2";
            case f2473 /* 16716423 */:
                return "Exhaust gas temperature Bank 2 Sensor 3";
            case f2474 /* 16716424 */:
                return "Exhaust gas temperature Bank 2 Sensor 4";
            case f2475 /* 16716426 */:
                return "NOx sensor post SCR";
            case f2537 /* 16716442 */:
                return "Device battery level";
            case f2556 /* 16732673 */:
                return "MPG Average";
            case f2558 /* 16732674 */:
                return "KPL Average";
            case f2582 /* 16732675 */:
                return "LPK Average";
            case f2587 /* 16732676 */:
                return "Benchmart ready for start flag";
            case f2588 /* 16732677 */:
                return "Benchmark Calculating flag(1/4m time, 0-60,etc)";
            default:
                return null;
        }
    }

    /* renamed from: ʳ */
    public float mo4244() {
        return this.f2729;
    }

    /* renamed from: ʹ */
    public String mo4245() {
        return this.f2718;
    }

    /* renamed from: ʻ */
    public abstract int mo4246();

    /* renamed from: ʻ */
    public final void mo4247(float f) {
        this.f2724 = f;
    }

    /* renamed from: ʻ */
    public void mo4248(int i) {
        this.f2754 = i;
        f2546 = true;
    }

    /* renamed from: ʻ */
    public void mo4249(String str) {
        this.f2717 = str;
    }

    /* renamed from: ʼ */
    public abstract int mo4250();

    /* renamed from: ʼ */
    public final void mo4251(float f) {
        this.f2722 = f;
    }

    /* renamed from: ʼ */
    public void mo4252(String str) {
        this.f2715 = str;
    }

    /* renamed from: ʽ */
    public void mo4253() {
    }

    /* renamed from: ʽ */
    public void mo4254(float f) {
        this.f2728 = f;
    }

    /* renamed from: ʾ */
    public abstract String mo4255();

    /* renamed from: ʿ */
    public abstract void mo4256();

    /* renamed from: ˇ */
    public final boolean mo4257() {
        if (this.f2716 == Float.MIN_VALUE) {
            return false;
        }
        if (this.f2729 == Float.MIN_VALUE || this.f2716 > this.f2729) {
            return this.f2728 != Float.MAX_VALUE && this.f2716 >= this.f2728;
        }
        return true;
    }

    /* renamed from: ˈ */
    public abstract boolean mo4258();

    /* renamed from: ˉ */
    public abstract String mo4259();

    /* renamed from: ˊ */
    public void mo4260() {
        this.f2741 = 0.0f;
        this.f2742 = 0.0f;
        this.f2743 = 0.0f;
        this.f2744 = 0.0f;
        this.f2745 = 0.0f;
        this.f2746 = 0.0f;
        this.f2747 = 0.0f;
        this.f2748 = 0.0f;
        this.f2716 = Float.MIN_VALUE;
        this.f2751 = this.f2726;
        this.f2753 = this.f2727;
        this.f2735 = Float.MIN_VALUE;
        this.f2736 = Float.MAX_VALUE;
        this.f2737 = -2.14748365E9f;
        this.f2738 = 2.14748365E9f;
        this.f2739 = Float.MAX_VALUE;
        this.f2733 = Float.valueOf(0.0f);
        this.f2734 = 0.0f;
        if (mo4310() != null) {
            mo4310().mo7609();
        }
        if (mo4304() == 16716292) {
            C0351.m1700((int) f2648);
            C0351.m1700((int) f2538);
            C0351.m1700((int) f2664);
            C0351.m1700((int) f2599);
        } else if (mo4304() == 16716289) {
            C0351.m1700((int) f2527);
            C0351.m1814();
        } else if (mo4304() == 16716295) {
            C0351.m1700((int) f2573);
            C0351.m1814();
        } else if (mo4304() == 16716291) {
            C0351.m1700((int) f2529);
            C0351.m1814();
        } else if (mo4304() == 16732674 || mo4304() == 16732675 || mo4304() == 16732673) {
            C0351.m1700((int) f2558);
            C0351.m1700((int) f2582);
            C0351.m1700((int) f2556);
            C0351.m1814();
        } else if (mo4304() == 16716300) {
            C0351.m1782().mo5926(0.0d);
            C0351.m1700((int) f2602);
        } else if (mo4304() == 16716293) {
            C0351.m1815();
            C0351.m1700((int) f2570);
        } else if (mo4304() == 16716296) {
            C0351.m1815();
            C0351.m1700((int) f2581);
        } else if (mo4304() == 16716294) {
            C0351.m1815();
            C0351.m1700((int) f2572);
        } else if (mo4304() == 16716380) {
            C0351.m1816();
        } else if (mo4304() == 16716379 || mo4304() == 16716379) {
            C0351.m1690();
        } else if (mo4304() == 16716390) {
            C0351.m1691();
        } else if (mo4304() == 16716391) {
            C0351.m1711();
        } else if (mo4304() == 16716392) {
            C0351.m1712();
        }
    }

    /* renamed from: ˊ */
    public abstract void mo4261(float f);

    /* renamed from: ˊ */
    public abstract void mo4262(float f, long j);

    /* renamed from: ˊ */
    public void mo4263(float f, boolean z) {
        this.f2731 = f;
    }

    /* renamed from: ˊ */
    public abstract void mo4264(int i);

    /* renamed from: ˊ */
    public void mo4265(Context context) {
        String str;
        String str2;
        String str3;
        String str4 = "http://torque-bhp.com/facebook/facebook.png";
        NumberFormat instance = NumberFormat.getInstance();
        instance.setMaximumFractionDigits(2);
        instance.setMinimumFractionDigits(0);
        if (this.f2756 == 16716333 || this.f2756 == 16716407 || this.f2756 == 16716408 || this.f2756 == 16716334
                || this.f2756 == 16716367 || this.f2756 == 16716384 || this.f2756 == 16716416 || this.f2756 == 16716382
                || this.f2756 == 16716383 || this.f2756 == 16716406 || this.f2756 == 16716385
                || this.f2756 == 16716405) {
            str3 = this.f2739 != Float.MAX_VALUE
                    ? C0483.m2490("I just did a %1 second acceleration run using Torque",
                            instance.format((double) this.f2739))
                    : C0483.m2490("I'm going to do an acceleration run using Torque",
                            instance.format((double) this.f2739));
            str2 = C0483.m2490("Measure your performance using Torque!", new String[0]);
            str = C0483.m2490("Acceleration Performance", new String[0]);
        } else if (this.f2756 == 16716388 || this.f2756 == 16716389) {
            str3 = this.f2739 != Float.MAX_VALUE
                    ? C0483.m2490("I just did a %1 second brake test using Torque",
                            instance.format((double) this.f2739))
                    : C0483.m2490("I'm going to do brake test using Torque", instance.format((double) this.f2739));
            str2 = C0483.m2490("Measure your performance using Torque!", new String[0]);
            str = C0483.m2490("Braking Performance", new String[0]);
        } else {
            str3 = m2134(this.f2756) != null
                    ? new StringBuilder(
                            String.valueOf(C0483.m2490("I've measured a sensor on my vehicle -", new String[0])))
                                    .append(C0483.m2490(m2134(this.f2756), new String[0])).toString()
                    : C0483.m2490("I've pulled sensor data from my cars brain", new String[0]);
            str2 = C0483.m2490("Link your phone to your car using Torque!", new String[0]);
            if (!(this.f2736 == Float.MAX_VALUE || this.f2735 == Float.MIN_VALUE)) {
                str2 = C0483.m2490("Maximum value seen: %1<center></center> Minimum value seen: %2",
                        instance.format((double) this.f2735), instance.format((double) this.f2736));
            }
            str = C0483.m2490("Vehicle engine data", new String[0]);
        }
        if (str3 != null) {
            C0260.m1295(context, str, str3, str4, str2, this);
        }
    }

    /* renamed from: ˊ */
    public abstract void mo4266(Canvas canvas);

    /* renamed from: ˊ */
    public void mo4267(Integer num) {
        this.f2750 = num;
    }

    /* renamed from: ˊ */
    public abstract void mo4268(String str);

    /* renamed from: ˊ */
    public void mo4269(String str, boolean z) {
        this.f2749 = z;
        mo4268(str);
    }

    /* renamed from: ˊ */
    public void mo4270(PID pid) {
        this.f2758 = pid;
    }

    /* renamed from: ˊ */
    public abstract void mo4271(boolean z);

    /* renamed from: ˋ */
    public final void mo4272(float f) {
        this.f2740 = f;
    }

    /* renamed from: ˋ */
    public void mo4273(float f, boolean z) {
        this.f2732 = f;
    }

    /* renamed from: ˋ */
    public abstract void mo4274(int i);

    /* renamed from: ˋ */
    public abstract void mo4275(String str);

    /* renamed from: ˋ */
    public void mo4276(boolean z) {
        this.f2710 = z;
    }

    /* renamed from: ˌ */
    public boolean mo4277() {
        return true;
    }

    /* renamed from: ˍ */
    public String mo4278() {
        return this.f2719;
    }

    /* renamed from: ˎ */
    public abstract int mo4279();

    /* renamed from: ˎ */
    public final void mo4280(float f) {
        this.f2740 += f;
    }

    /* renamed from: ˎ */
    public abstract void mo4281(String str);

    /* renamed from: ˎ */
    public final void mo4282(boolean z) {
        this.f2723 = z;
    }

    /* renamed from: ˏ */
    public abstract int mo4283();

    /* renamed from: ˏ */
    public void mo4284(float f) {
        this.f2726 = f;
        this.f2751 = f;
    }

    /* renamed from: ˏ */
    public void mo4285(String str) {
        this.f2719 = str;
    }

    /* renamed from: ˑ */
    public int mo4286() {
        String str = null;
        if (mo4310() != null) {
            str = mo4310().mo7629();
        }
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: ˡ */
    public boolean mo4287() {
        return false;
    }

    /* renamed from: ˮ */
    public Integer mo4288() {
        return this.f2750;
    }

    /* renamed from: ͺ */
    public void mo4289() {
    }

    /* renamed from: ͺ */
    public void mo4290(float f) {
        this.f2729 = f;
    }

    /* renamed from: ՙ */
    public String mo4291() {
        return this.f2717;
    }

    /* renamed from: י */
    public void mo4292() {
    }

    /* renamed from: ـ */
    public float mo4293() {
        return this.f2731;
    }

    /* renamed from: ٴ */
    public final float mo4294() {
        return this.f2740;
    }

    /* renamed from: ۥ */
    public final String mo4295() {
        return this.f2715;
    }

    /* renamed from: ᐝ */
    public abstract float mo4296();

    /* renamed from: ᐝ */
    public void mo4297(float f) {
        this.f2727 = f;
        this.f2753 = f;
    }

    /* renamed from: ᐝ */
    public void mo4298(int i) {
        f2546 = true;
        this.f2756 = i;
    }

    /* renamed from: ᐝ */
    public void mo4299(String str) {
        this.f2718 = str;
    }

    /* renamed from: ᐠ */
    public void mo4300() {
    }

    /* renamed from: ᐧ */
    public float mo4301() {
        return this.f2732;
    }

    /* renamed from: ᐨ */
    public int mo4302() {
        return this.f2754;
    }

    /* renamed from: ᴵ */
    public final void mo4303() {
        if (FrontPage.m6093(this)) {
            f2546 = true;
        }
    }

    /* renamed from: ᵎ */
    public final int mo4304() {
        return this.f2756;
    }

    /* renamed from: ᵔ */
    public final float mo4305() {
        return this.f2726;
    }

    /* renamed from: ᵢ */
    public final float mo4306() {
        return this.f2727;
    }

    /* renamed from: ι */
    public abstract String mo4307();

    /* renamed from: ⁱ */
    public final float mo4308() {
        return this.f2722;
    }

    /* renamed from: ﹳ */
    public boolean mo4309() {
        return this.f2710;
    }

    /* renamed from: ﹶ */
    public PID mo4310() {
        return this.f2758;
    }

    /* renamed from: ﹺ */
    public final String mo4311() {
        return this.f2758 == null ? C0248.m1235((long) this.f2756) : C0248.m1237(this.f2758);
    }

    /* renamed from: ｰ */
    public float mo4312() {
        return this.f2728;
    }

    /* renamed from: ﾞ */
    public boolean mo4313() {
        return false;
    }
}
