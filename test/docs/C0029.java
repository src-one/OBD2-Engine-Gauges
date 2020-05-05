package p001o;

/* renamed from: o.ř */
public class C0029 {

    /* renamed from: ʹ */
    public static final String f236 = C0483.m2490("Analog Voltage", new String[0]);

    /* renamed from: ʻ */
    public static final String f237 = C0483.m2490("Air Intake Temp", new String[0]);

    /* renamed from: ʼ */
    public static final String f238 = C0483.m2490("RPM", new String[0]);

    /* renamed from: ʽ */
    public static final String f239 = C0483.m2490("Speed", new String[0]);

    /* renamed from: ʾ */
    public static final String f240 = C0483.m2490("Fluid Pressure", new String[0]);

    /* renamed from: ʿ */
    public static final String f241 = C0483.m2490("Timing", new String[0]);

    /* renamed from: ˈ */
    public static final String f242 = C0483.m2490("Manifold Absolute Pressure", new String[0]);

    /* renamed from: ˉ */
    public static final String f243 = C0483.m2490("Mass Air Flow", new String[0]);

    /* renamed from: ˊ */
    public static final String f244 = C0483.m2490("Lambda", new String[0]);

    /* renamed from: ˋ */
    public static final String f245 = C0483.m2490("Exhaust Gas Temperature", new String[0]);

    /* renamed from: ˌ */
    public static final String f246 = C0483.m2490("Short Term Fuel Trim", new String[0]);

    /* renamed from: ˍ */
    public static final String f247 = C0483.m2490("Long Term Fuel Trim", new String[0]);

    /* renamed from: ˎ */
    public static final String f248 = C0483.m2490("Fluid Tmperature", new String[0]);

    /* renamed from: ˏ */
    public static final String f249 = C0483.m2490("Vacuum", new String[0]);

    /* renamed from: ˑ */
    public static final String f250 = C0483.m2490("Narrowband O2", new String[0]);

    /* renamed from: ͺ */
    public static final String f251 = C0483.m2490("Throttle Position", new String[0]);

    /* renamed from: ՙ */
    public static final String f252 = C0483.m2490("Speed (Hz)", new String[0]);

    /* renamed from: ـ */
    public static final String f253 = C0483.m2490("Fuel Level", new String[0]);

    /* renamed from: ᐝ */
    public static final String f254 = C0483.m2490("Boost", new String[0]);

    /* renamed from: ᐧ */
    public static final String f255 = C0483.m2490("Volt Meter", new String[0]);

    /* renamed from: ᐨ */
    public static final String f256 = C0483.m2490("Knock", new String[0]);

    /* renamed from: ι */
    public static final String f257 = C0483.m2490("Engine Load", new String[0]);

    /* renamed from: ﹳ */
    public static final String f258 = C0483.m2490("Duty Cycle", new String[0]);

    /* renamed from: ﾞ */
    public static final String f259 = C0483.m2490("Fuel Efficiency", new String[0]);

    /* renamed from: ˊ */
    public static final float m172(int i, int i2, int i3) {
        int r5 = C0351.m1782().mo5947();
        if (i == 0) {
            return i2 == 0 ? (float) (((((double) i3) / 3.75d) + 68.0d) / 100.0d)
                    : (r5 == 0 || r5 == 0) ? (float) (((((double) i3) / 2.55d) + 100.0d) / 10.0d)
                            : r5 == 1 ? (float) (((((double) i3) / 2.58d) + 100.0d) / 10.0d)
                                    : r5 == 10 ? (float) (((((double) i3) / 5.856d) + 43.5d) / 10.0d)
                                            : (r5 == 9 || r5 == 8)
                                                    ? (float) (((((double) i3) / 4.167d) + 61.7d) / 10.0d)
                                                    : r5 == 6 ? (float) (((((double) i3) / 2.417d) + 105.6d) / 10.0d)
                                                            : r5 == 5
                                                                    ? (float) (((((double) i3) / 2.18d) + 117.0d)
                                                                            / 10.0d)
                                                                    : (float) (((((double) i3) / 2.55d) + 100.0d)
                                                                            / 10.0d);
        }
        if (i == 1) {
            return (float) i3;
        }
        if (i == 2) {
            return (float) i3;
        }
        if (i == 3) {
            return (float) (-((((double) i3) / 11.39d) - 29.93d));
        }
        if (i == 4) {
            return (float) (((double) i3) / 22.73d);
        }
        if (i == 5) {
            return (float) i3;
        }
        if (i == 6) {
            return (float) (((double) i3) * 19.55d);
        }
        if (i == 7) {
            return (float) (((double) i3) / 3.97d);
        }
        if (i == 8) {
            return (float) i3;
        }
        if (i == 9) {
            return (float) i3;
        }
        if (i == 10) {
            return (float) (((double) i3) / 5.115d);
        }
        if (i == 11) {
            return (float) (i3 - 64);
        }
        if (i == 12) {
            return (float) i3;
        }
        if (i == 13) {
            return (float) i3;
        }
        if (i == 14) {
            return (float) (i3 - 100);
        }
        if (i == 15) {
            return (float) (i3 - 100);
        }
        if (i == 16) {
            return (float) i3;
        }
        if (i == 17) {
            return (float) i3;
        }
        if (i == 18) {
            return (float) (((double) i3) / 51.15d);
        }
        if (i == 19) {
            return (float) (((double) i3) / 204.6d);
        }
        if (i == 20) {
            return (float) (((double) i3) / 10.23d);
        }
        return 0.0f;
    }

    /* renamed from: ˊ */
    public static int m173(int i, int i2) {
        return (i << 6) | i2;
    }

    /* renamed from: ˊ */
    public static final String m174(int i) {
        return i == 0 ? "lambda"
                : i == 1 ? "°C"
                        : i == 2 ? "°C"
                                : i == 3 ? "inHg"
                                        : i == 4 ? "psi"
                                                : i == 5 ? "°C"
                                                        : i == 6 ? "rpm"
                                                                : i == 7 ? "km/h"
                                                                        : i == 8 ? "%"
                                                                                : i == 9 ? "%"
                                                                                        : i == 10 ? "psi"
                                                                                                : i == 11 ? "/u00b0"
                                                                                                        : i == 12
                                                                                                                ? "kPa"
                                                                                                                : i == 13
                                                                                                                        ? "g/s"
                                                                                                                        : i == 14
                                                                                                                                ? "%"
                                                                                                                                : i == 15
                                                                                                                                        ? "%"
                                                                                                                                        : i == 16
                                                                                                                                                ? "%"
                                                                                                                                                : i == 17
                                                                                                                                                        ? "%"
                                                                                                                                                        : i == 18
                                                                                                                                                                ? "V"
                                                                                                                                                                : i == 19
                                                                                                                                                                        ? "knock"
                                                                                                                                                                        : i == 20
                                                                                                                                                                                ? "duty"
                                                                                                                                                                                : "";
    }

    /* renamed from: ˋ */
    public static final float m175(int i) {
        if (i == 2) {
            return -40.0f;
        }
        return i == 5 ? -40.0f : 0.0f;
    }

    /* renamed from: ˋ */
    public static final String m176(int i, int i2) {
        String str = "";
        String str2 = i == 0 ? C0483.m2490("Wideband Air/Fuel", new String[0])
                : i == 1 ? C0483.m2490("Exhaust Gas Temperature", new String[0])
                        : i == 2 ? C0483.m2490("Fluid Temperature", new String[0])
                                : i == 3 ? C0483.m2490("Vacuum", new String[0])
                                        : i == 4 ? C0483.m2490("Boost", new String[0])
                                                : i == 5 ? C0483.m2490("Intake Air Temperature", new String[0])
                                                        : i == 6 ? C0483.m2490("RPM", new String[0])
                                                                : i == 7 ? C0483.m2490("Vehicle Speed", new String[0])
                                                                        : i == 8 ? C0483.m2490("Throttle Position",
                                                                                new String[0])
                                                                                : i == 9 ? C0483.m2490("Engine Load",
                                                                                        new String[0])
                                                                                        : i == 10
                                                                                                ? C0483.m2490(
                                                                                                        "Fuel Pressure",
                                                                                                        new String[0])
                                                                                                : i == 11 ? C0483.m2490(
                                                                                                        "Timing",
                                                                                                        new String[0])
                                                                                                        : i == 12
                                                                                                                ? C0483.m2490(
                                                                                                                        "MAP",
                                                                                                                        new String[0])
                                                                                                                : i == 13
                                                                                                                        ? C0483.m2490(
                                                                                                                                "MAF",
                                                                                                                                new String[0])
                                                                                                                        : i == 14
                                                                                                                                ? C0483.m2490(
                                                                                                                                        "Short Term Fuel Trim",
                                                                                                                                        new String[0])
                                                                                                                                : i == 15
                                                                                                                                        ? C0483.m2490(
                                                                                                                                                "Long Term Fuel Trim",
                                                                                                                                                new String[0])
                                                                                                                                        : i == 16
                                                                                                                                                ? C0483.m2490(
                                                                                                                                                        "Narrowband O2 sensor",
                                                                                                                                                        new String[0])
                                                                                                                                                : i == 17
                                                                                                                                                        ? C0483.m2490(
                                                                                                                                                                "Fuel Level",
                                                                                                                                                                new String[0])
                                                                                                                                                        : i == 18
                                                                                                                                                                ? C0483.m2490(
                                                                                                                                                                        "Volt Meter",
                                                                                                                                                                        new String[0])
                                                                                                                                                                : i == 19
                                                                                                                                                                        ? C0483.m2490(
                                                                                                                                                                                "Knock",
                                                                                                                                                                                new String[0])
                                                                                                                                                                        : i == 20
                                                                                                                                                                                ? C0483.m2490(
                                                                                                                                                                                        "Duty Cycle",
                                                                                                                                                                                        new String[0])
                                                                                                                                                                                : "Unknown sensor["
                                                                                                                                                                                        + i
                                                                                                                                                                                        + "]";
        return i2 > 0 ? new StringBuilder(String.valueOf(str2)).append(" ").append(i2 + 1).toString() : str2;
    }

    /* renamed from: ˎ */
    public static final float m177(int i) {
        if (i == 0) {
            return 50.0f;
        }
        if (i == 1) {
            return 1500.0f;
        }
        if (i == 2) {
            return 150.0f;
        }
        if (i == 3) {
            return 30.0f;
        }
        if (i == 4) {
            return 30.0f;
        }
        if (i == 5) {
            return 70.0f;
        }
        if (i == 6) {
            return 8000.0f;
        }
        if (i == 7) {
            return 300.0f;
        }
        if (i == 8) {
            return 100.0f;
        }
        if (i == 9) {
            return 100.0f;
        }
        if (i == 10) {
            return 1000.0f;
        }
        if (i == 11) {
            return 20.0f;
        }
        if (i == 12) {
            return 255.0f;
        }
        if (i == 13) {
            return 120.0f;
        }
        if (i == 14) {
            return 30.0f;
        }
        if (i == 15) {
            return 30.0f;
        }
        if (i == 16) {
            return 100.0f;
        }
        if (i == 17) {
            return 100.0f;
        }
        if (i == 18) {
            return 20.0f;
        }
        if (i == 19) {
            return 10.0f;
        }
        return i == 20 ? 100.0f : 100.0f;
    }

    /* renamed from: ˎ */
    public static final String m178(int i, int i2) {
        String str = "";
        String str2 = i == 0 ? C0483.m2490("WB A/F", new String[0])
                : i == 1 ? C0483.m2490("EGT", new String[0])
                        : i == 2 ? C0483.m2490("FluidTmp", new String[0])
                                : i == 3 ? C0483.m2490("Vacuum", new String[0])
                                        : i == 4 ? C0483.m2490("Boost", new String[0])
                                                : i == 5 ? C0483.m2490("IAT", new String[0])
                                                        : i == 6 ? C0483.m2490("RPM", new String[0])
                                                                : i == 7 ? C0483.m2490("Speed", new String[0])
                                                                        : i == 8 ? C0483.m2490("Thrott", new String[0])
                                                                                : i == 9 ? C0483.m2490("Load",
                                                                                        new String[0])
                                                                                        : i == 10
                                                                                                ? C0483.m2490(
                                                                                                        "FuelPres",
                                                                                                        new String[0])
                                                                                                : i == 11 ? C0483.m2490(
                                                                                                        "Timing",
                                                                                                        new String[0])
                                                                                                        : i == 12
                                                                                                                ? C0483.m2490(
                                                                                                                        "MAP",
                                                                                                                        new String[0])
                                                                                                                : i == 13
                                                                                                                        ? C0483.m2490(
                                                                                                                                "MAF",
                                                                                                                                new String[0])
                                                                                                                        : i == 14
                                                                                                                                ? C0483.m2490(
                                                                                                                                        "STFT",
                                                                                                                                        new String[0])
                                                                                                                                : i == 15
                                                                                                                                        ? C0483.m2490(
                                                                                                                                                "LTFT",
                                                                                                                                                new String[0])
                                                                                                                                        : i == 16
                                                                                                                                                ? C0483.m2490(
                                                                                                                                                        "NB O2",
                                                                                                                                                        new String[0])
                                                                                                                                                : i == 17
                                                                                                                                                        ? C0483.m2490(
                                                                                                                                                                "FuelLevel",
                                                                                                                                                                new String[0])
                                                                                                                                                        : i == 18
                                                                                                                                                                ? C0483.m2490(
                                                                                                                                                                        "Voltage",
                                                                                                                                                                        new String[0])
                                                                                                                                                                : i == 19
                                                                                                                                                                        ? C0483.m2490(
                                                                                                                                                                                "Knock",
                                                                                                                                                                                new String[0])
                                                                                                                                                                        : i == 20
                                                                                                                                                                                ? C0483.m2490(
                                                                                                                                                                                        "DutyCyc",
                                                                                                                                                                                        new String[0])
                                                                                                                                                                                : "Ukn[" + i
                                                                                                                                                                                        + "]";
        return i2 > 0 ? new StringBuilder(String.valueOf(str2)).append(" ").append(i2 + 1).toString() : str2;
    }
}
