package org.prowl.torque.benchmark;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.prowl.torque.R;
import org.prowl.torque.equation.functions.GrowingPointAverage;
import org.prowl.torque.landing.FrontPage;
import p001o.C0114;
import p001o.C0115;
import p001o.C0134;
import p001o.C0209;
import p001o.C0351;
import p001o.C0365;
import p001o.C0483;
import p001o.C0562;
import p001o.C0679;
import p001o.C0839;

public class BenchmarkActivity extends Activity {

    /* renamed from: ˍ */
    private static final Object[][] f6499 = {
            new Object[] { "LELink OBD-II BLE", Integer.valueOf(1), Double.valueOf(19.0d) },
            new Object[] { "PLX Kiwi3 BLE", Integer.valueOf(1), Double.valueOf(10.0d), Double.valueOf(26.0d) },
            new Object[] { "Vgate iCar Pro", Integer.valueOf(1), Double.valueOf(18.0d), Double.valueOf(35.0d) },
            new Object[] { "OBDII Scan Mini", Integer.valueOf(1), Double.valueOf(19.0d), Double.valueOf(31.0d) },
            new Object[] { "OBDLink LX", Integer.valueOf(1), Double.valueOf(55.0d), Double.valueOf(61.0d) },
            new Object[] { "OBDLink MX WiFi (1)", Integer.valueOf(1), Double.valueOf(59.0d) },
            new Object[] { "Generic Clone USB", Integer.valueOf(1), Double.valueOf(71.0d) },
            new Object[] { "LELink OBD-II BLE", Integer.valueOf(2), Double.valueOf(16.0d), Double.valueOf(18.5d) },
            new Object[] { "PLX Kiwi3 BLE", Integer.valueOf(2), Double.valueOf(10.0d), Double.valueOf(25.0d) },
            new Object[] { "OBDII Scan Mini", Integer.valueOf(2), Double.valueOf(18.0d), Double.valueOf(25.0d) },
            new Object[] { "OBDLink LX", Integer.valueOf(2), Double.valueOf(26.0d) },
            new Object[] { "Vgate iCar Pro", Integer.valueOf(2), Double.valueOf(17.5d), Double.valueOf(28.0d) },
            new Object[] { "OBDLink MX WiFi (1)", Integer.valueOf(2), Double.valueOf(36.0d) },
            new Object[] { "Generic Clone USB", Integer.valueOf(2), Double.valueOf(52.0d) },
            new Object[] { "PLX Kiwi3 BLE", Integer.valueOf(3), Double.valueOf(4.0d), Double.valueOf(5.0d) },
            new Object[] { "LELink OBD-II BLE", Integer.valueOf(3), Double.valueOf(5.0d) },
            new Object[] { "Vgate iCar Pro", Integer.valueOf(3), Double.valueOf(5.0d) },
            new Object[] { "OBDII Scan Mini", Integer.valueOf(3), Double.valueOf(5.0d) },
            new Object[] { "Generic Clone USB", Integer.valueOf(3), Double.valueOf(5.2d) },
            new Object[] { "OBDLink MX WiFi (1)", Integer.valueOf(3), Double.valueOf(10.5d) },
            new Object[] { "OBDLink LX", Integer.valueOf(3), Double.valueOf(12.0d) },
            new Object[] { "LELink OBD-II BLE", Integer.valueOf(4), Double.valueOf(5.5d) },
            new Object[] { "Vgate iCar Pro", Integer.valueOf(4), Double.valueOf(5.5d) },
            new Object[] { "OBDII Scan Mini", Integer.valueOf(4), Double.valueOf(5.5d) },
            new Object[] { "PLX Kiwi3 BLE", Integer.valueOf(4), Double.valueOf(5.1d), Double.valueOf(6.0d) },
            new Object[] { "Generic Clone USB", Integer.valueOf(4), Double.valueOf(6.0d) },
            new Object[] { "OBDLink LX", Integer.valueOf(4), Double.valueOf(14.0d) },
            new Object[] { "OBDLink MX WiFi (1)", Integer.valueOf(4), Double.valueOf(38.5d) },
            new Object[] { "LELink OBD-II BLE", Integer.valueOf(5), Double.valueOf(5.5d) },
            new Object[] { "Vgate iCar Pro", Integer.valueOf(5), Double.valueOf(5.5d) },
            new Object[] { "OBDII Scan Mini", Integer.valueOf(5), Double.valueOf(5.5d) },
            new Object[] { "PLX Kiwi3 BLE", Integer.valueOf(5), Double.valueOf(5.1d), Double.valueOf(6.0d) },
            new Object[] { "Generic Clone USB", Integer.valueOf(5), Double.valueOf(6.0d) },
            new Object[] { "OBDLink LX", Integer.valueOf(5), Double.valueOf(14.0d) },
            new Object[] { "OBDLink MX WiFi (1)", Integer.valueOf(5), Double.valueOf(38.5d) },
            new Object[] { "Generic Clone ", Integer.valueOf(6), Double.valueOf(20.0d) },
            new Object[] { "HHOBD Advanced", Integer.valueOf(6), Double.valueOf(20.0d) },
            new Object[] { "LELink OBD-II BLE", Integer.valueOf(6), Double.valueOf(19.0d), Double.valueOf(23.0d) },
            new Object[] { "PLX Kiwi3 BLE", Integer.valueOf(6), Double.valueOf(12.0d), Double.valueOf(29.0d) },
            new Object[] { "OBDII Scan Mini", Integer.valueOf(6), Double.valueOf(20.0d), Double.valueOf(30.0d) },
            new Object[] { "Vgate iCar Pro", Integer.valueOf(6), Double.valueOf(38.0d), Double.valueOf(42.0d) },
            new Object[] { "OBDKey WiFi (1)", Integer.valueOf(6), Double.valueOf(47.0d) },
            new Object[] { "OBDLink LX", Integer.valueOf(6), Double.valueOf(64.0d), Double.valueOf(78.0d) },
            new Object[] { "Generic Clone USB", Integer.valueOf(6), Double.valueOf(85.0d), Double.valueOf(86.0d) },
            new Object[] { "OBDLink MX WiFi (1)", Integer.valueOf(6), Double.valueOf(76.0d), Double.valueOf(87.0d) },
            new Object[] { "OBDLink USB", Integer.valueOf(6), Double.valueOf(125.0d) },
            new Object[] { "LELink OBD-II BLE", Integer.valueOf(7), Double.valueOf(18.0d) },
            new Object[] { "PLX Kiwi3 BLE", Integer.valueOf(7), Double.valueOf(10.0d), Double.valueOf(26.0d) },
            new Object[] { "OBDII Scan Mini", Integer.valueOf(7), Double.valueOf(18.5d), Double.valueOf(29.5d) },
            new Object[] { "Vgate iCar Pro", Integer.valueOf(7), Double.valueOf(33.0d), Double.valueOf(35.0d) },
            new Object[] { "OBDLink LX", Integer.valueOf(7), Double.valueOf(71.0d), Double.valueOf(74.5d) },
            new Object[] { "Generic Clone USB", Integer.valueOf(7), Double.valueOf(75.0d), Double.valueOf(76.0d) },
            new Object[] { "OBDLink MX WiFi (1)", Integer.valueOf(7), Double.valueOf(73.0d), Double.valueOf(84.0d) },
            new Object[] { "LELink OBD-II BLE", Integer.valueOf(8), Double.valueOf(19.0d) },
            new Object[] { "PLX Kiwi3 BLE", Integer.valueOf(8), Double.valueOf(10.0d), Double.valueOf(29.0d) },
            new Object[] { "Vgate iCar Pro", Integer.valueOf(8), Double.valueOf(19.0d), Double.valueOf(42.0d) },
            new Object[] { "OBDII Scan Mini", Integer.valueOf(8), Double.valueOf(19.0d), Double.valueOf(31.0d) },
            new Object[] { "OBDLink LX", Integer.valueOf(8), Double.valueOf(64.0d), Double.valueOf(72.0d) },
            new Object[] { "Generic Clone USB", Integer.valueOf(8), Double.valueOf(81.0d), Double.valueOf(82.0d) },
            new Object[] { "OBDLink MX WiFi (1)", Integer.valueOf(8), Double.valueOf(70.0d), Double.valueOf(90.0d) },
            new Object[] { "LELink OBD-II BLE", Integer.valueOf(9), Double.valueOf(19.0d) },
            new Object[] { "PLX Kiwi3 BLE", Integer.valueOf(9), Double.valueOf(10.0d), Double.valueOf(26.0d) },
            new Object[] { "OBDII Scan Mini", Integer.valueOf(9), Double.valueOf(19.0d), Double.valueOf(29.0d) },
            new Object[] { "Vgate iCar Pro", Integer.valueOf(9), Double.valueOf(19.0d), Double.valueOf(36.0d) },
            new Object[] { "OBDLink LX", Integer.valueOf(9), Double.valueOf(63.0d), Double.valueOf(70.0d) },
            new Object[] { "Generic Clone USB", Integer.valueOf(9), Double.valueOf(71.0d), Double.valueOf(76.0d) },
            new Object[] { "OBDLink MX WiFi (1)", Integer.valueOf(9), Double.valueOf(72.0d), Double.valueOf(80.0d) } };

    /* renamed from: ʻ */
    private LinearLayout f6500;
    /* access modifiers changed from: private */

    /* renamed from: ʼ */
    public C0209 f6501;

    /* renamed from: ʽ */
    private C0134 f6502;
    /* access modifiers changed from: private */

    /* renamed from: ʾ */
    public ArrayList<String> f6503;
    /* access modifiers changed from: private */

    /* renamed from: ʿ */
    public TextView f6504;
    /* access modifiers changed from: private */

    /* renamed from: ˈ */
    public TextView f6505;
    /* access modifiers changed from: private */

    /* renamed from: ˉ */
    public GrowingPointAverage f6506;

    /* renamed from: ˊ */
    private Handler f6507;

    /* renamed from: ˋ */
    private NumberFormat f6508;
    /* access modifiers changed from: private */

    /* renamed from: ˌ */
    public float f6509 = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: ˎ */
    public C0365 f6510;
    /* access modifiers changed from: private */

    /* renamed from: ˏ */
    public boolean f6511 = false;
    /* access modifiers changed from: private */

    /* renamed from: ͺ */
    public C0115 f6512;

    /* renamed from: ᐝ */
    private Timer f6513;
    /* access modifiers changed from: private */

    /* renamed from: ι */
    public ArrayList<C0134> f6514;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (C0351.m1747((Context) this)) {
            setTheme(16973832);
        } else {
            setTheme(16973931);
        }
        getWindow().setBackgroundDrawableResource(R.drawable.APKTOOL_DUMMYVAL_0x7f020003);
        super.onCreate(bundle);
        C0351.m1731(getApplicationContext());
        setTitle(C0483.m2490("OBD Adapter Benchmark", new String[0]));
        C0562.m3038((Context) this);
        this.f6507 = new Handler();
        this.f6508 = NumberFormat.getInstance();
        this.f6508.setMaximumFractionDigits(3);
        this.f6508.setMinimumFractionDigits(0);
        getWindow().setBackgroundDrawableResource(R.drawable.APKTOOL_DUMMYVAL_0x7f020003);
        mo7176();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f6511 = true;
        this.f6510.mo3994();
        if (this.f6513 != null) {
            this.f6513.cancel();
        }
        C0351.f1932 = false;
        C0351.m1773().mo5229(false);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f6511 = false;
        C0351.m1731(getApplicationContext());
        C0562.m3038((Context) this);
        C0351.f1932 = true;
        if (this.f6510 != null) {
            this.f6510.mo3993();
        }
        C0351.m1773().mo5229(true);
        setContentView(this.f6510);
        mo7171();
    }

    /* renamed from: ˊ */
    public void mo7171() {
        this.f6513 = new Timer();
        this.f6513.schedule(new TimerTask() {
            /* JADX WARNING: CFG modification limit reached, blocks count: 174 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                 * r14 = this; long r4 = android.os.SystemClock.elapsedRealtime() r6 = 0 r7 = 0
                 * o.ᵦ r8 = p001o.C0351.m1773() goto L_0x0106 L_0x000c: long r9 =
                 * android.os.SystemClock.elapsedRealtime() // Catch:{ Throwable -> 0x00fb }
                 * long r0 = r9 - r4 r2 = 250(0xfa, double:1.235E-321) int r0 = (r0 > r2 ? 1 :
                 * (r0 == r2 ? 0 : -1)) if (r0 >= 0) goto L_0x0026 r0 = 1092616192(0x41200000,
                 * float:10.0) int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1)) if (r0 <= 0) goto
                 * L_0x0042 long r0 = r9 - r4 r2 = 100 int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 :
                 * -1)) if (r0 <= 0) goto L_0x0042 L_0x0026: long r11 = r9 - r4 float r0 =
                 * (float) r11 // Catch:{ Throwable -> 0x00fb } float r0 = r7 / r0 r1 =
                 * 1132068864(0x437a0000, float:250.0) float r0 = r0 * r1 r7 = r0 r0 = 0 int r0
                 * = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1)) if (r0 <= 0) goto L_0x003c
                 * org.prowl.torque.benchmark.BenchmarkActivity r0 =
                 * org.prowl.torque.benchmark.BenchmarkActivity.this // Catch:{ Throwable ->
                 * 0x00fb } r1 = 1082130432(0x40800000, float:4.0) float r1 = r1 * r7
                 * r0.mo7172(r1) // Catch:{ Throwable -> 0x00fb } L_0x003c: r7 = 0 long r0 =
                 * android.os.SystemClock.elapsedRealtime() // Catch:{ Throwable -> 0x00fb } r4
                 * = r0 L_0x0042: if (r8 == 0) goto L_0x004a boolean r0 = r8.mo5275() // Catch:{
                 * Throwable -> 0x00fb } if (r0 != 0) goto L_0x0058 L_0x004a: r0 = 100
                 * java.lang.Thread.sleep(r0) // Catch:{ Throwable -> 0x0050 } goto L_0x0051
                 * L_0x0050: r11 = move-exception L_0x0051: long r0 =
                 * android.os.SystemClock.elapsedRealtime() // Catch:{ Throwable -> 0x00fb } r4
                 * = r0 goto L_0x0106 L_0x0058: if (r6 != 0) goto L_0x00a1 java.lang.String r0 =
                 * "benchmark" int r11 = r8.mo5235(r0) // Catch:{ Throwable -> 0x00fb } if (r11
                 * != 0) goto L_0x009e r6 = 1 org.prowl.torque.benchmark.BenchmarkActivity r0 =
                 * org.prowl.torque.benchmark.BenchmarkActivity.this // Catch:{ Throwable ->
                 * 0x00fb } java.util.ArrayList r0 = r0.f6514 // Catch:{ Throwable -> 0x00fb }
                 * r0.clear() // Catch:{ Throwable -> 0x00fb }
                 * org.prowl.torque.benchmark.BenchmarkActivity r0 =
                 * org.prowl.torque.benchmark.BenchmarkActivity.this // Catch:{ Throwable ->
                 * 0x00fb } java.util.ArrayList r0 = r0.f6503 // Catch:{ Throwable -> 0x00fb }
                 * r0.clear() // Catch:{ Throwable -> 0x00fb }
                 * org.prowl.torque.benchmark.BenchmarkActivity r0 =
                 * org.prowl.torque.benchmark.BenchmarkActivity.this // Catch:{ Throwable ->
                 * 0x00fb } r0.mo7173() // Catch:{ Throwable -> 0x00fb }
                 * org.prowl.torque.benchmark.BenchmarkActivity r0 =
                 * org.prowl.torque.benchmark.BenchmarkActivity.this // Catch:{ Throwable ->
                 * 0x00fb } o.ᐜ r0 = r0.f6510 // Catch:{ Throwable -> 0x00fb } r1 = 1
                 * r0.mo3990(r1) // Catch:{ Throwable -> 0x00fb }
                 * org.prowl.torque.benchmark.BenchmarkActivity r0 =
                 * org.prowl.torque.benchmark.BenchmarkActivity.this // Catch:{ Throwable ->
                 * 0x00fb } r1 = 0 r0.f6509 = r1 // Catch:{ Throwable -> 0x00fb }
                 * org.prowl.torque.benchmark.BenchmarkActivity r0 =
                 * org.prowl.torque.benchmark.BenchmarkActivity.this // Catch:{ Throwable ->
                 * 0x00fb } org.prowl.torque.equation.functions.GrowingPointAverage r1 = new
                 * org.prowl.torque.equation.functions.GrowingPointAverage // Catch:{ Throwable
                 * -> 0x00fb } r2 = 100 r1.<init>(r2) // Catch:{ Throwable -> 0x00fb } r0.f6506
                 * = r1 // Catch:{ Throwable -> 0x00fb } java.lang.String r0 = "ATI" r1 = 0
                 * r8.mo5246(r1, r0) // Catch:{ Throwable -> 0x00fb } goto L_0x0106 L_0x009e: r6
                 * = 0 goto L_0x0106 L_0x00a1: r11 = 0 r0 = 13 boolean r0 =
                 * p001o.C0351.m1749(r0) // Catch:{ Throwable -> 0x00fb } if (r0 == 0) goto
                 * L_0x00b2 java.lang.String r0 = "010D1" r1 = 0 java.lang.String[] r11 =
                 * r8.mo5246(r1, r0) // Catch:{ Throwable -> 0x00fb } goto L_0x00c1 L_0x00b2: r0
                 * = 12 boolean r0 = p001o.C0351.m1749(r0) // Catch:{ Throwable -> 0x00fb } if
                 * (r0 == 0) goto L_0x00c1 java.lang.String r0 = "010C1" r1 = 0
                 * java.lang.String[] r11 = r8.mo5246(r1, r0) // Catch:{ Throwable -> 0x00fb }
                 * L_0x00c1: if (r11 == 0) goto L_0x00d6 int r0 = r11.length // Catch:{
                 * Throwable -> 0x00fb } if (r0 <= 0) goto L_0x00d6 r0 = 0 r0 = r11[r0] //
                 * Catch:{ Throwable -> 0x00fb } java.lang.String r1 = "41" boolean r0 =
                 * r0.contains(r1) // Catch:{ Throwable -> 0x00fb } if (r0 == 0) goto L_0x00d6
                 * r0 = 1065353216(0x3f800000, float:1.0) float r0 = r0 + r7 r7 = r0 goto
                 * L_0x0106 L_0x00d6: if (r11 == 0) goto L_0x00e6 r0 = 140(0x8c,
                 * double:6.9E-322) java.lang.Thread.sleep(r0) // Catch:{ InterruptedException
                 * -> 0x00de } goto L_0x00df L_0x00de: r12 = move-exception L_0x00df: r7 = 0
                 * long r0 = android.os.SystemClock.elapsedRealtime() // Catch:{ Throwable ->
                 * 0x00fb } r4 = r0 goto L_0x0106 L_0x00e6: java.lang.String r0 = "benchmark" r1
                 * = 0 boolean r12 = r8.mo5231(r0, r1) // Catch:{ Throwable -> 0x00f5 } r0 =
                 * 500(0x1f4, double:2.47E-321) java.lang.Thread.sleep(r0) // Catch:{ Throwable
                 * -> 0x00f3 } goto L_0x00f9 L_0x00f3: r13 = move-exception goto L_0x00f9
                 * L_0x00f5: r12 = move-exception p001o.C0362.m1836(r12) // Catch:{ Throwable ->
                 * 0x00fb } L_0x00f9: r6 = 0 goto L_0x0106 L_0x00fb: r9 = move-exception
                 * p001o.C0362.m1836(r9) r0 = 100 java.lang.Thread.sleep(r0) // Catch:{
                 * Throwable -> 0x0105 } goto L_0x0106 L_0x0105: r10 = move-exception L_0x0106:
                 * org.prowl.torque.benchmark.BenchmarkActivity r0 =
                 * org.prowl.torque.benchmark.BenchmarkActivity.this boolean r0 = r0.f6511 if
                 * (r0 == 0) goto L_0x000c java.lang.String r0 = "benchmark" r1 = 0 boolean r9 =
                 * r8.mo5231(r0, r1) // Catch:{ Throwable -> 0x0116 } goto L_0x011a L_0x0116: r9
                 * = move-exception p001o.C0362.m1836(r9) L_0x011a: return
                 */
                throw new UnsupportedOperationException(
                        "Method not decompiled: org.prowl.torque.benchmark.BenchmarkActivity.C10271.run():void");
            }
        }, 100);
    }

    /* renamed from: ˊ */
    public void mo7172(float f) {
        if (f > this.f6509) {
            this.f6509 = f;
        }
        if (f < 0.5f) {
            f = 0.5f;
        }
        if (this.f6509 <= 0.0f || f >= this.f6509 / 4.0f) {
            float addPoint = this.f6506.addPoint(f);
            synchronized (this.f6501) {
                synchronized (this.f6502) {
                    synchronized (this.f6512) {
                        this.f6502.mo3193(new float[] { 0.0f, 0.0f, addPoint, this.f6509 - addPoint });
                    }
                }
            }
            mo7175();
        }
    }

    /* renamed from: ˋ */
    public void mo7173() {
        Object[][] objArr;
        this.f6503.add(C0483.m2490("Your adapter", new String[0]));
        this.f6514.add(this.f6502);
        int r4 = C0351.m1773().mo5215();
        int i = 1;
        for (Object[] objArr2 : f6499) {
            if (r4 == ((Integer) objArr2[1]).intValue()) {
                float f = 0.0f;
                if (objArr2.length > 3) {
                    f = ((Double) objArr2[3]).floatValue() - ((Double) objArr2[2]).floatValue();
                }
                this.f6514.add(new C0134(new float[] { ((Double) objArr2[2]).floatValue(), f, 0.0f, 0.0f }, i));
                this.f6503.add(String.valueOf(objArr2[0]));
                i++;
            }
        }
        this.f6512 = new C0115(this.f6514, C0483.m2490("Adapter speed in PIDs/sec", new String[0]));
        final C0114 r6 = new C0114((List<String>) this.f6503, this.f6512);
        int[] iArr = new int[this.f6503.size()];
        iArr[0] = Color.rgb(255, 0, 0);
        for (int i2 = 1; i2 < this.f6503.size(); i2++) {
            iArr[i2] = -16776961;
        }
        this.f6507.post(new Runnable() {
            public void run() {
                r6.mo5185(-1);
                BenchmarkActivity.this.f6512.mo5685(-1);
                BenchmarkActivity.this.f6501.mo4113().mo5575(-1);
                BenchmarkActivity.this.f6501.mo4111().mo5575(-1);
                BenchmarkActivity.this.f6501.setDescriptionColor(-1);
                BenchmarkActivity.this.f6512.mo5699(false);
                BenchmarkActivity.this.f6512.mo5692(new int[] { Color.argb(192, 64, 64, 255),
                        Color.argb(192, 140, 140, 140), Color.argb(192, 64, 255, 64), Color.argb(192, 0, 192, 0) });
                BenchmarkActivity.this.f6512.mo3157(0);
                BenchmarkActivity.this.f6501.setTouchEnabled(false);
                BenchmarkActivity.this.f6501.setDrawBarShadow(false);
                BenchmarkActivity.this.f6501
                        .setDescription(C0483.m2490("Comparison of Adapters - bigger means faster", new String[0]));
                BenchmarkActivity.this.f6501.setData(r6);
                BenchmarkActivity.this.f6501.setKeepScreenOn(true);
                BenchmarkActivity.this.f6501.setBackgroundColor(Color.argb(0, 0, 0, 0));
                BenchmarkActivity.this.f6501.setDrawGridBackground(false);
                BenchmarkActivity.this.f6501.mo4113().mo3037(0);
                C0839 r6 = BenchmarkActivity.this.f6501.mo6592();
                r6.mo5580(true);
                r6.mo5575(-1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(Integer.valueOf(Color.argb(192, 64, 64, 255)));
                arrayList2.add("Adapter speed in PIDs/sec");
                arrayList.add(Integer.valueOf(Color.argb(192, 140, 140, 140)));
                arrayList2.add("Difference in speed dependant on handset");
                r6.mo6212((List<Integer>) arrayList, (List<String>) arrayList2);
                BenchmarkActivity.this.f6504
                        .setText(C0483.m2490("Adapter speed using: %1", BenchmarkActivity.this.mo7174()));
                BenchmarkActivity.this.f6505.setText(C0483.m2490(
                        "Tests performed using a Galaxy Note 8 and Pixel 2\n\nNotes:\n(1) Wi-Fi adapters are generally not recommended for Android as most phones will lose their data connectivity to the internet when using them\n\n(2) All adapters tested are standard bluetooth unless 'WiFi', 'USB' or 'BLE' are part of their name",
                        new String[0]));
            }
        });
    }

    /* renamed from: ˎ */
    public String mo7174() {
        C0679 r1 = C0351.m1773();
        return r1 != null ? r1.mo5243(r1.mo5215()) : "Unknown";
    }

    /* renamed from: ˏ */
    public void mo7175() {
        this.f6501.mo4076();
        this.f6501.postInvalidate();
    }

    /* renamed from: ᐝ */
    public void mo7176() {
        this.f6501 = new C0209(this);
        this.f6501.setNoDataText("");
        this.f6501.setNoDataTextDescription("");
        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(true);
        this.f6502 = new C0134(new float[] { 0.0f, 0.0f, 0.0f, 0.0f }, 0);
        this.f6514 = new ArrayList<>();
        this.f6503 = new ArrayList<>();
        this.f6506 = new GrowingPointAverage(100);
        this.f6510 = new C0365(this);
        if (C0351.m1773().mo5275()) {
            this.f6510.setInfo(C0483.m2490("Refreshing data, please wait...", new String[0]),
                    R.drawable.APKTOOL_DUMMYVAL_0x7f020007);
            this.f6510.setRotate(true);
        } else {
            this.f6510.setInfo(C0483.m2490("Connect to vehicle ECU to start benchmark", new String[0]),
                    R.drawable.APKTOOL_DUMMYVAL_0x7f020005);
            this.f6510.setRotate(false);
        }
        this.f6510.mo3990(false);
        this.f6500 = new LinearLayout(this);
        this.f6500.setBackgroundColor(0);
        this.f6500.setWeightSum(1.0f);
        this.f6500.setOrientation(1);
        this.f6500.setKeepScreenOn(true);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setBackgroundColor(0);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-1, -1));
        this.f6504 = new TextView(this);
        this.f6505 = new TextView(this);
        linearLayout.addView(this.f6504, new LayoutParams(-1, -2));
        linearLayout.addView(this.f6501, new LayoutParams(-1, (int) (FrontPage.f6811 * 400.0f)));
        linearLayout.addView(this.f6505, new LayoutParams(-1, -2));
        scrollView.addView(linearLayout);
        this.f6510.setView(scrollView);
    }
}
