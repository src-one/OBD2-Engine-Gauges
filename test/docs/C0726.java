package p001o;

import java.util.Hashtable;
import org.prowl.torque.landing.FrontPage;
import twitter4j.HttpResponseCode;

/* renamed from: o.ἳ */
public class C0726 {

    /* renamed from: ʻ */
    public static final int f4377 = 5;

    /* renamed from: ʼ */
    public static final int f4378 = 6;

    /* renamed from: ʽ */
    public static final int f4379 = 7;

    /* renamed from: ʾ */
    public static final String f4380 = "Toyota Prius (Gen.III)";

    /* renamed from: ʿ */
    public static final String f4381 = "Toyota Prius (Gen.II)";

    /* renamed from: ˈ */
    public static final String f4382 = "Ford (Incl PowerStroke)";

    /* renamed from: ˉ */
    public static final String f4383 = "Chrysler/Dodge/Jeep/Mercedes";

    /* renamed from: ˊ */
    public static final int f4384 = 0;

    /* renamed from: ˋ */
    public static final int f4385 = 1;

    /* renamed from: ˌ */
    public static final String[] f4386 = { f4396, f4382, f4383 };

    /* renamed from: ˍ */
    public static Hashtable<String, String[][]> f4387 = new Hashtable<>();

    /* renamed from: ˎ */
    public static final int f4388 = 2;

    /* renamed from: ˏ */
    public static final int f4389 = 3;

    /* renamed from: ˑ */
    public static Hashtable<String, Long> f4390 = new Hashtable<>();

    /* renamed from: ͺ */
    public static final int f4391 = 8;

    /* renamed from: ـ */
    public static final Object[][] f4392 = {
            new Object[] { "[GM]Knock Retard", "KR", "2211A6", "(22.5*A)/256", Integer.valueOf(0), Integer.valueOf(50),
                    Integer.valueOf(1), "Deg.", "Auto" },
            new Object[] { "[GM]Knock Retard(Alternative)", "KR", "22125D", "A/16", Integer.valueOf(0),
                    Integer.valueOf(50), Integer.valueOf(1), "Deg.", "Auto" },
            new Object[] { "[GM]Knock sensor active counter", "Knock", "22125E", "A", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[GM]Injector Pulse Width (Cyl 1)", "IPW C1", "221193", "(((A<8)+B)/65.535)",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "ms", "Auto" },
            new Object[] { "[GM]Injector Pulse Width (Cyl 2)", "IPW C2", "221194", "(((A<8)+B)/65.535)",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "ms", "Auto" },
            new Object[] { "[GM]Injector Pulse Width (Cyl 3)", "IPW C3", "221195", "(((A<8)+B)/65.535)",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "ms", "Auto" },
            new Object[] { "[GM]Injector Pulse Width (Cyl 4)", "IPW C4", "221196", "(((A<8)+B)/65.535)",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "ms", "Auto" },
            new Object[] { "[GM]Injector Pulse Width (Cyl 5)", "IPW C5", "221197", "(((A<8)+B)/65.535)",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "ms", "Auto" },
            new Object[] { "[GM]Injector Pulse Width (Cyl 6)", "IPW C6", "221198", "(((A<8)+B)/65.535)",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "ms", "Auto" },
            new Object[] { "[GM]Injector Pulse Width (Cyl 7)", "IPW C7", "221199", "(((A<8)+B)/65.535)",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "ms", "Auto" },
            new Object[] { "[GM]Injector Pulse Width (Cyl 8)", "IPW C8", "22119A", "(((A<8)+B)/65.535)",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "ms", "Auto" },
            new Object[] { "[GM]Balance Rate (Cyl 1)", "BAL C1", "22162F", "((((A<8)+B)-32768)*0.15625)/10",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "-", "Auto" },
            new Object[] { "[GM]Balance Rate (Cyl 2)", "BAL C2", "221630", "((((A<8)+B)-32768)*0.15625)/10",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "-", "Auto" },
            new Object[] { "[GM]Balance Rate (Cyl 3)", "BAL C3", "221631", "((((A<8)+B)-32768)*0.15625)/10",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "-", "Auto" },
            new Object[] { "[GM]Balance Rate (Cyl 4)", "BAL C4", "221632", "((((A<8)+B)-32768)*0.15625)/10",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "-", "Auto" },
            new Object[] { "[GM]Balance Rate (Cyl 5)", "BAL C5", "221633", "((((A<8)+B)-32768)*0.15625)/10",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "-", "Auto" },
            new Object[] { "[GM]Balance Rate (Cyl 6)", "BAL C6", "221634", "((((A<8)+B)-32768)*0.15625)/10",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "-", "Auto" },
            new Object[] { "[GM]Balance Rate (Cyl 7)", "BAL C7", "221635", "((((A<8)+B)-32768)*0.15625)/10",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "-", "Auto" },
            new Object[] { "[GM]Balance Rate (Cyl 8)", "BAL C8", "221636", "((((A<8)+B)-32768)*0.15625)/10",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "-", "Auto" },
            new Object[] { "[GM]Ignition 1 Voltage", "Ign V", "221141", "A/10", Integer.valueOf(0), Integer.valueOf(20),
                    Integer.valueOf(1), "V", "Auto" },
            new Object[] { "[GM]H2OS Sensor", "H2OS", "221145", "(0.434*A)*10", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(10), "mV", "Auto" },
            new Object[] { "[GM]Desired Idle Speed", "Idle Spd", "221192", "A*12.5", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1700), Integer.valueOf(10), "RPM", "Auto" },
            new Object[] { "[GM]Misfire Cyl.1 History", "MF C1 Hst", "221201", "(A<8)+B", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(10), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.2 History", "MF C2 Hst", "221202", "(A<8)+B", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(10), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.3 History", "MF C3 Hst", "221203", "(A<8)+B", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(10), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.4 History", "MF C4 Hst", "221204", "(A<8)+B", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(10), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.5 History", "MF C5 Hst", "2211F8", "(A<8)+B", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(10), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.6 History", "MF C6 Hst", "2211F9", "(A<8)+B", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(10), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.7 History", "MF C7 Hst", "2211FA", "(A<8)+B", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(10), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.8 History", "MF C8 Hst", "2211FB", "(A<8)+B", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(10), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.9 History", "MF C9 Hst", "2211FC", "(A<8)+B", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(10), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.10 History", "MF C10 Hst", "2211FD", "(A<8)+B", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(10), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.11 History", "MF C11 Hst", "2211FE", "(A<8)+B", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(10), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.12 History", "MF C12 Hst", "2211FF", "(A<8)+B", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(10), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.1 Current", "MF C1 Cur", "221205", "A", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.2 Current", "MF C2 Cur", "221206", "A", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.3 Current", "MF C3 Cur", "221207", "A", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.4 Current", "MF C4 Cur", "221208", "A", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.5 Current", "MF C5 Cur", "2211EA", "A", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.6 Current", "MF C6 Cur", "2211EB", "A", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.7 Current", "MF C7 Cur", "2211EC", "A", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.8 Current", "MF C8 Cur", "2211ED", "A", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.9 Current", "MF C9 Cur", "2211EE", "A", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.10 Current", "MF C10 Cur", "2211EF", "A", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.11 Current", "MF C11 Cur", "2211F0", "A", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[GM]Misfire Cyl.12 Current", "MF C12 Cur", "2211F1", "A", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[GM]Transmission Fluid Temp (GM Method 1)", "Trans.Fl.Tmp", "221940", "A-40",
                    Integer.valueOf(0), Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "°C", "Auto" },
            new Object[] { "[GM]Transmission Fluid Temp (GM Method 2)", "Trans.Fl.Tmp", "221940", "A-40",
                    Integer.valueOf(0), Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "°C", "7E2" },
            new Object[] { "[GM]Transmission Fluid Temp (GM Method 3)", "Trans.Fl.Tmp", "221949", "(A-40)/0.75",
                    Integer.valueOf(0), Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "°C", "Auto" },
            new Object[] { "[GM]Transmission Temp (Not Fluid)", "Trns.Tmp", "221603", "(A-40)*1.333333",
                    Integer.valueOf(0), Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "°C", "Auto" },
            new Object[] { "[GM]Transmission Oil Life", "Trns.Life", "221990", "(A/255)*100", Integer.valueOf(0),
                    Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "%", "Auto" },
            new Object[] { "[GM]Transmission Input Speed", "Trns.Inp", "221941", "((A<8)+B)*.125", Integer.valueOf(0),
                    Integer.valueOf(8000), Integer.valueOf(1), "RPM", "Auto" },
            new Object[] { "[GM]Transmission Output Speed", "Trns.Out", "221942", "((A<8)+B)*.125", Integer.valueOf(0),
                    Integer.valueOf(8000), Integer.valueOf(1), "RPM", "Auto" },
            new Object[] { "[GM]Transmission Overall Efficiency", "Trns.Eff", "221AD0", "A/2.55", Integer.valueOf(0),
                    Integer.valueOf(8000), Integer.valueOf(1), "%", "Auto" },
            new Object[] { "[GM]Torque Converter Efficiency", "Trq.Eff", "221AE9", "A/2.55", Integer.valueOf(0),
                    Integer.valueOf(8000), Integer.valueOf(1), "%", "Auto" },
            new Object[] { "[GM]Oil Life (Engine)", "Oil.Life", "22119F", "(A/255)*100", Integer.valueOf(0),
                    Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "%", "Auto" },
            new Object[] { "[GM]Spark Advance", "SparkAdv", "2211AE", "(A+20)/0.35", Integer.valueOf(0),
                    Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "Deg.", "Auto" },
            new Object[] { "[GM]Odometer (GM Specific)", "GM.ODO", "22121E", "((A<8)+B) * 16", Integer.valueOf(0),
                    Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "Miles", "Auto" },
            new Object[] { "[GM]Last Shift Time", "Last Shift", "221992", "A/40", Integer.valueOf(0),
                    Integer.valueOf(70), Integer.valueOf(1), "Seconds", "Auto" },
            new Object[] { "[GM]1-2 Shift Time", "1-2Shift", "221993", "A/40", Integer.valueOf(0), Integer.valueOf(70),
                    Integer.valueOf(1), "Seconds", "Auto" },
            new Object[] { "[GM]2-3 Shift Time", "2-3Shift", "221994", "A/40", Integer.valueOf(0), Integer.valueOf(70),
                    Integer.valueOf(1), "Seconds", "Auto" },
            new Object[] { "[GM]3-4 Shift Time", "3-4Shift", "221995", "A/40", Integer.valueOf(0), Integer.valueOf(70),
                    Integer.valueOf(1), "Seconds", "Auto" },
            new Object[] { "[GM]1-2 Shift Error", "1-2Shift", "221997", "A/40", Integer.valueOf(0), Integer.valueOf(70),
                    Integer.valueOf(1), "Seconds", "Auto" },
            new Object[] { "[GM]2-3 Shift Error", "2-3Shift", "221998", "A/40", Integer.valueOf(0), Integer.valueOf(70),
                    Integer.valueOf(1), "Seconds", "Auto" },
            new Object[] { "[GM]3-4 Shift Error", "3-4Shift", "221999", "A/40", Integer.valueOf(0), Integer.valueOf(70),
                    Integer.valueOf(1), "Seconds", "Auto" },
            new Object[] { "[GM]Current Gear", "Gear", "22199A", "A", Integer.valueOf(0), Integer.valueOf(6),
                    Integer.valueOf(1), "", "Auto" },
            new Object[] { "[GM]PC Solenoid Actual Current", "PC.Sol.Act", "22199E", "A * 0.0195", Integer.valueOf(0),
                    Integer.valueOf(40), Integer.valueOf(1), "Amps", "Auto" },
            new Object[] { "[GM]PC Solenoid Reference Current", "PC.Sol.Ref", "22199F", "A * 0.0195",
                    Integer.valueOf(0), Integer.valueOf(40), Integer.valueOf(1), "Amps", "Auto" },
            new Object[] { "[GM]IAC Position", "IAC Pos", "221172", "A", Integer.valueOf(0), Integer.valueOf(255),
                    Integer.valueOf(1), "", "Auto" },
            new Object[] { "[GM]AFR (Commanded)", "AFR (Com)", "22119E", "A/10", Integer.valueOf(0),
                    Integer.valueOf(255), Integer.valueOf(1), ":1", "Auto" },
            new Object[] { "[GM]EGR Duty Cycle", "EGR Duty", "221171", "A / 2.55", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "%", "Auto" },
            new Object[] { "[GM]EGR V", "EGR V", "22114B", "A / 51", Integer.valueOf(0), Integer.valueOf(70),
                    Integer.valueOf(1), "V", "Auto" },
            new Object[] { "[GM]Evap", "Evap", "221170", "A / 2.55", Integer.valueOf(0), Integer.valueOf(100),
                    Integer.valueOf(1), "%", "Auto" },
            new Object[] { "[GM]TCC Slip Speed", "TCC Slip", "221991", "((signed(A)*256)+B)/8", Integer.valueOf(0),
                    Integer.valueOf(10000), Integer.valueOf(1), "RPM", "Auto" },
            new Object[] { "[GM]AirCon High Side Pressure", "ACHSPres", "221564", "A*2.02", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "psi", "Auto" },
            new Object[] { "[GM]ABS Front Left Wheel Speed", "ABS FLW", "224051", "A", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "km/h", "ABS" },
            new Object[] { "[GM]ABS Front Right Wheel Speed", "ABS FRW", "224052", "A", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "km/h", "ABS" },
            new Object[] { "[GM]ABS Rear Right Wheel Speed", "ABS RRW", "224053", "A", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "km/h", "ABS" },
            new Object[] { "[GM]ABS Rear Left Wheel Speed", "ABS RLW", "224054", "A", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "km/h", "ABS" },
            new Object[] { "[GM]Oil Pressure (Engine)", "OilPres", "221470", "A*0.578", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "psi", "" },
            new Object[] { "[GM]Oil Temperature (Engine)", "OilTemp", "221154", "A-40", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "°C", "" },
            new Object[] { "[GM]Fuel tank pressure", "FTPres", "22F432", "((A*256)+B)*0.00003", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "psi", "" },
            new Object[] { "[GM]Inlet air temp2  (IAT2)", "IAT2", "221538", "A-40", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "°C", "" },
            new Object[] { "[GM]Outside air temperature", "OutTemp", "221161", "A-40", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "°F", "" },
            new Object[] { "[GM]Injector PWM Bank 1", "InjPWM1", "2212C3", "((A*256)+B)/66.56", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "ms", "" },
            new Object[] { "[GM]Injector PWM Bank 2", "InjPWM2", "2212C4", "((A*256)+B)/66.56", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "ms", "" } };

    /* renamed from: ᐝ */
    public static final int f4393 = 4;

    /* renamed from: ᐧ */
    public static final Object[][] f4394 = {
            new Object[] { "[CHRYSLER]Transmission Temp (Jeep Pre 2012)", "Trans.Fl.Tmp", "22B010",
                    "((A*256)+B)*(1/64)", Integer.valueOf(0), Integer.valueOf(HttpResponseCode.f9468j_),
                    Integer.valueOf(1), "°F", "7E0,3E01" },
            new Object[] { "[CHRYSLER]Transmission Temp (Jeep 2012 and later)", "Trans.Fl.Tmp", "2130", "L-50",
                    Integer.valueOf(0), Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "°C", "7E1" },
            new Object[] { "[CHRYSLER]Transmission Temp (Chrysler/Dodge)", "Trans.Fl.Tmp", "2103", "A-40",
                    Integer.valueOf(0), Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "°C", "Auto" } };

    /* renamed from: ᐨ */
    public static final Object[][] f4395 = {
            new Object[] { "[FORD]Accelerator Pedal Position", "Accel", "221340", "A*0.3921", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "%", "Auto" },
            new Object[] { "[FORD]Barometric pressure", "Baro", "221127", "A*0.13", Integer.valueOf(0),
                    Integer.valueOf(5), Integer.valueOf(1), "inHg", "Auto" },
            new Object[] { "[FORD]Commanded Duty Cycle (VCT Sol.)", "CAMDCR", "2216CF", "A*0.7813", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "%", "Auto" },
            new Object[] { "[FORD]Variable Cam. Timing Err. omn Crank Degrees", "CAMERR", "2216CF",
                    "((A-128*16)+8)+(B*0.0625) ", Integer.valueOf(0), Integer.valueOf(50), Integer.valueOf(1), "Deg.",
                    "Auto" },
            new Object[] { "[FORD]Case Ground Voltage", "CASGND", "2216C0", "(A*7.988) + (B*0.0312)",
                    Integer.valueOf(-5), Integer.valueOf(5), Integer.valueOf(1), "Volts", "Auto" },
            new Object[] { "[FORD]Transmission Fluid Temp", "TransFl", "221674", "((A*256)+B)/8", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "°F", "Auto" },
            new Object[] { "[FORD]Steering angle", "Steer", "223201", "(A*256)+B-1638", Integer.valueOf(0),
                    Integer.valueOf(20), Integer.valueOf(1), "Deg.", "Auto" },
            new Object[] { "[FORD]Engine Oil Temp", "EOT", "221310", "(((A*256)+B)/100)+40", Integer.valueOf(0),
                    Integer.valueOf(50), Integer.valueOf(1), "°C", "Auto" } };

    /* renamed from: ι */
    public static final String f4396 = "Pontiac / GM / Opel / Vauxhall";

    /* renamed from: ﹳ */
    public static final Object[][] f4397 = {
            new Object[] { "[FORD]Coolant temperature(From TCM)", "Coolant", "0105", "A-40", Integer.valueOf(0),
                    Integer.valueOf(C0432.f2606), Integer.valueOf(1), "°C", "TCM" },
            new Object[] { "[FORD]FICM Main Power", "FMP", "2209D0", "((A*256)+B)*(100/256)/100", Integer.valueOf(0),
                    Integer.valueOf(50), Integer.valueOf(1), "Volts", "Auto" },
            new Object[] { "[FORD]FICM Logic Power", "FLP", "2209CF", "((A*256)+B)*(100/256)/100", Integer.valueOf(0),
                    Integer.valueOf(50), Integer.valueOf(1), "Volts", "Auto" },
            new Object[] { "[FORD]FICM Vehicle Power", "FVP", "2209CE", "((A*256)+B)*(100/256)/100", Integer.valueOf(0),
                    Integer.valueOf(50), Integer.valueOf(1), "Volts", "Auto" },
            new Object[] { "[FORD]Fan Speed Sensor", "FAN", "22099F", "((A*256)+B)*(1/4)", Integer.valueOf(0),
                    Integer.valueOf(C0301.f1699), Integer.valueOf(1), "rpm", "Auto" },
            new Object[] { "[FORD]Injection Control Pressure", "HPOP", "221446", "((A*256)+B)*(57/100)",
                    Integer.valueOf(0), Integer.valueOf(FrontPage.f6816), Integer.valueOf(1), "psi", "Auto" },
            new Object[] { "[FORD]Fuel pump duty cycle", "FPDC", "221672", "A*100/128", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "%", "Auto" },
            new Object[] { "[FORD]Engine Oil Temp", "EOT", "221310", "(((A*256)+B)/100)-40", Integer.valueOf(0),
                    Integer.valueOf(300), Integer.valueOf(1), "°C", "Auto" },
            new Object[] { "[FORD]Transmission Fluid Temp (Method 1)", "TransFl", "221674", "((A*256)+B)/8",
                    Integer.valueOf(0), Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "°F", "Auto" },
            new Object[] { "[FORD]Transmission Fluid Temp (Method 2)", "TransFl", "221674", "((A*256)+B)/8",
                    Integer.valueOf(0), Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "°F", "TCM" },
            new Object[] { "[FORD]Transmission Fluid Temp (Method 3)", "TransFl", "2211BD",
                    "(((A*256)+B)*-0.0036)+212.98", Integer.valueOf(0), Integer.valueOf(HttpResponseCode.f9468j_),
                    Integer.valueOf(1), "°F", "C410F1" },
            new Object[] { "[FORD]Transmission Temp", "TransTmp", "221E1C", "(((signed(A)*256)+B)*(9/8)+320)/10",
                    Integer.valueOf(0), Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "°F", "Auto" },
            new Object[] { "[FORD]VGT Duty Cycle", "VGT", "22096D", "((A*256)+B)*(100/32767)", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "%", "Auto" },
            new Object[] { "[FORD]Fuel Level", "Fuel", "2216C1", "((A*256)+B)*(1/328)", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "%", "Auto" },
            new Object[] { "[FORD]Volume Fuel Desired", "VFD", "221411", "((A*256)+B)*0.00047551", Integer.valueOf(0),
                    Integer.valueOf(50), Integer.valueOf(1), "GPH", "Auto" },
            new Object[] { "[FORD]Injector Pressure Regulator Duty Cycle", "IPR", "221434", "(A*13.53)/35",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "%", "Auto" },
            new Object[] { "[FORD]Throttle Position (Desired)", "TP D", "22091A", "((A*256)+B)*(100/8192)",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "°", "Auto" },
            new Object[] { "[FORD]Throttle Position (Actual)", "TP A", "22093C", "((A*256)+B)*(100/8192)",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "°", "Auto" },
            new Object[] { "[FORD]Torque into Torque Converter", "TQC", "2209CB", "((A*256)+B)", Integer.valueOf(0),
                    Integer.valueOf(HttpResponseCode.f9468j_), Integer.valueOf(1), "Ft-Lb", "Auto" },
            new Object[] { "[FORD]IAT2 (Method 1)", "IAT2", "2216A8", "(((A*256)+B) - 32) * (5 / 9)",
                    Integer.valueOf(0), Integer.valueOf(60), Integer.valueOf(1), "°C", "Auto" },
            new Object[] { "[FORD]IAT2 (Method 2)", "IAT2", "2203CA", "A-40", Integer.valueOf(0), Integer.valueOf(60),
                    Integer.valueOf(1), "°C", "Auto" },
            new Object[] { "[FORD]Exhaust Back Pressure", "EBP", "221445", "(((A*256)+B)*0.03625)", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "psi", "Auto" },
            new Object[] { "[FORD]Battery Voltage", "VBatt", "221172", "A/16", Integer.valueOf(0), Integer.valueOf(100),
                    Integer.valueOf(1), "V", "Auto" },
            new Object[] { "[FORD]Mass Fuel Desired", "MFuel", "221412", "((A*256)+B)*0.0625", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "mg/stroke", "Auto" },
            new Object[] { "[FORD]Transmission Gear", "Gear", "2211B3", "A/2", Integer.valueOf(0), Integer.valueOf(6),
                    Integer.valueOf(1), "Gear", "Auto" },
            new Object[] { "[FORD]Transmission Gear (Method 2)", "Gear", "2211B3", "A/2", Integer.valueOf(0),
                    Integer.valueOf(6), Integer.valueOf(1), "Gear", "TCM" },
            new Object[] { "[FORD]Accelerator Pedal Position", "AccPedal", "2209D4", "A/2", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "%", "Auto" },
            new Object[] { "[FORD]Injector timing before top dead center", "InjTop", "2209CC",
                    "(((A*256)+B)*(10/64))/10", Integer.valueOf(-50), Integer.valueOf(50), Integer.valueOf(1), "Deg.",
                    "Auto" },
            new Object[] { "[FORD]Fuel Injector Pulse Width", "InjPW", "221410", "((A*256)+B)*8", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "µs", "Auto" },
            new Object[] { "[FORD]Cylinder 1 Misfire count", "MF 1", "22160E", "((A*256)+B)", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[FORD]Cylinder 2 Misfire count", "MF 2", "22160F", "((A*256)+B)", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[FORD]Cylinder 3 Misfire count", "MF 3", "221610", "((A*256)+B)", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[FORD]Cylinder 4 Misfire count", "MF 4", "221611", "((A*256)+B)", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[FORD]Cylinder 5 Misfire count", "MF 5", "221612", "((A*256)+B)", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[FORD]Cylinder 6 Misfire count", "MF 6", "221613", "((A*256)+B)", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[FORD]Cylinder 7 Misfire count", "MF 7", "221614", "((A*256)+B)", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[FORD]Cylinder 8 Misfire count", "MF 8", "221615", "((A*256)+B)", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[FORD]Total number of misfires", "MFTot", "221616", "((A*256)+B)", Integer.valueOf(0),
                    Integer.valueOf(100), Integer.valueOf(1), "Count", "Auto" },
            new Object[] { "[FORD]Cylinder head temperature", "CHTMP", "221624", "(((A*256)+B)*1.999)+32",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "°F", "Auto" },
            new Object[] { "[FORD]Cylinder head temperature(alt)", "CHTMP", "221685", "((A*256)+B)*0.281",
                    Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1), "°F", "Auto" },
            new Object[] { "[FORD]Fuel tank pressure", "FTPRES", "221639", "((A*256)+B)*0.1449", Integer.valueOf(0),
                    Integer.valueOf(10), Integer.valueOf(1), "PSI", "Auto" },
            new Object[] { "[FORD]ABS Wheel Speed 1", "ABS W1", "223987", "A", Integer.valueOf(0), Integer.valueOf(100),
                    Integer.valueOf(1), "km/h", "ABS" },
            new Object[] { "[FORD]ABS Wheel Speed 2", "ABS W2", "223987", "B", Integer.valueOf(0), Integer.valueOf(100),
                    Integer.valueOf(1), "km/h", "ABS" },
            new Object[] { "[FORD]ABS Wheel Speed 3", "ABS W3", "223987", "C", Integer.valueOf(0), Integer.valueOf(100),
                    Integer.valueOf(1), "km/h", "ABS" },
            new Object[] { "[FORD]ABS Wheel Speed 4", "ABS W4", "223987", "D", Integer.valueOf(0), Integer.valueOf(100),
                    Integer.valueOf(1), "km/h", "ABS" },
            new Object[] { "[FORD]ABS - Lateral acceleration", "ABSLAT", "223A51", "((A*256)+B)*0.02",
                    Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(1), "g", "ABS" },
            new Object[] { "[FORD]Steering wheel angle", "STWheel", "223201", "(A*6.25) - 800", Integer.valueOf(-800),
                    Integer.valueOf(800), Integer.valueOf(1), "°", "ABS" },
            new Object[] { "[FORD]Torque converter slip", "TCSlip", "2211B8", "((A*256)+B)*0.6103", Integer.valueOf(0),
                    Integer.valueOf(500), Integer.valueOf(1), "rpm", "Auto" },
            new Object[] { "[FORD]MAP (Ford specific)", "MAP", "221440", "(((A*256)+B)*0.03625)", Integer.valueOf(0),
                    Integer.valueOf(30), Integer.valueOf(1), "psi", "Auto" },
            new Object[] { "[FORD]Boost (Ford specific)", "MAP", "221440", "(((A*256)+B)*0.03625)-BARO()",
                    Integer.valueOf(0), Integer.valueOf(30), Integer.valueOf(1), "psi", "Auto" },
            new Object[] { "[FORD]Left front tyre pressure", "LF TP", "222813", "(((256*A)+B)/3+22/3)*0.145",
                    Integer.valueOf(0), Integer.valueOf(70), Integer.valueOf(1), "psi", "726" },
            new Object[] { "[FORD]Right front tyre pressure", "RF TP", "222814", "(((256*A)+B)/3+22/3)*0.145",
                    Integer.valueOf(0), Integer.valueOf(70), Integer.valueOf(1), "psi", "726" },
            new Object[] { "[FORD]Left rear tyre pressure", "LR TP", "222815", "(((256*A)+B)/3+22/3)*0.145",
                    Integer.valueOf(0), Integer.valueOf(70), Integer.valueOf(1), "psi", "726" },
            new Object[] { "[FORD]Right rear tyre pressure", "RR TP", "222816", "(((256*A)+B)/3+22/3)*0.145",
                    Integer.valueOf(0), Integer.valueOf(70), Integer.valueOf(1), "psi", "726" },
            new Object[] { "[FORD]Knock Sensor", "Knock", "220404", "A", Integer.valueOf(0), Integer.valueOf(60),
                    Integer.valueOf(1), "Count", "Auto" } };

    /* renamed from: ˊ */
    public static void m4266(String str, String[][] strArr) {
        synchronized (f4387) {
            f4390.put(str, Long.valueOf(System.currentTimeMillis()));
            f4387.put(str, strArr);
        }
    }
}
