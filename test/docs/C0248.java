package p001o;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import org.prowl.torque.TorqueSettings;
import org.prowl.torque.landing.FrontPage;
import org.prowl.torque.pid.PID;

/* renamed from: o.ة */
public class C0248 {

    /* renamed from: ˊ */
    public static String f1351;

    /* renamed from: ˋ */
    private static final HashMap<String, double[]> f1352 = new HashMap<>();

    /* renamed from: ˎ */
    private static final HashMap<Long, String> f1353 = new HashMap<>();

    /* renamed from: ˏ */
    private static long f1354 = 0;

    static {
        f1351 = "¤";
        try {
            f1351 = Currency.getInstance(Locale.getDefault()).getSymbol();
        } catch (Throwable th) {
            C0362.m1836(th);
        }
        f1352.put("hp,kW", new double[] { 0.745699872d, 0.0d, 0.0d });
        f1352.put("kW,hp", new double[] { 1.34102209d, 0.0d, 0.0d });
        f1352.put("kg,lbs", new double[] { 2.20462262d, 0.0d, 0.0d });
        f1352.put("lbs,kg", new double[] { 0.45359237d, 0.0d, 0.0d });
        f1352.put("km/h,mph", new double[] { 0.621371192d, 0.0d, 0.0d });
        f1352.put("mph,km/h", new double[] { 1.609344d, 0.0d, 0.0d });
        f1352.put("km,miles", new double[] { 0.621371192d, 0.0d, 0.0d });
        f1352.put("miles,km", new double[] { 1.609344d, 0.0d, 0.0d });
        f1352.put("°c,°f", new double[] { 1.8d, 32.0d, 0.0d });
        f1352.put("°f,°c", new double[] { 0.5555555555555556d, 0.0d, 32.0d });
        f1352.put("c,°f", new double[] { 1.8d, 32.0d, 0.0d });
        f1352.put("f,°c", new double[] { 0.5555555555555556d, 0.0d, 32.0d });
        f1352.put("ft,m", new double[] { 0.3048d, 0.0d, 0.0d });
        f1352.put("m,ft", new double[] { 3.2808399d, 0.0d, 0.0d });
        f1352.put("kpa,psi", new double[] { 0.145037738d, 0.0d, 0.0d });
        f1352.put("psi,kpa", new double[] { 6.89475729d, 0.0d, 0.0d });
        f1352.put("bar,psi", new double[] { 14.5037738d, 0.0d, 0.0d });
        f1352.put("psi,bar", new double[] { 0.0689475729d, 0.0d, 0.0d });
        f1352.put("bar,kpa", new double[] { 0.01d, 0.0d, 0.0d });
        f1352.put("kpa,bar", new double[] { 100.0d, 0.0d, 0.0d });
        f1352.put("nm,ft-lb", new double[] { 0.737562149d, 0.0d, 0.0d });
        f1352.put("ft-lb,nm", new double[] { 1.35581795d, 0.0d, 0.0d });
        f1352.put("g/s,cfm", new double[] { 8.0213903d, 0.0d, 0.0d });
        f1352.put("cfm,g/s", new double[] { 0.1246666d, 0.0d, 0.0d });
        f1352.put(f1351 + "/m," + f1351 + "/km", new double[] { 0.621371192d, 0.0d, 0.0d });
        f1352.put(f1351 + "/km," + f1351 + "/m", new double[] { 1.609344d, 0.0d, 0.0d });
        f1352.put("gal/s,l/s", new double[] { -9999.0d, -1.0d, -1.0d });
        f1352.put("l/s,gal/s", new double[] { -9999.0d, -1.0d, -1.0d });
        f1352.put("igal/s,il/s", new double[] { 4.54609188d, 0.0d, 0.0d });
        f1352.put("il/s,igal/s", new double[] { 0.219969157d, 0.0d, 0.0d });
        f1352.put("ugal/s,ul/s", new double[] { 3.78541178d, 0.0d, 0.0d });
        f1352.put("ul/s,ugal/s", new double[] { 0.264172052d, 0.0d, 0.0d });
        f1352.put("gal,l", new double[] { -9999.0d, -1.0d, -1.0d });
        f1352.put("l,gal", new double[] { -9999.0d, -1.0d, -1.0d });
        f1352.put("igal,il", new double[] { 4.54609188d, 0.0d, 0.0d });
        f1352.put("il,igal", new double[] { 0.219969157d, 0.0d, 0.0d });
        f1352.put("ugal,ul", new double[] { 4.54609188d, 0.0d, 0.0d });
        f1352.put("ul,ugal", new double[] { 0.264172052d, 0.0d, 0.0d });
        f1352.put("gal/min,cc/min", new double[] { -9999.0d, -1.0d, -1.0d });
        f1352.put("cc/min,gal/min", new double[] { -9999.0d, -1.0d, -1.0d });
        f1352.put("igal/min,icc/min", new double[] { 4546.09188d, 0.0d, 0.0d });
        f1352.put("icc/min,igal/min", new double[] { 2.19969157E-4d, 0.0d, 0.0d });
        f1352.put("ugal/min,ucc/min", new double[] { 4546.09188d, 0.0d, 0.0d });
        f1352.put("ucc/min,ugal/min", new double[] { 2.64172052E-4d, 0.0d, 0.0d });
        f1352.put("gal/hr,l/hr", new double[] { -9999.0d, -1.0d, -1.0d });
        f1352.put("l/hr,gal/hr", new double[] { -9999.0d, -1.0d, -1.0d });
        f1352.put("igal/hr,il/hr", new double[] { 4.54609188d, 0.0d, 0.0d });
        f1352.put("il/hr,igal/hr", new double[] { 0.219969157d, 0.0d, 0.0d });
        f1352.put("ugal/hr,ul/hr", new double[] { 4.54609188d, 0.0d, 0.0d });
        f1352.put("ul/hr,ugal/hr", new double[] { 0.264172052d, 0.0d, 0.0d });
        f1352.put("Igal/s,Il/s", new double[] { 4.54609188d, 0.0d, 0.0d });
        f1352.put("Il/s,Igal/s", new double[] { 0.219969157d, 0.0d, 0.0d });
        f1352.put("Ugal/s,Ul/s", new double[] { 3.78541178d, 0.0d, 0.0d });
        f1352.put("Ul/s,Ugal/s", new double[] { 0.264172052d, 0.0d, 0.0d });
        f1352.put("Igal,Il", new double[] { 4.54609188d, 0.0d, 0.0d });
        f1352.put("Il,Igal", new double[] { 0.219969157d, 0.0d, 0.0d });
        f1352.put("Ugal,Ul", new double[] { 3.78541178d, 0.0d, 0.0d });
        f1352.put("Ul,Ugal", new double[] { 0.264172052d, 0.0d, 0.0d });
        f1352.put("Igal/min,Icc/min", new double[] { 4546.09188d, 0.0d, 0.0d });
        f1352.put("Icc/min,Igal/min", new double[] { 2.19969157E-4d, 0.0d, 0.0d });
        f1352.put("Ugal/min,Ucc/min", new double[] { 4546.09188d, 0.0d, 0.0d });
        f1352.put("Ucc/min,Ugal/min", new double[] { 2.64172052E-4d, 0.0d, 0.0d });
        f1352.put("Igal/hr,Il/hr", new double[] { 4.54609188d, 0.0d, 0.0d });
        f1352.put("Il/hr,Igal/hr", new double[] { 0.219969157d, 0.0d, 0.0d });
        f1352.put("Ugal/hr,Ul/hr", new double[] { 4.54609188d, 0.0d, 0.0d });
        f1352.put("Ul/hr,Ugal/hr", new double[] { 0.264172052d, 0.0d, 0.0d });
    }

    /* renamed from: ˊ */
    public static final float m1232(String str, float f) {
        return m1233(str, m1236(str), f);
    }

    /* renamed from: ˊ */
    public static final float m1233(String str, String str2, float f) {
        if (str2 == null || str == null || str.length() == 0 || str2.length() == 0 || str2.equals(str)) {
            return f;
        }
        double[] dArr = (double[]) f1352.get(str.toLowerCase() + "," + str2.toLowerCase());
        if (dArr == null) {
            return f;
        }
        if (dArr[0] == -9999.0d && dArr[1] == -1.0d) {
            String str3 = "i";
            if (FrontPage.m6092(TorqueSettings.f6033, false)) {
                str3 = "u";
            }
            dArr = (double[]) f1352.get(new StringBuilder(String.valueOf(str3)).append(str.toLowerCase()).append(",")
                    .append(str3).append(str2.toLowerCase()).toString());
        }
        return (float) (((((double) f) - dArr[2]) * dArr[0]) + dArr[1]);
    }

    /* renamed from: ˊ */
    public static final float m1234(String str, String str2, float f, boolean z) {
        if (str2 == null || str == null || str.length() == 0 || str2.length() == 0 || str2.equals(str)) {
            return f;
        }
        double[] dArr = (double[]) f1352.get(str.toLowerCase() + "," + str2.toLowerCase());
        if (dArr != null) {
            if (dArr[0] == -9999.0d && dArr[1] == -1.0d) {
                String str3 = "I";
                if (FrontPage.m6092(TorqueSettings.f6033, false)) {
                    str3 = "U";
                }
                dArr = (double[]) f1352.get(new StringBuilder(String.valueOf(str3)).append(str.toLowerCase())
                        .append(",").append(str3).append(str2.toLowerCase()).toString());
            }
            return (float) (((((double) f) - dArr[2]) * dArr[0]) + dArr[1]);
        }
        if (z) {
            f = 0.0f;
        }
        return f;
    }

    /* renamed from: ˊ */
    public static final String m1235(long j) {
        if (System.currentTimeMillis() > f1354 + 2000) {
            f1353.clear();
            f1354 = System.currentTimeMillis();
        }
        String str = (String) f1353.get(Long.valueOf(j));
        if (str != null) {
            return str;
        }
        PID r7 = m1240(j);
        if (r7 == null) {
            return null;
        }
        f1353.put(Long.valueOf(j), r7.mo7627());
        return r7.mo7627();
    }

    /* renamed from: ˊ */
    public static final String m1236(String str) {
        String lowerCase = str.toLowerCase();
        return ("kp/h".equals(lowerCase) || "km/h".equals(lowerCase) || "mph".equals(lowerCase))
                ? FrontPage.m6092(TorqueSettings.f5945, false) ? "mph" : "km/h"
                : (new StringBuilder(String.valueOf(f1351)).append("/km").toString().equals(lowerCase)
                        || new StringBuilder(String.valueOf(f1351)).append("/m").toString().equals(lowerCase))
                                ? FrontPage.m6092(TorqueSettings.f5945, false) ? f1351 + "/m" : f1351 + "/km"
                                : ("p/km".equals(lowerCase) || "p/m".equals(lowerCase))
                                        ? FrontPage.m6092(TorqueSettings.f5945, false) ? "p/m" : "p/km"
                                        : ("km".equals(lowerCase) || "miles".equals(lowerCase))
                                                ? FrontPage.m6092(TorqueSettings.f5945, false) ? "miles" : "km"
                                                : ("°c".equals(lowerCase) || "°f".equals(lowerCase)
                                                        || "c".equals(lowerCase) || "f".equals(lowerCase))
                                                                ? FrontPage.m6092(TorqueSettings.f5989, true) ? "°C"
                                                                        : "°F"
                                                                : ("nm".equals(lowerCase) || "ft-lb".equals(lowerCase))
                                                                        ? FrontPage.m6092(TorqueSettings.f6007, true)
                                                                                ? "Nm"
                                                                                : "ft-lb"
                                                                        : ("ft".equals(lowerCase)
                                                                                || "m".equals(lowerCase))
                                                                                        ? FrontPage.m6092(
                                                                                                TorqueSettings.f5965,
                                                                                                false) ? "ft" : "m"
                                                                                        : ("kg".equals(lowerCase)
                                                                                                || "lbs".equals(
                                                                                                        lowerCase))
                                                                                                                ? FrontPage
                                                                                                                        .m6092(TorqueSettings.f6017,
                                                                                                                                true) ? "kg"
                                                                                                                                        : "lbs"
                                                                                                                : ("psi".equals(
                                                                                                                        lowerCase)
                                                                                                                        || C0432.f2510
                                                                                                                                .equals(lowerCase))
                                                                                                                                        ? FrontPage
                                                                                                                                                .m6092(TorqueSettings.f6131,
                                                                                                                                                        true) ? "psi"
                                                                                                                                                                : C0432.f2510
                                                                                                                                        : ("psi".equals(
                                                                                                                                                lowerCase)
                                                                                                                                                || "kpa".equals(
                                                                                                                                                        lowerCase))
                                                                                                                                                                ? FrontPage
                                                                                                                                                                        .m6092(TorqueSettings.f6131,
                                                                                                                                                                                true) ? "psi"
                                                                                                                                                                                        : "kpa"
                                                                                                                                                                : ("gal".equals(
                                                                                                                                                                        lowerCase)
                                                                                                                                                                        || "l".equals(
                                                                                                                                                                                lowerCase))
                                                                                                                                                                                        ? FrontPage
                                                                                                                                                                                                .m6092(TorqueSettings.f6056,
                                                                                                                                                                                                        true) ? "gal"
                                                                                                                                                                                                                : "l"
                                                                                                                                                                                        : ("gal/s"
                                                                                                                                                                                                .equals(lowerCase)
                                                                                                                                                                                                || "l/s".equals(
                                                                                                                                                                                                        lowerCase))
                                                                                                                                                                                                                ? FrontPage
                                                                                                                                                                                                                        .m6092(TorqueSettings.f6056,
                                                                                                                                                                                                                                true) ? "gal/s"
                                                                                                                                                                                                                                        : "l/s"
                                                                                                                                                                                                                : ("cc/min"
                                                                                                                                                                                                                        .equals(lowerCase)
                                                                                                                                                                                                                        || "gal/min"
                                                                                                                                                                                                                                .equals(lowerCase))
                                                                                                                                                                                                                                        ? FrontPage
                                                                                                                                                                                                                                                .m6092(TorqueSettings.f6056,
                                                                                                                                                                                                                                                        true) ? "gal/min"
                                                                                                                                                                                                                                                                : "cc/min"
                                                                                                                                                                                                                                        : ("gal/hr"
                                                                                                                                                                                                                                                .equals(lowerCase)
                                                                                                                                                                                                                                                || "l/hr"
                                                                                                                                                                                                                                                        .equals(lowerCase))
                                                                                                                                                                                                                                                                ? FrontPage
                                                                                                                                                                                                                                                                        .m6092(TorqueSettings.f6056,
                                                                                                                                                                                                                                                                                true) ? "gal/hr"
                                                                                                                                                                                                                                                                                        : "l/hr"
                                                                                                                                                                                                                                                                : ("g/s".equals(
                                                                                                                                                                                                                                                                        lowerCase)
                                                                                                                                                                                                                                                                        || "cfm".equals(
                                                                                                                                                                                                                                                                                lowerCase))
                                                                                                                                                                                                                                                                                        ? FrontPage
                                                                                                                                                                                                                                                                                                .m6092(TorqueSettings.f6226,
                                                                                                                                                                                                                                                                                                        false) ? "cfm"
                                                                                                                                                                                                                                                                                                                : "g/s"
                                                                                                                                                                                                                                                                                        : str;
    }

    /* renamed from: ˊ */
    public static final String m1237(PID pid) {
        return pid.mo7627();
    }

    /* renamed from: ˋ */
    public static final float m1238(String str, String str2, float f) {
        return m1234(str, str2, f, false);
    }

    /* renamed from: ˋ */
    public static final String m1239(String str, float f) {
        NumberFormat instance = NumberFormat.getInstance();
        instance.setMaximumFractionDigits(2);
        String r4 = m1236(str);
        return instance.format((double) m1233(str, r4, f)) + r4;
    }

    /* renamed from: ˋ */
    public static final PID m1240(long j) {
        PID[] r2 = C0351.m1811();
        PID[] pidArr = r2;
        int length = r2.length;
        for (int i = 0; i < length; i++) {
            PID pid = pidArr[i];
            if (pid.mo7595() == ((int) j)) {
                return pid;
            }
        }
        return null;
    }
}
