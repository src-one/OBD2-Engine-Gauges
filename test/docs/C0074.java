package p001o;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.achartengine.chart.BarChart;
import org.prowl.torque.comms.utils.p002vw.VWPID;
import org.prowl.torque.pid.PID;
import twitter4j.MediaEntity.Size;

/* renamed from: o.ʋ */
public class C0074 {

    /* renamed from: ˊ */
    public static final C0073[] f480 = { new C0073(0, "", ""), new C0073(1, "0.2*A*B", "rpm"),
            new C0073(2, "A*0.002*B", "%"), new C0073(3, "0.002*A*B", "Deg"),
            new C0073(4, "ABS(B-127)*0.01*A", "ATDC/BTDC"), new C0073(5, "A*(B-100)*0.1", "°C"),
            new C0073(6, "0.001*A*B", "V"), new C0073(7, "0.01*A*B", "km/h"), new C0073(8, "0.1*A*B", ""),
            new C0073(9, "(B-127)*0.02*A", "Deg"), new C0073(10, "B", "Warm/Cold"),
            new C0073(11, "(0.0001*A*(B-128))+1", ""), new C0073(12, "0.001*A*B", "Ohm"),
            new C0073(13, "(B-127)*0.001*A", "mm"), new C0073(14, "0.005*A*B", C0432.f2510),
            new C0073(15, "0.01*A*B", "ms"), new C0073(16, "A", "Bitmap"), new C0073(17, "CHR(A)+CHR(B)", "Text"),
            new C0073(18, "0.04*A*B", "mbar"), new C0073(19, "A*B*0.1", "l"), new C0073(20, "(A*(B-128))/128", "%"),
            new C0073(21, "0.001*A*B", "V"), new C0073(22, "0.001*A*B", "ms"), new C0073(23, "(B/256)*A", "%"),
            new C0073(24, "0.001*A*B", "A"), new C0073(25, "(B*1.421)+(A/182)", "g/s"), new C0073(26, "B-A", "C"),
            new C0073(27, "ABS(B-128)*0.01*A", "ATDC/BTDC"), new C0073(28, "B-A", ""), new C0073(29, "", "Kennfeld"),
            new C0073(30, "(B/12)*A", "Deg k/w"), new C0073(31, "(B/2560)*A", "°C"), new C0073(32, "B", ""),
            new C0073(33, "(100*B)/A", "%"), new C0073(34, "(B-128)*0.01*A", "kW"), new C0073(35, "0.01*A*B", "l/h"),
            new C0073(36, "((A*2560)+B)*10", "km"), new C0073(37, "", ""), new C0073(38, "(B-128)*0.001*A", "Deg k/w"),
            new C0073(39, "(B/256)*A", "mg/h"), new C0073(40, "((B*0.1)+(25.5*A))-400", "A"),
            new C0073(41, "B+(A*255)", "Ah"), new C0073(42, "(B*0.1)+(25.5*A)-400", "kW"),
            new C0073(43, "(B*0.1)+(25.5*A)", "V"), new C0073(44, "", ""), new C0073(45, "((0.1*A)*B)/100", ""),
            new C0073(46, "(A*B-3200)*0.0027", "Deg k/w"), new C0073(47, "(B-128)*A", "ms"),
            new C0073(48, "B+(A*255)", ""), new C0073(49, "(B/4)*0.1*A", "mg/h"),
            new C0073(50, "(B-128)/(0.01*A)", "mbar"), new C0073(51, "((B-128)/255)*A", "mg/h"),
            new C0073(52, "(B*0.02*A)-A", "Nm"), new C0073(53, "(B-128)*1.422+0.006*A", "g/s"),
            new C0073(54, "(A*256)+B", "Add"), new C0073(55, "A*B/200", "s"), new C0073(56, "(A*256)+B", "WSC"),
            new C0073(57, "A*256+B+65536", "WSC"), new C0073(58, "1.0225*B", "\\s"),
            new C0073(59, "((A*256)+B)/32768", ""), new C0073(60, "((A*256)+B)*0.01", "sec"),
            new C0073(61, "(B-128)/A", ""), new C0073(62, "0.256*A*B", "S"), new C0073(63, "", ""),
            new C0073(64, "A+B", "Ohm"), new C0073(65, "0.01 * A * (B-127)", "mm"), new C0073(66, "(A*B)/511.12", "V"),
            new C0073(67, "((640*A)+B)*2.5", "Deg"), new C0073(68, "((256*A)+B)/7.365", "deg/s"),
            new C0073(69, "((256*A)+B)*0.3254", BarChart.f5569), new C0073(70, "((256*A)+B)*0.192", "m/s2"),
            new C0073(71, "A*B", ""), new C0073(72, "(((211-A)*B)+(A*255))*100/4080", ""), new C0073(73, "A*B", ""),
            new C0073(74, "A*B", ""), new C0073(75, "", ""), new C0073(76, "(A*255)+B", ""),
            new C0073(77, "((A*6275) + (B*1470))/100", ""), new C0073(78, "B*1819 / 10", ""), new C0073(79, "B", ""),
            new C0073(80, "", ""), new C0073(81, "((A * 112000) + (B * 436)) / 1000", ""),
            new C0073(82, "((A * 25114) + (B * 98)) / 100", ""), new C0073(83, "", ""), new C0073(84, "", ""),
            new C0073(85, "((A * 7334) + (B * 29)) / 10", ""), new C0073(86, "A*B", ""), new C0073(87, "A*(B-128)", ""),
            new C0073(88, "A*B", ""), new C0073(89, "", ""), new C0073(90, "A*B", ""), new C0073(91, "(A-128)*B", ""),
            new C0073(92, "A*B", ""), new C0073(93, "A*(B-128)", ""), new C0073(94, "(A-128)*B", ""),
            new C0073(95, "", ""), new C0073(96, "A*B", ""), new C0073(97, "(B-A)*5", ""), new C0073(98, "A*B", ""),
            new C0073(99, "", ""), new C0073(100, "A*B", ""), new C0073(Size.f9552, "A*B", ""),
            new C0073(102, "A*B", ""), new C0073(103, "((A*20)+B)*5", ""), new C0073(104, "(A*(B-128))*2", ""),
            new C0073(105, "A*(B-128)", ""), new C0073(106, "A*(B-128)", ""), new C0073(107, "", "") };

    /* renamed from: ˋ */
    private static int f481 = 0;

    /* renamed from: ˎ */
    private static final Map<Integer, Boolean> f482 = new HashMap();

    /* renamed from: ˏ */
    private static final Map<Integer, Boolean> f483 = new HashMap();

    /* renamed from: ˊ */
    public static final VWPID m472(C0679 r10, OutputStream outputStream, C0056 r12) throws IOException {
        VWPID[] r3 = r12.mo2910();
        VWPID vwpid = r3[f481 % r3.length];
        VWPID vwpid2 = null;
        if (vwpid.mo7592() || (vwpid.mo7240() != 0 && C0351.m1757(Integer.valueOf(vwpid.mo7240())))) {
            int parseInt = Integer.parseInt(vwpid.mo7572().substring(2, 4), 16);
            Boolean bool = (Boolean) f482.get(Integer.valueOf(parseInt));
            Boolean bool2 = (Boolean) f483.get(Integer.valueOf(parseInt));
            if ((bool == null || !bool.booleanValue()) && (bool2 == null || bool2.booleanValue())) {
                r10.mo5223(outputStream,
                        new StringBuilder(String.valueOf(vwpid.mo7572().substring(0, 4))).append("\r").toString(), 50);
                f482.put(Integer.valueOf(parseInt), Boolean.valueOf(true));
                vwpid2 = vwpid;
            }
        }
        f481++;
        if (f481 == r3.length) {
            f482.clear();
            f481 = 0;
        }
        return vwpid2;
    }

    /* renamed from: ˊ */
    private static final PID m473(long j) {
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

    /* renamed from: ˊ */
    public static final void m474(C0679 r31, VWPID vwpid, C0056 r33) throws IOException {
        String[] r4 = r31.mo5279();
        int parseInt = (Integer.parseInt(vwpid.mo7572().substring(2, 4), 16) - 1) * 4;
        int parseInt2 = Integer.parseInt(vwpid.mo7572().substring(2, 4), 16);
        if (r4.length == 0 || (r4.length > 0 && (r4[0].length() == 0 || r4[0].startsWith("NA")))) {
            C0362.m1835("No response for display: " + C0211.m974(parseInt / 4));
            f483.put(Integer.valueOf(parseInt / 4), Boolean.valueOf(false));
            return;
        }
        f483.put(Integer.valueOf(parseInt), Boolean.valueOf(true));
        VWPID[] r7 = r33.mo2910();
        int i = 1;
        String[] strArr = r4;
        int length = r4.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                String replace = strArr[i2].replace(" ", "");
                int parseInt3 = Integer.parseInt(replace.substring(0, 2), 16);
                String substring = replace.substring(0, 2);
                String substring2 = replace.substring(2, 4);
                String substring3 = replace.substring(4, 6);
                if (parseInt3 == 141) {
                    break;
                }
                if (parseInt3 < f480.length) {
                    C0073 r18 = f480[parseInt3];
                    VWPID[] vwpidArr = r7;
                    int length2 = r7.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        VWPID vwpid2 = vwpidArr[i3];
                        int parseInt4 = Integer.parseInt(vwpid2.mo7572().substring(2, 4), 16);
                        int parseInt5 = Integer.parseInt(vwpid2.mo7572().substring(4, 6), 16);
                        if (parseInt4 == parseInt2 && parseInt5 == i) {
                            vwpid2.mo7590(r18.mo2987());
                            String sb = new StringBuilder(String.valueOf(substring2)).append(substring3).toString();
                            float r26 = C0679.m3735((PID) vwpid2, sb, 1,
                                    new StringBuilder(String.valueOf(substring)).append(sb).toString());
                            vwpid2.mo7577(Float.valueOf(r26));
                            vwpid2.mo7271(r18.mo2989());
                            if (vwpid2.mo7240() != 0) {
                                PID r27 = m473((long) vwpid2.mo7240());
                                if (r27.mo7627() != null) {
                                    C0351.m1728(vwpid2.mo7240(),
                                            (Object) Float.valueOf(C0248.m1238(vwpid2.mo7627(), r27.mo7627(), r26)));
                                }
                            }
                        }
                    }
                }
                parseInt++;
                i++;
                i2++;
            } catch (Throwable th) {
                C0362.m1836(th);
            }
        }
    }
}
