package org.prowl.torque.modefive;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableRow;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.PointStyle;
import org.achartengine.chart.TimeChart;
import org.achartengine.model.TimeSeries;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;
import org.prowl.torque.R;
import org.prowl.torque.landing.FrontPage;
import org.prowl.torque.pid.PID;
import org.prowl.torque.speech.SpeechUtils;
import p001o.C0012;
import p001o.C0211;
import p001o.C0351;
import p001o.C0362;
import p001o.C0365;
import p001o.C0483;
import p001o.C0562;
import p001o.C0679;
import p001o.C0699;
import p001o.C0702;

public class ModeFiveActivity extends Activity {

    /* renamed from: ʻ */
    public static final String f7225 = C0483.m2490("Screenshot", new String[0]);

    /* renamed from: ʼ */
    public static final String f7226 = C0483.m2490("O2 Data", new String[0]);

    /* renamed from: ʽ */
    public static final String f7227 = C0483.m2490("Test status View", new String[0]);

    /* renamed from: ʾ */
    public static final String[] f7228 = { "Rich to Lean sensor threshold voltage(constant)",
            "Lean to Rich sensor threshold voltage(constant)", "Low sensor Voltage for switch time calculation",
            "High sensor Voltage for switch time calculation", "Rich to Lean sensor switch time(calculated)",
            "Lean to Rich sensor switch time(calculated)", "Minimum sensor Voltage for test cycle(calculated)",
            "Maximum sensor Voltage for test cycle(calculated)", "Time between sensor transitions(calculated)",
            "Sensor period(calculated)", "EWMA Misfire counts (average) for last 10 drive cycles",
            "Misfire counts for last/current driving cycles(calculated)" };

    /* renamed from: ʿ */
    public static final String[] f7229 = { "O2 Bank 1 Sensor 1", "O2 Bank 1 Sensor 2", "O2 Bank 1 Sensor 3",
            "O2 Bank 1 Sensor 4", "O2 Bank 2 Sensor 1", "O2 Bank 2 Sensor 2", "O2 Bank 2 Sensor 3",
            "O2 Bank 2 Sensor 4" };

    /* renamed from: ˈ */
    public static final String[] f7230 = { "O2 Bank 1 Sensor 1", "O2 Bank 1 Sensor 2", "O2 Bank 1 Sensor 3",
            "O2 Bank 1 Sensor 4", "O2 Bank 2 Sensor 1", "O2 Bank 2 Sensor 2", "O2 Bank 2 Sensor 3",
            "O2 Bank 2 Sensor 4", "O2 Bank 3 Sensor 1", "O2 Bank 3 Sensor 2", "O2 Bank 3 Sensor 3",
            "O2 Bank 3 Sensor 4", "O2 Bank 4 Sensor 1", "O2 Bank 4 Sensor 2", "O2 Bank 4 Sensor 3",
            "O2 Bank 4 Sensor 4" };

    /* renamed from: ˉ */
    public static final String[] f7231 = { "IDs supported $00-$20", "O2 Bank 1 Sensor 1", "O2 Bank 1 Sensor 2",
            "O2 Bank 1 Sensor 3", "O2 Bank 1 Sensor 4", "O2 Bank 2 Sensor 1", "O2 Bank 2 Sensor 2",
            "O2 Bank 2 Sensor 3", "O2 Bank 2 Sensor 4", "O2 Bank 3 Sensor 1", "O2 Bank 3 Sensor 2",
            "O2 Bank 3 Sensor 3", "O2 Bank 3 Sensor 4", "O2 Bank 4 Sensor 1", "O2 Bank 4 Sensor 2",
            "O2 Bank 4 Sensor 3", "O2 Bank 4 Sensor 4", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "Catalyst Monitor Bank 1", "Catalyst Monitor Bank 2", "Catalyst Monitor Bank 3", "Catalyst Monitor Bank 4",
            "", "", "", "", "", "", "", "", "", "", "", "", "EGR Monitor Bank 1", "EGR Monitor Bank 2",
            "EGR Monitor Bank 3", "EGR Monitor Bank 4", "", "", "", "", "", "EVAP Monitor (cap off)",
            "EVAP Monitor (0.090\")", "EVAP Monitor (0.040\")", "EVAP Monitor (0.020\")", "Purge Flow Monitor", "", "",
            "O2 Heater Monitor Bank 1 - Sensor 1", "O2 Heater Monitor Bank 1 - Sensor 2",
            "O2 Heater Monitor Bank 1 - Sensor 3", "O2 Heater Monitor Bank 1 - Sensor 4",
            "O2 Heater Monitor Bank 2 - Sensor 1", "O2 Heater Monitor Bank 2 - Sensor 2",
            "O2 Heater Monitor Bank 2 - Sensor 3", "O2 Heater Monitor Bank 2 - Sensor 4",
            "O2 Heater Monitor Bank 3 - Sensor 1", "O2 Heater Monitor Bank 3 - Sensor 2",
            "O2 Heater Monitor Bank 3 - Sensor 3", "O2 Heater Monitor Bank 3 - Sensor 4",
            "O2 Heater Monitor Bank 4 - Sensor 1", "O2 Heater Monitor Bank 4 - Sensor 2",
            "O2 Heater Monitor Bank 4 - Sensor 3", "O2 Heater Monitor Bank 4 - Sensor 4", "", "", "", "", "", "", "",
            "", "", "", "", "", "", "", "", "", "Heated Catalyst Monitor Bank 1", "Heated Catalyst Monitor Bank 2",
            "Heated Catalyst Monitor Bank 3", "Heated Catalyst Monitor Bank 4", "", "", "", "", "", "", "", "", "", "",
            "", "", "Secondary Air Monitor 1", "Secondary Air Monitor 2", "Secondary Air Monitor 3",
            "Secondary Air Monitor 4", "", "", "", "", "", "", "", "", "", "", "", "", "Fuel System Monitor Bank 1",
            "Fuel System Monitor Bank 2", "Fuel System Monitor Bank 3", "Fuel System Monitor Bank 4", "", "", "", "",
            "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "Misfire Monitor General Data", "Misfire Cylinder 1 Data", "Misfire Cylinder 2 Data",
            "Misfire Cylinder 3 Data", "Misfire Cylinder 4 Data", "Misfire Cylinder 5 Data", "Misfire Cylinder 6 Data",
            "Misfire Cylinder 7 Data", "Misfire Cylinder 8 Data", "Misfire Cylinder 9 Data", "Misfire Cylinder 10 Data",
            "Misfire Cylinder 11 Data", "Misfire Cylinder 12 Data", "", "", "", "" };

    /* renamed from: ˊ */
    public static final String f7232 = "PIDEditor_TESTPID";

    /* renamed from: ˌ */
    public static final float[] f7233 = { 0.0f, 0.005f, 0.005f, 0.005f, 0.005f, 0.004f, 0.004f, 0.005f, 0.005f, 0.04f,
            0.04f };

    /* renamed from: ˍ */
    public static final String[] f7234 = { "", "V", "V", "V", "V", "s", "s", "V", "V", "s", "s" };

    /* renamed from: ˏ */
    public static final String f7235 = C0483.m2490("Choose O2 Sensor", new String[0]);

    /* renamed from: ͺ */
    public static final String f7236 = C0483.m2490("Help", new String[0]);

    /* renamed from: ᐝ */
    public static final String f7237 = C0483.m2490("Refresh", new String[0]);

    /* renamed from: ᐧ */
    private static final File f7238 = new File(
            Environment.getExternalStorageDirectory() + File.separator + ".torque" + File.separator + "screenshot.jpg");

    /* renamed from: ι */
    public static final String f7239 = C0483.m2490("Send", new String[0]);

    /* renamed from: ʳ */
    private ListView f7240;
    /* access modifiers changed from: private */

    /* renamed from: ʴ */
    public C0702 f7241;

    /* renamed from: ʹ */
    private int f7242 = 300;

    /* renamed from: ˆ */
    private Handler f7243;

    /* renamed from: ˇ */
    private NumberFormat f7244;

    /* renamed from: ˋ */
    public int f7245 = 0;

    /* renamed from: ˎ */
    public boolean f7246 = false;

    /* renamed from: ˑ */
    public boolean f7247 = true;
    /* access modifiers changed from: private */

    /* renamed from: ˡ */
    public PID f7248;
    /* access modifiers changed from: private */

    /* renamed from: ˮ */
    public long f7249 = 0;
    /* access modifiers changed from: private */

    /* renamed from: ՙ */
    public long f7250 = 0;
    /* access modifiers changed from: private */

    /* renamed from: י */
    public long f7251 = 0;

    /* renamed from: ـ */
    private float f7252 = FrontPage.f6811;

    /* renamed from: ٴ */
    private Timer f7253;
    /* access modifiers changed from: private */

    /* renamed from: ᐨ */
    public C0699 f7254;

    /* renamed from: ᴵ */
    private Timer f7255;

    /* renamed from: ᵎ */
    private AbstractChart f7256;
    /* access modifiers changed from: private */

    /* renamed from: ᵔ */
    public GraphicalView f7257;
    /* access modifiers changed from: private */

    /* renamed from: ᵢ */
    public XYMultipleSeriesRenderer f7258;

    /* renamed from: ⁱ */
    private XYMultipleSeriesDataset f7259 = new XYMultipleSeriesDataset();

    /* renamed from: ﹳ */
    private boolean f7260 = false;
    /* access modifiers changed from: private */

    /* renamed from: ﹶ */
    public C1163if f7261;

    /* renamed from: ﹺ */
    private long f7262 = 0;

    /* renamed from: ｰ */
    private LinearLayout f7263;
    /* access modifiers changed from: private */

    /* renamed from: ﾞ */
    public C0365 f7264;

    /* renamed from: org.prowl.torque.modefive.ModeFiveActivity$if */
    public class C1163if extends TimeSeries {
        public C1163if(String str) {
            super(str);
        }

        /* renamed from: ˊ */
        public void mo7557() {
        }

        /* renamed from: ˋ */
        public double mo7558() {
            return 1.3d;
        }
    }

    /* renamed from: ˊ */
    public static final float m6298(float f) {
        return f < 32768.0f ? f : -(32768.0f - (f - 32768.0f));
    }

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
        setTitle(C0483.m2490("Vehicle test results", new String[0]));
        C0562.m3038((Context) this);
        this.f7243 = new Handler();
        FrontPage.m6034(C0483.m2490("Press 'Menu' for more options", new String[0]));
        this.f7244 = NumberFormat.getInstance();
        this.f7244.setMaximumFractionDigits(3);
        this.f7244.setMinimumFractionDigits(0);
        getWindow().setBackgroundDrawableResource(R.drawable.APKTOOL_DUMMYVAL_0x7f020003);
        this.f7248 = mo7540(this.f7245);
        mo7543();
    }

    public void onLowMemory() {
        super.onLowMemory();
        C0012.m70();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (f7227.equals(menuItem.getTitle())) {
            this.f7246 = false;
            this.f7264.setView(this.f7240);
            setTitle(C0483.m2490("Vehicle test results", new String[0]));
        } else if (f7226.equals(menuItem.getTitle())) {
            this.f7246 = true;
            this.f7264.setView(this.f7263);
            setTitle(C0483.m2490("O2 test results", new String[0]));
        } else if (f7225.equals(menuItem.getTitle())) {
            mo7541();
        } else if (f7239.equals(menuItem.getTitle())) {
            mo7548();
        } else if (f7236.equals(menuItem.getTitle())) {
            startActivity(
                    new Intent("android.intent.action.VIEW", Uri.parse("http://torque-bhp.com/wiki/Vehicle_Tests"))
                            .setFlags(1610612740));
        } else if (f7235.equals(menuItem.getTitle())) {
            final Dialog dialog = new Dialog(this);
            dialog.setTitle(C0483.m2490("Select sensor to monitor", new String[0]));
            ListView listView = new ListView(this);
            listView.setLayoutParams(new LayoutParams(-1, -1));
            listView.setChoiceMode(1);
            dialog.setOnCancelListener(new OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    try {
                        dialog.dismiss();
                    } catch (Throwable th) {
                    }
                }
            });
            listView.setAdapter(new ArrayAdapter(this, 17367043, f7229));
            listView.setOnItemClickListener(new OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    ModeFiveActivity.this.f7245 = i;
                    if (ModeFiveActivity.this.f7248 != null) {
                        FrontPage.m6035(ModeFiveActivity.this.f7248);
                    }
                    ModeFiveActivity.this.f7248 = ModeFiveActivity.this.mo7540(ModeFiveActivity.this.f7245);
                    FrontPage.m6109(ModeFiveActivity.this.f7248);
                    ModeFiveActivity.this.f7261.clear();
                    ModeFiveActivity.this.f7254
                            .setTitle(new StringBuilder(String.valueOf(C0483.m2490("O2 Test results", new String[0])))
                                    .append(" - ").append(C0483
                                            .m2490(ModeFiveActivity.f7229[ModeFiveActivity.this.f7245], new String[0]))
                                    .toString());
                    ModeFiveActivity.this.f7258.setYTitle(C0483.m2490(
                            "Live O2 Data - " + ModeFiveActivity.f7230[ModeFiveActivity.this.f7245], new String[0]));
                    try {
                        dialog.dismiss();
                    } catch (Throwable th) {
                    }
                }
            });
            dialog.getWindow().setFlags(1024, 1024);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            linearLayout.addView(listView);
            dialog.setContentView(linearLayout);
            dialog.show();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f7260 = true;
        this.f7264.mo3994();
        if (this.f7253 != null) {
            this.f7253.cancel();
        }
        if (this.f7255 != null) {
            this.f7255.cancel();
        }
        C0351.m1773().mo5229(false);
        FrontPage.m6035(this.f7248);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        if (this.f7246) {
            menu.add(f7227).setIcon(17301591);
            menu.add(f7235).setIcon(17301591);
        } else {
            menu.add(f7226).setIcon(17301591);
        }
        menu.add(f7239).setIcon(17301586);
        menu.add(f7225).setIcon(17301586);
        menu.add(f7236).setIcon(17301568);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C0351.m1731(getApplicationContext());
        C0562.m3038((Context) this);
        mo7546();
        this.f7260 = false;
        if (this.f7264 != null) {
            this.f7264.mo3993();
        }
        C0351.m1773().mo5229(true);
        FrontPage.m6109(this.f7248);
        setContentView(this.f7264);
        synchronized (this.f7261) {
            this.f7261.clear();
        }
    }

    /* renamed from: ˊ */
    public TableRow mo7537(View view, View view2, boolean z) {
        TableRow tableRow = new TableRow(this);
        if (z) {
            tableRow.setGravity(17);
        }
        tableRow.addView(view);
        if (view2 != null) {
            tableRow.addView(view2);
        }
        return tableRow;
    }

    /* renamed from: ˊ */
    public TableRow mo7538(View view, boolean z) {
        return mo7537(view, null, z);
    }

    /* renamed from: ˊ */
    public String mo7539(Float f, int i) {
        Object[] r3 = mo7545(f, i);
        return new StringBuilder(String.valueOf(this.f7244.format((Float) r3[0]))).append(" ").append((String) r3[1])
                .toString();
    }

    /* renamed from: ˊ */
    public PID mo7540(int i) {
        PID pid = new PID(Integer.parseInt("0114", 16) + i);
        pid.mo7584(f7229[i]);
        pid.mo7590("A/200");
        pid.mo7582("PIDEditor_TESTPID");
        pid.mo7586(true);
        pid.mo7271("V");
        return pid;
    }

    /* renamed from: ˊ */
    public void mo7541() {
        f7238.delete();
        try {
            View view = this.f7263;
            if (!this.f7246) {
                view = this.f7240;
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            FileOutputStream fileOutputStream = new FileOutputStream(f7238);
            createBitmap.compress(CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            Toast.makeText(this,
                    C0483.m2490(
                            "Unable to grab image for sharing. Please make sure your SD/Memory expansion card is ok",
                            new String[0]),
                    1).show();
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/jpeg");
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(f7238));
        intent.addFlags(1);
        intent.addFlags(268435456);
        startActivity(Intent.createChooser(intent, C0483.m2490("Share via:", new String[0])));
    }

    /* renamed from: ˊ */
    public void mo7542(float f, float f2) {
        synchronized (this.f7261) {
            this.f7261.add(new Date((long) f), (double) f2);
            if (this.f7261.getItemCount() > this.f7242) {
                this.f7261.remove(0, false);
            }
        }
    }

    /* renamed from: ˋ */
    public void mo7543() {
        this.f7240 = new ListView(this);
        this.f7240.setLayoutParams(new LayoutParams(-1, -1));
        this.f7240.setKeepScreenOn(true);
        this.f7240.setChoiceMode(1);
        this.f7241 = new C0702(this);
        this.f7240.setAdapter(this.f7241);
        this.f7264 = new C0365(this);
        if (C0351.m1773().mo5275()) {
            this.f7264.setInfo(C0483.m2490("Refreshing data, please wait...", new String[0]),
                    R.drawable.APKTOOL_DUMMYVAL_0x7f020007);
            this.f7264.setRotate(true);
        } else {
            this.f7264.setInfo(C0483.m2490("Connect to vehicle ECU first", new String[0]),
                    R.drawable.APKTOOL_DUMMYVAL_0x7f020005);
            this.f7264.setRotate(false);
        }
        this.f7264.mo3990(false);
        this.f7263 = new LinearLayout(this);
        this.f7263.setWeightSum(1.0f);
        this.f7263.setOrientation(1);
        XYSeriesRenderer xYSeriesRenderer = new XYSeriesRenderer();
        xYSeriesRenderer.setColor(-256);
        xYSeriesRenderer.setPointStyle(PointStyle.CIRCLE);
        xYSeriesRenderer.setFillBelowLine(false);
        xYSeriesRenderer.setLineWidth(this.f7252 * 2.0f);
        xYSeriesRenderer.setFillBelowLineColor(Color.argb(100, 100, 100, 0));
        xYSeriesRenderer.setFillPoints(true);
        this.f7259 = new XYMultipleSeriesDataset();
        this.f7258 = new XYMultipleSeriesRenderer(1);
        this.f7258.setApplyBackgroundColor(true);
        this.f7258.setBackgroundColor(Color.argb(0, 0, 55, 0));
        this.f7258.setShowGrid(true);
        this.f7258.setMarginsColor(Color.argb(0, 0, 55, 0));
        this.f7258.addSeriesRenderer(xYSeriesRenderer);
        this.f7258.setYAxisMax(1.3d);
        this.f7258.setYAxisMin(0.0d);
        this.f7258.setXTitle(C0483.m2490(TimeChart.f5623, new String[0]));
        this.f7258.setYTitle(C0483.m2490("Live O2 Data - " + f7230[this.f7245], new String[0]));
        this.f7261 = new C1163if(this.f7248.mo7617());
        this.f7259.addSeries(this.f7261);
        this.f7257 = ChartFactory.getTimeChartView(this, this.f7259, this.f7258, "HH:mm:ss");
        this.f7258.setAntialiasing(true);
        this.f7258.setPanEnabled(false, false);
        this.f7258.setZoomButtonsVisible(false);
        this.f7258.setZoomEnabled(false);
        this.f7258.setShowLegend(false);
        this.f7258.setClickEnabled(false);
        this.f7257.setClickable(false);
        this.f7258.setZoomEnabled(false, false);
        this.f7258.setChartTitleTextSize(this.f7252 * 16.0f);
        this.f7258.setLegendTextSize(this.f7252 * 16.0f);
        this.f7258.setAxisTitleTextSize(this.f7252 * 14.0f);
        this.f7258.setLegendHeight((int) (this.f7252 * 48.0f));
        this.f7258.setLabelsTextSize(this.f7252 * 12.0f);
        this.f7254 = new C0699(this);
        this.f7254.setTitle(new StringBuilder(String.valueOf(C0483.m2490("O2 Test results", new String[0])))
                .append(" - ").append(C0483.m2490(f7230[this.f7245], new String[0])).toString());
        this.f7263.addView(this.f7257, new LinearLayout.LayoutParams(-1, -1, 0.5f));
        this.f7263.addView(this.f7254, new LinearLayout.LayoutParams(-1, -1, 0.5f));
        new LinearLayout.LayoutParams(-1, -1);
        this.f7264.setView(this.f7240);
    }

    /* renamed from: ˋ */
    public void mo7544(int i) {
        int i2 = i + 1;
        try {
            this.f7243.post(new Runnable() {
                public void run() {
                    ModeFiveActivity.this
                            .setTitle(new StringBuilder(String.valueOf(C0483.m2490("O2 Test results", new String[0])))
                                    .append(" - ").append(C0483
                                            .m2490(ModeFiveActivity.f7230[ModeFiveActivity.this.f7245], new String[0]))
                                    .toString());
                }
            });
            C0679 r4 = C0351.m1773();
            if (r4.mo5275()) {
                r4.mo5260(C0679.f3900, "06" + C0211.m974(i2));
                if (!(r4.mo5216(C0211.m974(i2) + "01value") == null && r4.mo5216(C0211.m974(i2) + "0avalue") == null
                        && r4.mo5216(C0211.m974(i2) + "09value") == null)) {
                    try {
                        this.f7254.setPid01(((Float) mo7545(r4.mo5216(C0211.m974(i2) + "01value"),
                                r4.mo5216(C0211.m974(i2) + "01unitAndScaling").intValue())[0]).floatValue());
                    } catch (Throwable th) {
                    }
                    try {
                        this.f7254.setPid02(((Float) mo7545(r4.mo5216(C0211.m974(i2) + "02value"),
                                r4.mo5216(C0211.m974(i2) + "02unitAndScaling").intValue())[0]).floatValue());
                    } catch (Throwable th2) {
                    }
                    try {
                        this.f7254.setPid03(((Float) mo7545(r4.mo5216(C0211.m974(i2) + "03value"),
                                r4.mo5216(C0211.m974(i2) + "03unitAndScaling").intValue())[0]).floatValue());
                    } catch (Throwable th3) {
                    }
                    try {
                        this.f7254.setPid04(((Float) mo7545(r4.mo5216(C0211.m974(i2) + "04value"),
                                r4.mo5216(C0211.m974(i2) + "04unitAndScaling").intValue())[0]).floatValue());
                    } catch (Throwable th4) {
                    }
                    try {
                        this.f7254.setPid05(((Float) mo7545(r4.mo5216(C0211.m974(i2) + "05value"),
                                r4.mo5216(C0211.m974(i2) + "05unitAndScaling").intValue())[0]).floatValue());
                    } catch (Throwable th5) {
                    }
                    try {
                        this.f7254.setPid06(((Float) mo7545(r4.mo5216(C0211.m974(i2) + "06value"),
                                r4.mo5216(C0211.m974(i2) + "06unitAndScaling").intValue())[0]).floatValue());
                    } catch (Throwable th6) {
                    }
                    try {
                        this.f7254.setPid07(((Float) mo7545(r4.mo5216(C0211.m974(i2) + "07value"),
                                r4.mo5216(C0211.m974(i2) + "07unitAndScaling").intValue())[0]).floatValue());
                    } catch (Throwable th7) {
                    }
                    try {
                        this.f7254.setPid08(((Float) mo7545(r4.mo5216(C0211.m974(i2) + "08value"),
                                r4.mo5216(C0211.m974(i2) + "08unitAndScaling").intValue())[0]).floatValue());
                    } catch (Throwable th8) {
                    }
                    try {
                        this.f7254.setPid09(((Float) mo7545(r4.mo5216(C0211.m974(i2) + "09value"),
                                r4.mo5216(C0211.m974(i2) + "09unitAndScaling").intValue())[0]).floatValue());
                    } catch (Throwable th9) {
                    }
                    try {
                        this.f7254.setPid0A(((Float) mo7545(r4.mo5216(C0211.m974(i2) + "0avalue"),
                                r4.mo5216(C0211.m974(i2) + "0aunitAndScaling").intValue())[0]).floatValue());
                    } catch (Throwable th10) {
                    }
                }
                this.f7254.postInvalidate();
            }
        } catch (Throwable th11) {
            C0362.m1836(th11);
        }
    }

    /* renamed from: ˋ */
    public Object[] mo7545(Float f, int i) {
        String str = "";
        if (i != 1) {
            if (i == 2) {
                str = "";
                try {
                    f = Float.valueOf(f.floatValue() * 0.1f);
                } catch (Throwable th) {
                    str = "Unknown";
                    C0362.m1836(th);
                }
            } else if (i == 3) {
                str = "";
                f = Float.valueOf(f.floatValue() * 0.01f);
            } else if (i == 4) {
                str = "";
                f = Float.valueOf(f.floatValue() * 0.001f);
            } else if (i == 5) {
                str = "";
                f = Float.valueOf(f.floatValue() * 3.05E-5f);
            } else if (i == 6) {
                str = "";
                f = Float.valueOf(f.floatValue() * 3.05E-4f);
            } else if (i == 7) {
                str = "rpm";
                f = Float.valueOf(f.floatValue() * 0.25f);
            } else if (i == 8) {
                str = "km/h";
                f = Float.valueOf(f.floatValue() * 0.01f);
            } else if (i == 9) {
                str = "km/h";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 10) {
                str = "V";
                f = Float.valueOf(f.floatValue() * 1.22E-4f);
            } else if (i == 11) {
                str = "V";
                f = Float.valueOf(f.floatValue() * 0.001f);
            } else if (i == 12) {
                str = "V";
                f = Float.valueOf(f.floatValue() * 0.01f);
            } else if (i == 13) {
                str = "mA";
                f = Float.valueOf(f.floatValue() * 0.00390625f);
            } else if (i == 14) {
                str = "A";
                f = Float.valueOf(f.floatValue() * 0.001f);
            } else if (i == 15) {
                str = "A";
                f = Float.valueOf(f.floatValue() * 0.01f);
            } else if (i == 16) {
                str = "ms";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 17) {
                str = "S";
                f = Float.valueOf(f.floatValue() * 0.1f);
            } else if (i == 18) {
                str = "S";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 19) {
                str = "mOhm";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 20) {
                str = "Ohm";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 21) {
                str = "kOhm";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 22) {
                str = "°C";
                f = Float.valueOf(f.floatValue() * 0.1f);
            } else if (i == 23) {
                str = "kPa";
                f = Float.valueOf(f.floatValue() * 0.01f);
            } else if (i == 24) {
                str = "kPa";
                f = Float.valueOf(f.floatValue() * 0.0117f);
            } else if (i == 25) {
                str = "kPa";
                f = Float.valueOf(f.floatValue() * 0.079f);
            } else if (i == 26) {
                str = "kPa";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 27) {
                str = "kPa";
                f = Float.valueOf(f.floatValue() * 10.0f);
            } else if (i == 28) {
                str = "°";
                f = Float.valueOf(f.floatValue() * 0.01f);
            } else if (i == 29) {
                str = "°";
                f = Float.valueOf(f.floatValue() * 0.5f);
            } else if (i == 30) {
                str = "lambda";
                f = Float.valueOf(f.floatValue() * 3.05E-5f);
            } else if (i == 31) {
                str = "AFR";
                f = Float.valueOf(f.floatValue() * 0.05f);
            } else if (i == 32) {
                str = "Ratio";
                f = Float.valueOf(f.floatValue() * 0.0039062f);
            } else if (i == 33) {
                str = "mHz";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 34) {
                str = "Hz";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 35) {
                str = "KHz";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 36) {
                str = "Count";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 37) {
                str = "km";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 38) {
                str = "mV/ms";
                f = Float.valueOf(f.floatValue() * 0.1f);
            } else if (i == 39) {
                str = "g/s";
                f = Float.valueOf(f.floatValue() * 0.01f);
            } else if (i == 40) {
                str = "g/s";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 41) {
                str = "Pa/s";
                f = Float.valueOf(f.floatValue() * 0.25f);
            } else if (i == 42) {
                str = "kg/h";
                f = Float.valueOf(f.floatValue() * 0.001f);
            } else if (i == 43) {
                str = "Changes";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 44) {
                str = "g/cyl";
                f = Float.valueOf(f.floatValue() * 0.01f);
            } else if (i == 45) {
                str = "mg/stroke";
                f = Float.valueOf(f.floatValue() * 0.01f);
            } else if (i == 46) {
                str = "Bool";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 47) {
                str = "%";
                f = Float.valueOf(f.floatValue() * 0.01f);
            } else if (i == 48) {
                str = "%";
                f = Float.valueOf(f.floatValue() * 0.001526f);
            } else if (i == 49) {
                str = "L";
                f = Float.valueOf(f.floatValue() * 0.001f);
            } else if (i == 50) {
                str = "inch";
                f = Float.valueOf(f.floatValue() * 3.05E-5f);
            } else if (i == 51) {
                str = "lambda";
                f = Float.valueOf(f.floatValue() * 2.4414E-4f);
            } else if (i == 52) {
                str = "minute";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 53) {
                str = "ms";
                f = Float.valueOf(f.floatValue() * 10.0f);
            } else if (i == 54) {
                str = "g";
                f = Float.valueOf(f.floatValue() * 0.01f);
            } else if (i == 55) {
                str = "g";
                f = Float.valueOf(f.floatValue() * 0.1f);
            } else if (i == 56) {
                str = "g";
                f = Float.valueOf(f.floatValue() * 1.0f);
            } else if (i == 57) {
                str = "%";
                f = Float.valueOf(f.floatValue() * 0.01f);
            } else if (i == 129) {
                str = "";
                f = Float.valueOf(m6298(f.floatValue()) * 1.0f);
            } else if (i == 130) {
                str = "";
                f = Float.valueOf(m6298(f.floatValue()) * 0.1f);
            } else if (i == 131) {
                str = "";
                f = Float.valueOf(m6298(f.floatValue()) * 0.01f);
            } else if (i == 132) {
                str = "";
                f = Float.valueOf(m6298(f.floatValue()) * 0.001f);
            } else if (i == 133) {
                str = "";
                f = Float.valueOf(m6298(f.floatValue()) * 3.05E-5f);
            } else if (i == 134) {
                str = "";
                f = Float.valueOf(m6298(f.floatValue()) * 3.05E-4f);
            } else if (i == 138) {
                str = "V";
                f = Float.valueOf(m6298(f.floatValue()) * 1.22E-4f);
            } else if (i == 139) {
                str = "V";
                f = Float.valueOf(m6298(f.floatValue()) * 0.001f);
            } else if (i == 140) {
                str = "V";
                f = Float.valueOf(m6298(f.floatValue()) * 0.01f);
            } else if (i == 141) {
                str = "mA";
                f = Float.valueOf(m6298(f.floatValue()) * 0.00390625f);
            } else if (i == 142) {
                str = "A";
                f = Float.valueOf(m6298(f.floatValue()) * 0.001f);
            } else if (i == 144) {
                str = "ms";
                f = Float.valueOf(m6298(f.floatValue()) * 1.0f);
            } else if (i == 150) {
                str = "°C";
                f = Float.valueOf(m6298(f.floatValue()) * 0.1f);
            } else if (i == 156) {
                str = "°";
                f = Float.valueOf(m6298(f.floatValue()) * 0.01f);
            } else if (i == 157) {
                str = "°";
                f = Float.valueOf(m6298(f.floatValue()) * 0.5f);
            } else if (i == 168) {
                str = "g/s";
                f = Float.valueOf(m6298(f.floatValue()) * 1.0f);
            } else if (i == 169) {
                str = "Pa/s";
                f = Float.valueOf(m6298(f.floatValue()) * 0.25f);
            } else if (i == 175) {
                str = "%";
                f = Float.valueOf(m6298(f.floatValue()) * 0.01f);
            } else if (i == 176) {
                str = "%";
                f = Float.valueOf(m6298(f.floatValue()) * 0.003052f);
            } else if (i == 177) {
                str = "mV/s";
                f = Float.valueOf(m6298(f.floatValue()) * 2.0f);
            } else if (i == 253) {
                str = "kPa";
                f = Float.valueOf(m6298(f.floatValue()) * 0.001f);
            } else if (i == 254) {
                str = "Pa";
                f = Float.valueOf(m6298(f.floatValue()) * 0.25f);
            }
        }
        return new Object[] { f, str };
    }

    /* renamed from: ˎ */
    public void mo7546() {
        if (this.f7253 != null) {
            this.f7253.cancel();
        }
        if (this.f7255 != null) {
            this.f7255.cancel();
        }
        this.f7253 = new Timer();
        this.f7255 = new Timer();
        this.f7262 = System.currentTimeMillis();
        this.f7250 = System.currentTimeMillis();
        this.f7253.schedule(new TimerTask() {
            public void run() {
                try {
                    if (ModeFiveActivity.this.f7246) {
                        if (C0351.m1773().mo5275()) {
                            ModeFiveActivity.this.f7264.mo3990(true);
                        }
                        long r5 = ModeFiveActivity.this.f7248.mo7606();
                        float r4 = r5 - ModeFiveActivity.this.f7250 > 0
                                ? (float) ((r5 - ModeFiveActivity.this.f7250) + ModeFiveActivity.this.f7251)
                                : 0.0f;
                        Float r7 = ModeFiveActivity.this.f7248.mo7565(true);
                        if (r7 != null) {
                            ModeFiveActivity.this.mo7542(r4, r7.floatValue());
                            ModeFiveActivity.this.f7249 = System.currentTimeMillis();
                            ModeFiveActivity.this.f7257.postInvalidate();
                        }
                    }
                } catch (Throwable th) {
                    C0362.m1836(th);
                }
            }
        }, 1000, 20);
        this.f7255.schedule(new TimerTask() {
            public void run() {
                try {
                    if (C0351.m1773().mo5275()) {
                        ModeFiveActivity.this.f7264.setInfo(C0483.m2490("Refreshing data, please wait", new String[0]),
                                R.drawable.APKTOOL_DUMMYVAL_0x7f020007);
                        ModeFiveActivity.this.f7264.setRotate(true);
                    } else {
                        ModeFiveActivity.this.f7264.setInfo(C0483.m2490("Connect to vehicle ECU first", new String[0]),
                                R.drawable.APKTOOL_DUMMYVAL_0x7f020005);
                        ModeFiveActivity.this.f7264.setRotate(false);
                    }
                    if (ModeFiveActivity.this.f7246) {
                        ModeFiveActivity.this.mo7544(ModeFiveActivity.this.f7245);
                    } else {
                        ModeFiveActivity.this.mo7547();
                    }
                } catch (Throwable th) {
                    C0362.m1836(th);
                }
            }
        }, 100, SpeechUtils.f7628);
    }

    /*
     * JADX WARNING: Removed duplicated region for block: B:38:0x0162 A[Catch:{
     * Throwable -> 0x01c2, Throwable -> 0x025b }]
     */
    /*
     * JADX WARNING: Removed duplicated region for block: B:47:0x0187 A[Catch:{
     * Throwable -> 0x01c2, Throwable -> 0x025b }]
     */
    /*
     * JADX WARNING: Removed duplicated region for block: B:52:0x01b1 A[Catch:{
     * Throwable -> 0x01c2, Throwable -> 0x025b }]
     */
    /* renamed from: ˏ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7547() {
        /*
         * r23 = this; o.ᵦ r9 = p001o.C0351.m1773() // Catch:{ Throwable -> 0x025b }
         * boolean r0 = r9.mo5275() // Catch:{ Throwable -> 0x025b } if (r0 != 0) goto
         * L_0x000b return L_0x000b: java.util.Vector r10 = new java.util.Vector //
         * Catch:{ Throwable -> 0x025b } r10.<init>() // Catch:{ Throwable -> 0x025b }
         * r11 = 0 r12 = 1 goto L_0x0209 L_0x0014: r0 = r23 boolean r0 = r0.f7260 //
         * Catch:{ Throwable -> 0x025b } if (r0 != 0) goto L_0x0020 r0 = r23 boolean r0
         * = r0.f7246 // Catch:{ Throwable -> 0x025b } if (r0 == 0) goto L_0x0021
         * L_0x0020: return L_0x0021: boolean r0 = r9.mo5275() // Catch:{ Throwable ->
         * 0x025b } if (r0 != 0) goto L_0x0028 return L_0x0028: int r0 = r12 % 32 if (r0
         * != 0) goto L_0x002e goto L_0x0207 L_0x002e: java.lang.String r0 = "default"
         * java.lang.StringBuilder r1 = new java.lang.StringBuilder // Catch:{ Throwable
         * -> 0x025b } java.lang.String r2 = "06" r1.<init>(r2) // Catch:{ Throwable ->
         * 0x025b } java.lang.String r2 = p001o.C0211.m974(r12) // Catch:{ Throwable ->
         * 0x025b } java.lang.StringBuilder r1 = r1.append(r2) // Catch:{ Throwable ->
         * 0x025b } java.lang.String r1 = r1.toString() // Catch:{ Throwable -> 0x025b }
         * r9.mo5260(r0, r1) // Catch:{ Throwable -> 0x025b } double r0 = (double) r12
         * // Catch:{ Throwable -> 0x025b } r2 = 4643176031446892544(0x406fe00000000000,
         * double:255.0) double r0 = r0 / r2 r2 =
         * 4636737291354636288(0x4059000000000000, double:100.0) double r0 = r0 * r2 int
         * r13 = (int) r0 // Catch:{ Throwable -> 0x025b } r0 = r23 android.os.Handler
         * r0 = r0.f7243 // Catch:{ Throwable -> 0x025b }
         * org.prowl.torque.modefive.ModeFiveActivity$5 r1 = new
         * org.prowl.torque.modefive.ModeFiveActivity$5 // Catch:{ Throwable -> 0x025b }
         * r2 = r23 r1.<init>(r13) // Catch:{ Throwable -> 0x025b } r0.post(r1) //
         * Catch:{ Throwable -> 0x025b } r14 = 1 goto L_0x0203 L_0x0062: boolean r0 =
         * r9.mo5275() // Catch:{ Throwable -> 0x025b } if (r0 != 0) goto L_0x0069
         * return L_0x0069: java.lang.StringBuilder r0 = new java.lang.StringBuilder //
         * Catch:{ Throwable -> 0x025b } java.lang.String r1 = p001o.C0211.m974(r12) //
         * Catch:{ Throwable -> 0x025b } java.lang.String r1 =
         * java.lang.String.valueOf(r1) // Catch:{ Throwable -> 0x025b } r0.<init>(r1)
         * // Catch:{ Throwable -> 0x025b } java.lang.String r1 = p001o.C0211.m974(r14)
         * // Catch:{ Throwable -> 0x025b } java.lang.StringBuilder r0 = r0.append(r1)
         * // Catch:{ Throwable -> 0x025b } java.lang.String r1 = "min"
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x025b }
         * java.lang.String r0 = r0.toString() // Catch:{ Throwable -> 0x025b }
         * java.lang.Float r15 = r9.mo5216(r0) // Catch:{ Throwable -> 0x025b }
         * java.lang.StringBuilder r0 = new java.lang.StringBuilder // Catch:{ Throwable
         * -> 0x025b } java.lang.String r1 = p001o.C0211.m974(r12) // Catch:{ Throwable
         * -> 0x025b } java.lang.String r1 = java.lang.String.valueOf(r1) // Catch:{
         * Throwable -> 0x025b } r0.<init>(r1) // Catch:{ Throwable -> 0x025b }
         * java.lang.String r1 = p001o.C0211.m974(r14) // Catch:{ Throwable -> 0x025b }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x025b }
         * java.lang.String r1 = "max" java.lang.StringBuilder r0 = r0.append(r1) //
         * Catch:{ Throwable -> 0x025b } java.lang.String r0 = r0.toString() // Catch:{
         * Throwable -> 0x025b } java.lang.Float r16 = r9.mo5216(r0) // Catch:{
         * Throwable -> 0x025b } java.lang.StringBuilder r0 = new
         * java.lang.StringBuilder // Catch:{ Throwable -> 0x025b } java.lang.String r1
         * = p001o.C0211.m974(r12) // Catch:{ Throwable -> 0x025b } java.lang.String r1
         * = java.lang.String.valueOf(r1) // Catch:{ Throwable -> 0x025b } r0.<init>(r1)
         * // Catch:{ Throwable -> 0x025b } java.lang.String r1 = p001o.C0211.m974(r14)
         * // Catch:{ Throwable -> 0x025b } java.lang.StringBuilder r0 = r0.append(r1)
         * // Catch:{ Throwable -> 0x025b } java.lang.String r1 = "value"
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x025b }
         * java.lang.String r0 = r0.toString() // Catch:{ Throwable -> 0x025b }
         * java.lang.Float r17 = r9.mo5216(r0) // Catch:{ Throwable -> 0x025b }
         * java.lang.StringBuilder r0 = new java.lang.StringBuilder // Catch:{ Throwable
         * -> 0x025b } java.lang.String r1 = p001o.C0211.m974(r12) // Catch:{ Throwable
         * -> 0x025b } java.lang.String r1 = java.lang.String.valueOf(r1) // Catch:{
         * Throwable -> 0x025b } r0.<init>(r1) // Catch:{ Throwable -> 0x025b }
         * java.lang.String r1 = p001o.C0211.m974(r14) // Catch:{ Throwable -> 0x025b }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x025b }
         * java.lang.String r1 = "unitAndScaling" java.lang.StringBuilder r0 =
         * r0.append(r1) // Catch:{ Throwable -> 0x025b } java.lang.String r0 =
         * r0.toString() // Catch:{ Throwable -> 0x025b } java.lang.Float r18 =
         * r9.mo5216(r0) // Catch:{ Throwable -> 0x025b } if (r17 == 0) goto L_0x01c6
         * r11 = 1 r0 = 6 if (r12 <= r0) goto L_0x0103 r0 = r23 o.ᐜ r0 = r0.f7264 //
         * Catch:{ Throwable -> 0x025b } r1 = 1 r0.mo3990(r1) // Catch:{ Throwable ->
         * 0x025b } L_0x0103: java.lang.String r19 = "" if (r18 == 0) goto L_0x014b int
         * r0 = r18.intValue() // Catch:{ Throwable -> 0x01c2 } if (r0 == 0) goto
         * L_0x014b int r0 = r18.intValue() // Catch:{ Throwable -> 0x01c2 } r1 = r23 r2
         * = r17 java.lang.Object[] r20 = r1.mo7545(r2, r0) // Catch:{ Throwable ->
         * 0x01c2 } r0 = 1 r0 = r20[r0] // Catch:{ Throwable -> 0x01c2 } r19 = r0
         * java.lang.String r19 = (java.lang.String) r19 // Catch:{ Throwable -> 0x01c2
         * } r0 = 0 r0 = r20[r0] // Catch:{ Throwable -> 0x01c2 } r17 = r0
         * java.lang.Float r17 = (java.lang.Float) r17 // Catch:{ Throwable -> 0x01c2 }
         * int r0 = r18.intValue() // Catch:{ Throwable -> 0x01c2 } r1 = r23
         * java.lang.Object[] r20 = r1.mo7545(r15, r0) // Catch:{ Throwable -> 0x01c2 }
         * r0 = 0 r0 = r20[r0] // Catch:{ Throwable -> 0x01c2 } r15 = r0 java.lang.Float
         * r15 = (java.lang.Float) r15 // Catch:{ Throwable -> 0x01c2 } int r0 =
         * r18.intValue() // Catch:{ Throwable -> 0x01c2 } r1 = r23 r2 = r16
         * java.lang.Object[] r20 = r1.mo7545(r2, r0) // Catch:{ Throwable -> 0x01c2 }
         * r0 = 0 r0 = r20[r0] // Catch:{ Throwable -> 0x01c2 } r16 = r0 java.lang.Float
         * r16 = (java.lang.Float) r16 // Catch:{ Throwable -> 0x01c2 } goto L_0x0154
         * L_0x014b: java.lang.String r19 = "" o.ᵦ r0 = p001o.C0351.m1773() // Catch:{
         * Throwable -> 0x01c2 } r0.mo5250() // Catch:{ Throwable -> 0x01c2 } L_0x0154:
         * java.lang.String r20 = "" java.lang.String r21 = "" o.ᵦ r0 =
         * p001o.C0351.m1773() // Catch:{ Throwable -> 0x01c2 } boolean r0 = r0.mo5250()
         * // Catch:{ Throwable -> 0x01c2 } if (r0 == 0) goto L_0x0187
         * java.lang.String[] r0 = f7231 // Catch:{ Throwable -> 0x01c2 } int r0 =
         * r0.length // Catch:{ Throwable -> 0x01c2 } int r0 = r0 + -1 if (r12 >= r0)
         * goto L_0x016e java.lang.String[] r0 = f7231 // Catch:{ Throwable -> 0x01c2 }
         * r21 = r0[r12] // Catch:{ Throwable -> 0x01c2 } goto L_0x017b L_0x016e: r0 =
         * 225(0xe1, float:3.15E-43) if (r12 < r0) goto L_0x017b java.lang.String r0 =
         * "Manufacturer defined MID" r1 = 0 java.lang.String[] r1 = new
         * java.lang.String[r1] // Catch:{ Throwable -> 0x01c2 } java.lang.String r20 =
         * p001o.C0483.m2490(r0, r1) // Catch:{ Throwable -> 0x01c2 } L_0x017b:
         * java.lang.String[] r0 = f7228 // Catch:{ Throwable -> 0x01c2 } int r0 =
         * r0.length // Catch:{ Throwable -> 0x01c2 } if (r14 > r0) goto L_0x0192
         * java.lang.String[] r0 = f7228 // Catch:{ Throwable -> 0x01c2 } int r1 = r14 +
         * -1 r20 = r0[r1] // Catch:{ Throwable -> 0x01c2 } goto L_0x0192 L_0x0187:
         * java.lang.String[] r0 = f7228 // Catch:{ Throwable -> 0x01c2 } int r0 =
         * r0.length // Catch:{ Throwable -> 0x01c2 } if (r12 > r0) goto L_0x0192
         * java.lang.String[] r0 = f7228 // Catch:{ Throwable -> 0x01c2 } int r1 = r12 +
         * -1 r21 = r0[r1] // Catch:{ Throwable -> 0x01c2 } L_0x0192: o.ṿ r0 = new o.ṿ
         * // Catch:{ Throwable -> 0x01c2 } r1 = r12 r2 = r14 r3 = r20 r4 = r21 r5 = r15
         * r6 = r16 r7 = r17 r8 = r19 r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8) //
         * Catch:{ Throwable -> 0x01c2 } r22 = r0 r0 = r22 r10.add(r0) // Catch:{
         * Throwable -> 0x01c2 } r0 = r23 boolean r0 = r0.f7247 // Catch:{ Throwable ->
         * 0x01c2 } if (r0 == 0) goto L_0x01c6 r0 = r23 android.os.Handler r0 = r0.f7243
         * // Catch:{ Throwable -> 0x01c2 } org.prowl.torque.modefive.ModeFiveActivity$6
         * r1 = new org.prowl.torque.modefive.ModeFiveActivity$6 // Catch:{ Throwable ->
         * 0x01c2 } r2 = r23 r3 = r22 r1.<init>(r3) // Catch:{ Throwable -> 0x01c2 }
         * r0.post(r1) // Catch:{ Throwable -> 0x01c2 } goto L_0x01c6 L_0x01c2: r19 =
         * move-exception p001o.C0362.m1836(r19) // Catch:{ Throwable -> 0x025b }
         * L_0x01c6: if (r11 != 0) goto L_0x0201 r0 = 60 if (r12 <= r0) goto L_0x0201 r0
         * = r23 o.ᐜ r0 = r0.f7264 // Catch:{ Throwable -> 0x025b } r1 = 0
         * r0.setRotate(r1) // Catch:{ Throwable -> 0x025b } boolean r0 = r9.mo5275() //
         * Catch:{ Throwable -> 0x025b } if (r0 == 0) goto L_0x01ee r0 = r23 o.ᐜ r0 =
         * r0.f7264 // Catch:{ Throwable -> 0x025b } java.lang.String r1 =
         * "ECU does not appear to support Mode $06" r2 = 0 java.lang.String[] r2 = new
         * java.lang.String[r2] // Catch:{ Throwable -> 0x025b } java.lang.String r1 =
         * p001o.C0483.m2490(r1, r2) // Catch:{ Throwable -> 0x025b } r2 =
         * 2130837508(0x7f020004, float:1.7279972E38) r0.setInfo(r1, r2) // Catch:{
         * Throwable -> 0x025b } goto L_0x0201 L_0x01ee: r0 = r23 o.ᐜ r0 = r0.f7264 //
         * Catch:{ Throwable -> 0x025b } java.lang.String r1 =
         * "Connection to ECU lost (check adapter/bluetooth)" r2 = 0 java.lang.String[]
         * r2 = new java.lang.String[r2] // Catch:{ Throwable -> 0x025b }
         * java.lang.String r1 = p001o.C0483.m2490(r1, r2) // Catch:{ Throwable ->
         * 0x025b } r2 = 2130837509(0x7f020005, float:1.7279974E38) r0.setInfo(r1, r2)
         * // Catch:{ Throwable -> 0x025b } L_0x0201: int r14 = r14 + 1 L_0x0203: r0 =
         * 255(0xff, float:3.57E-43) if (r14 < r0) goto L_0x0062 L_0x0207: int r12 = r12
         * + 1 L_0x0209: r0 = 255(0xff, float:3.57E-43) if (r12 < r0) goto L_0x0014 r0 =
         * 0 r1 = r23 r1.f7247 = r0 // Catch:{ Throwable -> 0x025b } o.ᵦ r0 =
         * p001o.C0351.m1773() // Catch:{ Throwable -> 0x0231 } int r0 = r0.mo5215() //
         * Catch:{ Throwable -> 0x0231 } r1 = 13 if (r0 >= r1) goto L_0x0235 o.ᵦ r0 =
         * p001o.C0351.m1773() // Catch:{ Throwable -> 0x0231 } java.lang.String r1 =
         * "0902\r" r0.mo5207(r1) // Catch:{ Throwable -> 0x0231 } o.ᵦ r0 =
         * p001o.C0351.m1773() // Catch:{ Throwable -> 0x0231 } java.lang.String r1 =
         * "0904\r" r0.mo5207(r1) // Catch:{ Throwable -> 0x0231 } goto L_0x0235
         * L_0x0231: r12 = move-exception p001o.C0362.m1836(r12) // Catch:{ Throwable ->
         * 0x025b } L_0x0235: r0 = r23 android.os.Handler r0 = r0.f7243 // Catch:{
         * Throwable -> 0x025b } org.prowl.torque.modefive.ModeFiveActivity$7 r1 = new
         * org.prowl.torque.modefive.ModeFiveActivity$7 // Catch:{ Throwable -> 0x025b }
         * r2 = r23 r1.<init>(r10) // Catch:{ Throwable -> 0x025b } r0.post(r1) //
         * Catch:{ Throwable -> 0x025b } if (r11 != 0) goto L_0x0252 r0 = r23 o.ᐜ r0 =
         * r0.f7264 // Catch:{ Throwable -> 0x025b } java.lang.String r1 =
         * "ECU returned no data" r2 = 2130837508(0x7f020004, float:1.7279972E38)
         * r0.setInfo(r1, r2) // Catch:{ Throwable -> 0x025b } goto L_0x025f L_0x0252:
         * r0 = r23 o.ᐜ r0 = r0.f7264 // Catch:{ Throwable -> 0x025b } r1 = 1
         * r0.mo3990(r1) // Catch:{ Throwable -> 0x025b } goto L_0x025f L_0x025b: r9 =
         * move-exception p001o.C0362.m1836(r9) L_0x025f: return
         */
        throw new UnsupportedOperationException(
                "Method not decompiled: org.prowl.torque.modefive.ModeFiveActivity.mo7547():void");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 180 */
    /* renamed from: ᐝ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7548() {
        /*
         * r20 = this; java.text.NumberFormat r4 = java.text.NumberFormat.getInstance()
         * r0 = 5 r4.setMaximumFractionDigits(r0) o.ᵦ r0 = p001o.C0351.m1773() int r5 =
         * r0.mo5208() java.lang.String r6 = "" java.lang.StringBuilder r0 = new
         * java.lang.StringBuilder java.lang.String r1 = java.lang.String.valueOf(r6)
         * r0.<init>(r1) java.lang.String r1 =
         * "Mode $06 report generated by Torque for Android\n" r2 = 0 java.lang.String[]
         * r2 = new java.lang.String[r2] java.lang.String r1 = p001o.C0483.m2490(r1, r2)
         * java.lang.StringBuilder r0 = r0.append(r1) java.lang.String r1 =
         * "================================================\n\n"
         * java.lang.StringBuilder r0 = r0.append(r1) java.lang.String r1 =
         * "Vehicle VIN: " r2 = 0 java.lang.String[] r2 = new java.lang.String[r2]
         * java.lang.String r1 = p001o.C0483.m2490(r1, r2) java.lang.StringBuilder r0 =
         * r0.append(r1) o.ᵦ r1 = p001o.C0351.m1773() java.lang.String r1 = r1.mo5245()
         * java.lang.StringBuilder r0 = r0.append(r1) java.lang.String r1 = "\n"
         * java.lang.StringBuilder r0 = r0.append(r1) java.lang.String r1 =
         * "Vehicle Manufacturer: " r2 = 0 java.lang.String[] r2 = new
         * java.lang.String[r2] java.lang.String r1 = p001o.C0483.m2490(r1, r2)
         * java.lang.StringBuilder r0 = r0.append(r1) o.ᵦ r1 = p001o.C0351.m1773() int
         * r1 = r1.mo5208() java.lang.String r1 = p001o.C0254.m1255(r1)
         * java.lang.StringBuilder r0 = r0.append(r1) java.lang.String r1 = "\n"
         * java.lang.StringBuilder r0 = r0.append(r1) java.lang.String r1 =
         * "Vehicle Calibration ID: " r2 = 0 java.lang.String[] r2 = new
         * java.lang.String[r2] java.lang.String r1 = p001o.C0483.m2490(r1, r2)
         * java.lang.StringBuilder r0 = r0.append(r1) o.ᵦ r1 = p001o.C0351.m1773()
         * java.lang.String r1 = r1.mo5291() java.lang.StringBuilder r0 = r0.append(r1)
         * java.lang.String r1 = "\n\n" java.lang.StringBuilder r0 = r0.append(r1)
         * java.lang.String r6 = r0.toString() o.ᵦ r0 = p001o.C0351.m1773() boolean r0 =
         * r0.mo5250() if (r0 != 0) goto L_0x00bd java.lang.StringBuilder r0 = new
         * java.lang.StringBuilder java.lang.String r1 = java.lang.String.valueOf(r6)
         * r0.<init>(r1) java.lang.String r1 =
         * "Unit and scaling information are not supplied with the data from the ECU for this type of vehicle. Consulting the manufacturers service book for this information is recommended."
         * r2 = 0 java.lang.String[] r2 = new java.lang.String[r2] java.lang.String r1 =
         * p001o.C0483.m2490(r1, r2) java.lang.StringBuilder r0 = r0.append(r1)
         * java.lang.String r1 = "\n\n" java.lang.StringBuilder r0 = r0.append(r1)
         * java.lang.String r6 = r0.toString() L_0x00bd: java.lang.StringBuilder r0 =
         * new java.lang.StringBuilder java.lang.String r1 =
         * java.lang.String.valueOf(r6) r0.<init>(r1) java.lang.String r1 =
         * "Test report:\n" r2 = 0 java.lang.String[] r2 = new java.lang.String[r2]
         * java.lang.String r1 = p001o.C0483.m2490(r1, r2) java.lang.StringBuilder r0 =
         * r0.append(r1) java.lang.String r1 = "------------------\n"
         * java.lang.StringBuilder r0 = r0.append(r1) java.lang.String r6 =
         * r0.toString() r0 = r20 o.ṝ r0 = r0.f7241 java.util.Vector r7 = r0.mo5453() if
         * (r7 == 0) goto L_0x0437 int r0 = r7.size() if (r0 <= 0) goto L_0x0437
         * java.util.Iterator r9 = r7.iterator() goto L_0x0430 L_0x00f3:
         * java.lang.Object r0 = r9.next() r8 = r0 o.ṿ r8 = (p001o.C0707) r8
         * java.lang.String r10 = "" java.lang.String r11 = "" java.lang.String r12 = ""
         * java.lang.String r0 = r8.mo5464() // Catch:{ Throwable -> 0x042c } if (r0 ==
         * 0) goto L_0x010a java.lang.String r12 = r8.mo5464() // Catch:{ Throwable ->
         * 0x042c } L_0x010a: java.lang.Float r0 = r8.mo5477() // Catch:{ Throwable ->
         * 0x042c } if (r0 == 0) goto L_0x0127 java.lang.StringBuilder r0 = new
         * java.lang.StringBuilder // Catch:{ Throwable -> 0x042c } java.lang.String r1
         * = "Min: " r0.<init>(r1) // Catch:{ Throwable -> 0x042c } java.lang.Float r1 =
         * r8.mo5477() // Catch:{ Throwable -> 0x042c } java.lang.String r1 =
         * r4.format(r1) // Catch:{ Throwable -> 0x042c } java.lang.StringBuilder r0 =
         * r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.String r10 =
         * r0.toString() // Catch:{ Throwable -> 0x042c } L_0x0127: java.lang.Float r0 =
         * r8.mo5462() // Catch:{ Throwable -> 0x042c } if (r0 == 0) goto L_0x0144
         * java.lang.StringBuilder r0 = new java.lang.StringBuilder // Catch:{ Throwable
         * -> 0x042c } java.lang.String r1 = "Max: " r0.<init>(r1) // Catch:{ Throwable
         * -> 0x042c } java.lang.Float r1 = r8.mo5462() // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = r4.format(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r11 = r0.toString() // Catch:{ Throwable -> 0x042c }
         * L_0x0144: java.lang.String r13 = r8.f4254 // Catch:{ Throwable -> 0x042c }
         * java.lang.String r14 = r8.f4255 // Catch:{ Throwable -> 0x042c }
         * java.lang.String r15 = "-" java.lang.String r16 = "" java.lang.String r17 =
         * "" java.lang.String r18 = "MID" java.lang.String r19 = "TID" o.ᵦ r0 =
         * p001o.C0351.m1773() // Catch:{ Throwable -> 0x042c } boolean r0 = r0.mo5250()
         * // Catch:{ Throwable -> 0x042c } if (r0 != 0) goto L_0x0160 java.lang.String
         * r18 = "TID" java.lang.String r19 = "CID" L_0x0160: java.lang.StringBuilder r0
         * = new java.lang.StringBuilder // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = java.lang.String.valueOf(r18) // Catch:{ Throwable ->
         * 0x042c } r0.<init>(r1) // Catch:{ Throwable -> 0x042c } java.lang.String r1 =
         * ":$" java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable ->
         * 0x042c } int r1 = r8.mo5465() // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = p001o.C0211.m974(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = " " java.lang.StringBuilder r0 = r0.append(r1) //
         * Catch:{ Throwable -> 0x042c } r1 = r19 java.lang.StringBuilder r0 =
         * r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.String r1 = ":$"
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * int r1 = r8.mo5469() // Catch:{ Throwable -> 0x042c } java.lang.String r1 =
         * p001o.C0211.m974(r1) // Catch:{ Throwable -> 0x042c } java.lang.StringBuilder
         * r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.String r17 =
         * r0.toString() // Catch:{ Throwable -> 0x042c } java.lang.Float r0 =
         * r8.mo5462() // Catch:{ Throwable -> 0x042c } if (r0 == 0) goto L_0x023b
         * java.lang.Float r0 = r8.mo5463() // Catch:{ Throwable -> 0x042c } float r0 =
         * r0.floatValue() // Catch:{ Throwable -> 0x042c } r1 = 0 int r0 = (r0 > r1 ? 1
         * : (r0 == r1 ? 0 : -1)) if (r0 == 0) goto L_0x023b java.lang.Float r0 =
         * r8.mo5477() // Catch:{ Throwable -> 0x042c } if (r0 != 0) goto L_0x023b
         * java.lang.Float r0 = r8.mo5463() // Catch:{ Throwable -> 0x042c } float r0 =
         * r0.floatValue() // Catch:{ Throwable -> 0x042c } java.lang.Float r1 =
         * r8.mo5462() // Catch:{ Throwable -> 0x042c } float r1 = r1.floatValue() //
         * Catch:{ Throwable -> 0x042c } int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1)) if
         * (r0 > 0) goto L_0x01cd java.lang.String r16 = "PASS" goto L_0x01cf L_0x01cd:
         * java.lang.String r16 = "FAIL" L_0x01cf: java.lang.StringBuilder r0 = new
         * java.lang.StringBuilder // Catch:{ Throwable -> 0x042c } java.lang.String r1
         * = java.lang.String.valueOf(r6) // Catch:{ Throwable -> 0x042c } r0.<init>(r1)
         * // Catch:{ Throwable -> 0x042c } r1 = r17 java.lang.StringBuilder r0 =
         * r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.String r1 = "\n"
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = r8.f4254 // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = " - " java.lang.StringBuilder r0 = r0.append(r1) //
         * Catch:{ Throwable -> 0x042c } java.lang.String r1 = r8.f4255 // Catch:{
         * Throwable -> 0x042c } java.lang.StringBuilder r0 = r0.append(r1) // Catch:{
         * Throwable -> 0x042c } java.lang.String r1 = "\nMax: " java.lang.StringBuilder
         * r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.Float r1 =
         * r8.f4257 // Catch:{ Throwable -> 0x042c } java.lang.String r1 = r4.format(r1)
         * // Catch:{ Throwable -> 0x042c } java.lang.StringBuilder r0 = r0.append(r1)
         * // Catch:{ Throwable -> 0x042c } java.lang.String r1 = r8.f4251 // Catch:{
         * Throwable -> 0x042c } java.lang.StringBuilder r0 = r0.append(r1) // Catch:{
         * Throwable -> 0x042c } java.lang.String r1 = "\nTest result value: "
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.Float r1 = r8.f4258 // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = r4.format(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = r8.f4251 // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = "\n" java.lang.StringBuilder r0 = r0.append(r1) //
         * Catch:{ Throwable -> 0x042c } r1 = r16 java.lang.StringBuilder r0 =
         * r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.String r1 =
         * "\n----\n" java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable ->
         * 0x042c } java.lang.String r0 = r0.toString() // Catch:{ Throwable -> 0x042c }
         * r6 = r0 goto L_0x0430 L_0x023b: java.lang.Float r0 = r8.mo5477() // Catch:{
         * Throwable -> 0x042c } if (r0 == 0) goto L_0x02d9 java.lang.Float r0 =
         * r8.mo5463() // Catch:{ Throwable -> 0x042c } float r0 = r0.floatValue() //
         * Catch:{ Throwable -> 0x042c } r1 = 0 int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 :
         * -1)) if (r0 == 0) goto L_0x02d9 java.lang.Float r0 = r8.mo5462() // Catch:{
         * Throwable -> 0x042c } if (r0 != 0) goto L_0x02d9 java.lang.Float r0 =
         * r8.mo5477() // Catch:{ Throwable -> 0x042c } float r0 = r0.floatValue() //
         * Catch:{ Throwable -> 0x042c } java.lang.Float r1 = r8.mo5463() // Catch:{
         * Throwable -> 0x042c } float r1 = r1.floatValue() // Catch:{ Throwable ->
         * 0x042c } int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1)) if (r0 > 0) goto
         * L_0x026b java.lang.String r16 = "PASS" goto L_0x026d L_0x026b:
         * java.lang.String r16 = "FAIL" L_0x026d: java.lang.StringBuilder r0 = new
         * java.lang.StringBuilder // Catch:{ Throwable -> 0x042c } java.lang.String r1
         * = java.lang.String.valueOf(r6) // Catch:{ Throwable -> 0x042c } r0.<init>(r1)
         * // Catch:{ Throwable -> 0x042c } r1 = r17 java.lang.StringBuilder r0 =
         * r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.String r1 = "\n"
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = r8.f4254 // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = " - " java.lang.StringBuilder r0 = r0.append(r1) //
         * Catch:{ Throwable -> 0x042c } java.lang.String r1 = r8.f4255 // Catch:{
         * Throwable -> 0x042c } java.lang.StringBuilder r0 = r0.append(r1) // Catch:{
         * Throwable -> 0x042c } java.lang.String r1 = "\nMin: " java.lang.StringBuilder
         * r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.Float r1 =
         * r8.f4256 // Catch:{ Throwable -> 0x042c } java.lang.String r1 = r4.format(r1)
         * // Catch:{ Throwable -> 0x042c } java.lang.StringBuilder r0 = r0.append(r1)
         * // Catch:{ Throwable -> 0x042c } java.lang.String r1 = r8.f4251 // Catch:{
         * Throwable -> 0x042c } java.lang.StringBuilder r0 = r0.append(r1) // Catch:{
         * Throwable -> 0x042c } java.lang.String r1 = "\nTest result value: "
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.Float r1 = r8.f4258 // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = r4.format(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = r8.f4251 // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = "\n" java.lang.StringBuilder r0 = r0.append(r1) //
         * Catch:{ Throwable -> 0x042c } r1 = r16 java.lang.StringBuilder r0 =
         * r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.String r1 =
         * "\n----\n" java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable ->
         * 0x042c } java.lang.String r0 = r0.toString() // Catch:{ Throwable -> 0x042c }
         * r6 = r0 goto L_0x0430 L_0x02d9: java.lang.Float r0 = r8.mo5462() // Catch:{
         * Throwable -> 0x042c } if (r0 == 0) goto L_0x02ec java.lang.Float r0 =
         * r8.mo5462() // Catch:{ Throwable -> 0x042c } float r0 = r0.floatValue() //
         * Catch:{ Throwable -> 0x042c } r1 = 0 int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 :
         * -1)) if (r0 != 0) goto L_0x030c L_0x02ec: java.lang.Float r0 = r8.mo5477() //
         * Catch:{ Throwable -> 0x042c } if (r0 == 0) goto L_0x02ff java.lang.Float r0 =
         * r8.mo5477() // Catch:{ Throwable -> 0x042c } float r0 = r0.floatValue() //
         * Catch:{ Throwable -> 0x042c } r1 = 0 int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 :
         * -1)) if (r0 != 0) goto L_0x030c L_0x02ff: java.lang.Float r0 = r8.mo5463() //
         * Catch:{ Throwable -> 0x042c } float r0 = r0.floatValue() // Catch:{ Throwable
         * -> 0x042c } r1 = 0 int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1)) if (r0 == 0)
         * goto L_0x03e6 L_0x030c: java.lang.Float r0 = r8.mo5462() // Catch:{ Throwable
         * -> 0x042c } float r0 = r0.floatValue() // Catch:{ Throwable -> 0x042c }
         * java.lang.Float r1 = r8.mo5477() // Catch:{ Throwable -> 0x042c } float r1 =
         * r1.floatValue() // Catch:{ Throwable -> 0x042c } float r0 = r0 - r1 float r0
         * = java.lang.Math.abs(r0) // Catch:{ Throwable -> 0x042c } double r0 =
         * (double) r0 // Catch:{ Throwable -> 0x042c } r2 =
         * 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001) int r0 = (r0 > r2 ? 1 :
         * (r0 == r2 ? 0 : -1)) if (r0 <= 0) goto L_0x0430 java.lang.Float r0 =
         * r8.mo5463() // Catch:{ Throwable -> 0x042c } float r0 = r0.floatValue() //
         * Catch:{ Throwable -> 0x042c } java.lang.Float r1 = r8.mo5462() // Catch:{
         * Throwable -> 0x042c } float r1 = r1.floatValue() // Catch:{ Throwable ->
         * 0x042c } int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1)) if (r0 > 0) goto
         * L_0x0363 java.lang.Float r0 = r8.mo5477() // Catch:{ Throwable -> 0x042c }
         * float r0 = r0.floatValue() // Catch:{ Throwable -> 0x042c } r1 = 1 int r0 =
         * (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1)) if (r0 == 0) goto L_0x0360
         * java.lang.Float r0 = r8.mo5463() // Catch:{ Throwable -> 0x042c } float r0 =
         * r0.floatValue() // Catch:{ Throwable -> 0x042c } java.lang.Float r1 =
         * r8.mo5477() // Catch:{ Throwable -> 0x042c } float r1 = r1.floatValue() //
         * Catch:{ Throwable -> 0x042c } int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1)) if
         * (r0 < 0) goto L_0x0363 L_0x0360: java.lang.String r16 = "PASS" goto L_0x0365
         * L_0x0363: java.lang.String r16 = "FAIL" L_0x0365: java.lang.StringBuilder r0
         * = new java.lang.StringBuilder // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = java.lang.String.valueOf(r6) // Catch:{ Throwable ->
         * 0x042c } r0.<init>(r1) // Catch:{ Throwable -> 0x042c } r1 = r17
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = "\n" java.lang.StringBuilder r0 = r0.append(r1) //
         * Catch:{ Throwable -> 0x042c } java.lang.String r1 = r8.f4254 // Catch:{
         * Throwable -> 0x042c } java.lang.StringBuilder r0 = r0.append(r1) // Catch:{
         * Throwable -> 0x042c } java.lang.String r1 = " - " java.lang.StringBuilder r0
         * = r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.String r1 =
         * r8.f4255 // Catch:{ Throwable -> 0x042c } java.lang.StringBuilder r0 =
         * r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.String r1 =
         * "\nMax: " java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable ->
         * 0x042c } java.lang.Float r1 = r8.f4257 // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = r4.format(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = r8.f4251 // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = "   Min: " java.lang.StringBuilder r0 = r0.append(r1)
         * // Catch:{ Throwable -> 0x042c } java.lang.Float r1 = r8.f4256 // Catch:{
         * Throwable -> 0x042c } java.lang.String r1 = r4.format(r1) // Catch:{
         * Throwable -> 0x042c } java.lang.StringBuilder r0 = r0.append(r1) // Catch:{
         * Throwable -> 0x042c } java.lang.String r1 = r8.f4251 // Catch:{ Throwable ->
         * 0x042c } java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable ->
         * 0x042c } java.lang.String r1 = "\nTest result value: "
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.Float r1 = r8.f4258 // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = r4.format(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = r8.f4251 // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = "\n" java.lang.StringBuilder r0 = r0.append(r1) //
         * Catch:{ Throwable -> 0x042c } r1 = r16 java.lang.StringBuilder r0 =
         * r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.String r1 =
         * "\n----\n" java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable ->
         * 0x042c } java.lang.String r0 = r0.toString() // Catch:{ Throwable -> 0x042c }
         * r6 = r0 goto L_0x0430 L_0x03e6: java.lang.StringBuilder r0 = new
         * java.lang.StringBuilder // Catch:{ Throwable -> 0x042c } java.lang.String r1
         * = java.lang.String.valueOf(r6) // Catch:{ Throwable -> 0x042c } r0.<init>(r1)
         * // Catch:{ Throwable -> 0x042c } r1 = r17 java.lang.StringBuilder r0 =
         * r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.String r1 = "\n"
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = r8.f4254 // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = " - " java.lang.StringBuilder r0 = r0.append(r1) //
         * Catch:{ Throwable -> 0x042c } java.lang.String r1 = r8.f4255 // Catch:{
         * Throwable -> 0x042c } java.lang.StringBuilder r0 = r0.append(r1) // Catch:{
         * Throwable -> 0x042c } java.lang.String r1 = "\n" java.lang.StringBuilder r0 =
         * r0.append(r1) // Catch:{ Throwable -> 0x042c } java.lang.String r1 =
         * "Test incomplete or dependant test failed" r2 = 0 java.lang.String[] r2 = new
         * java.lang.String[r2] // Catch:{ Throwable -> 0x042c } java.lang.String r1 =
         * p001o.C0483.m2490(r1, r2) // Catch:{ Throwable -> 0x042c }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x042c }
         * java.lang.String r1 = "\n--\n" java.lang.StringBuilder r0 = r0.append(r1) //
         * Catch:{ Throwable -> 0x042c } java.lang.String r0 = r0.toString() // Catch:{
         * Throwable -> 0x042c } r6 = r0 goto L_0x0430 L_0x042c: r10 = move-exception
         * p001o.C0362.m1836(r10) L_0x0430: boolean r0 = r9.hasNext() if (r0 != 0) goto
         * L_0x00f3 goto L_0x0451 L_0x0437: java.lang.StringBuilder r0 = new
         * java.lang.StringBuilder java.lang.String r1 = java.lang.String.valueOf(r6)
         * r0.<init>(r1) java.lang.String r1 =
         * "ECU reports no test results present (Vehicle ECU may not support this mode)\n"
         * r2 = 0 java.lang.String[] r2 = new java.lang.String[r2] java.lang.String r1 =
         * p001o.C0483.m2490(r1, r2) java.lang.StringBuilder r0 = r0.append(r1)
         * java.lang.String r6 = r0.toString() L_0x0451: java.lang.StringBuilder r0 =
         * new java.lang.StringBuilder java.lang.String r1 =
         * java.lang.String.valueOf(r6) r0.<init>(r1) java.lang.String r1 = "\n"
         * java.lang.StringBuilder r0 = r0.append(r1) java.lang.String r6 =
         * r0.toString() java.lang.StringBuilder r0 = new java.lang.StringBuilder
         * java.lang.String r1 = java.lang.String.valueOf(r6) r0.<init>(r1)
         * java.lang.String r1 = "\nEnd of report.\n" r2 = 0 java.lang.String[] r2 = new
         * java.lang.String[r2] java.lang.String r1 = p001o.C0483.m2490(r1, r2)
         * java.lang.StringBuilder r0 = r0.append(r1) java.lang.String r6 =
         * r0.toString() android.content.Intent r8 = new android.content.Intent
         * java.lang.String r0 = "android.intent.action.SEND" r8.<init>(r0)
         * java.lang.String r0 = "text/plain" r8.setType(r0) java.lang.String r0 =
         * "android.intent.extra.SUBJECT" java.lang.String r1 = "Mode $06 test results"
         * r2 = 0 java.lang.String[] r2 = new java.lang.String[r2] java.lang.String r1 =
         * p001o.C0483.m2490(r1, r2) r8.putExtra(r0, r1) java.lang.String r0 =
         * "android.intent.extra.TEXT" r8.putExtra(r0, r6) java.lang.String r0 = "Send:"
         * android.content.Intent r0 = android.content.Intent.createChooser(r8, r0) r1 =
         * r20 r1.startActivity(r0) return
         */
        throw new UnsupportedOperationException(
                "Method not decompiled: org.prowl.torque.modefive.ModeFiveActivity.mo7548():void");
    }
}
