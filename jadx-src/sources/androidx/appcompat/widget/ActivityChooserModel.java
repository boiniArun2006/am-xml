package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class ActivityChooserModel extends DataSetObservable {
    private static final Object HI = new Object();
    private static final Map ck = new HashMap();
    static final String ty = "ActivityChooserModel";
    private Intent J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final String f14004O;
    private OnChooseActivityListener az;
    final Context nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f14005n = new Object();
    private final List rl = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f14006t = new ArrayList();
    private ActivitySorter Uo = new DefaultSorter();
    private int KN = 50;
    boolean xMQ = true;
    private boolean mUb = false;
    private boolean gh = true;
    private boolean qie = false;

    public interface ActivityChooserModelClient {
    }

    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ResolveInfo f14007n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f14008t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ActivityResolveInfo.class == obj.getClass() && Float.floatToIntBits(this.f14008t) == Float.floatToIntBits(((ActivityResolveInfo) obj).f14008t);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f14008t) + 31;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(ActivityResolveInfo activityResolveInfo) {
            return Float.floatToIntBits(activityResolveInfo.f14008t) - Float.floatToIntBits(this.f14008t);
        }

        public String toString() {
            return "[resolveInfo:" + this.f14007n.toString() + "; weight:" + new BigDecimal(this.f14008t) + "]";
        }

        public ActivityResolveInfo(ResolveInfo resolveInfo) {
            this.f14007n = resolveInfo;
        }
    }

    public interface ActivitySorter {
        void n(Intent intent, List list, List list2);
    }

    private static final class DefaultSorter implements ActivitySorter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Map f14009n = new HashMap();

        @Override // androidx.appcompat.widget.ActivityChooserModel.ActivitySorter
        public void n(Intent intent, List list, List list2) {
            Map map = this.f14009n;
            map.clear();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ActivityResolveInfo activityResolveInfo = (ActivityResolveInfo) list.get(i2);
                activityResolveInfo.f14008t = 0.0f;
                ActivityInfo activityInfo = activityResolveInfo.f14007n.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), activityResolveInfo);
            }
            float f3 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                HistoricalRecord historicalRecord = (HistoricalRecord) list2.get(size2);
                ActivityResolveInfo activityResolveInfo2 = (ActivityResolveInfo) map.get(historicalRecord.f14010n);
                if (activityResolveInfo2 != null) {
                    activityResolveInfo2.f14008t += historicalRecord.f14011t * f3;
                    f3 *= 0.95f;
                }
            }
            Collections.sort(list);
        }

        DefaultSorter() {
        }
    }

    public static final class HistoricalRecord {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ComponentName f14010n;
        public final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final float f14011t;

        public HistoricalRecord(String str, long j2, float f3) {
            this(ComponentName.unflattenFromString(str), j2, f3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = this.f14010n;
            if (componentName == null) {
                if (historicalRecord.f14010n != null) {
                    return false;
                }
            } else if (!componentName.equals(historicalRecord.f14010n)) {
                return false;
            }
            return this.rl == historicalRecord.rl && Float.floatToIntBits(this.f14011t) == Float.floatToIntBits(historicalRecord.f14011t);
        }

        public HistoricalRecord(ComponentName componentName, long j2, float f3) {
            this.f14010n = componentName;
            this.rl = j2;
            this.f14011t = f3;
        }

        public int hashCode() {
            ComponentName componentName = this.f14010n;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j2 = this.rl;
            return ((((iHashCode + 31) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Float.floatToIntBits(this.f14011t);
        }

        public String toString() {
            return "[; activity:" + this.f14010n + "; time:" + this.rl + "; weight:" + new BigDecimal(this.f14011t) + "]";
        }
    }

    public interface OnChooseActivityListener {
        boolean n(ActivityChooserModel activityChooserModel, Intent intent);
    }

    private final class PersistHistoryAsyncTask extends AsyncTask<Object, Void, Void> {
        PersistHistoryAsyncTask() {
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Void doInBackground(Object... objArr) {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = ActivityChooserModel.this.nr.openFileOutput(str, 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        try {
                            try {
                                xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                                xmlSerializerNewSerializer.startDocument(com.google.android.exoplayer2.C.UTF8_NAME, Boolean.TRUE);
                                xmlSerializerNewSerializer.startTag(null, "historical-records");
                                int size = list.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    HistoricalRecord historicalRecord = (HistoricalRecord) list.remove(0);
                                    xmlSerializerNewSerializer.startTag(null, "historical-record");
                                    xmlSerializerNewSerializer.attribute(null, "activity", historicalRecord.f14010n.flattenToString());
                                    xmlSerializerNewSerializer.attribute(null, "time", String.valueOf(historicalRecord.rl));
                                    xmlSerializerNewSerializer.attribute(null, "weight", String.valueOf(historicalRecord.f14011t));
                                    xmlSerializerNewSerializer.endTag(null, "historical-record");
                                }
                                xmlSerializerNewSerializer.endTag(null, "historical-records");
                                xmlSerializerNewSerializer.endDocument();
                                ActivityChooserModel.this.xMQ = true;
                            } catch (Throwable th) {
                                ActivityChooserModel.this.xMQ = true;
                                if (fileOutputStreamOpenFileOutput != null) {
                                    try {
                                        fileOutputStreamOpenFileOutput.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e2) {
                            Log.e(ActivityChooserModel.ty, "Error writing historical record file: " + ActivityChooserModel.this.f14004O, e2);
                            ActivityChooserModel.this.xMQ = true;
                            if (fileOutputStreamOpenFileOutput != null) {
                            }
                        }
                    } catch (IllegalStateException e3) {
                        Log.e(ActivityChooserModel.ty, "Error writing historical record file: " + ActivityChooserModel.this.f14004O, e3);
                        ActivityChooserModel.this.xMQ = true;
                        if (fileOutputStreamOpenFileOutput != null) {
                        }
                    }
                } catch (IllegalArgumentException e4) {
                    Log.e(ActivityChooserModel.ty, "Error writing historical record file: " + ActivityChooserModel.this.f14004O, e4);
                    ActivityChooserModel.this.xMQ = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                    }
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                return null;
            } catch (FileNotFoundException e5) {
                Log.e(ActivityChooserModel.ty, "Error writing historical record file: " + str, e5);
                return null;
            }
        }
    }

    private boolean az() throws IOException {
        if (!this.xMQ || !this.gh || TextUtils.isEmpty(this.f14004O)) {
            return false;
        }
        this.xMQ = false;
        this.mUb = true;
        ty();
        return true;
    }

    private boolean ck() {
        if (this.Uo == null || this.J2 == null || this.rl.isEmpty() || this.f14006t.isEmpty()) {
            return false;
        }
        this.Uo.n(this.J2, this.rl, Collections.unmodifiableList(this.f14006t));
        return true;
    }

    private void gh() {
        if (!this.mUb) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.gh) {
            this.gh = false;
            if (TextUtils.isEmpty(this.f14004O)) {
                return;
            }
            new PersistHistoryAsyncTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f14006t), this.f14004O);
        }
    }

    private boolean mUb() {
        if (!this.qie || this.J2 == null) {
            return false;
        }
        this.qie = false;
        this.rl.clear();
        List<ResolveInfo> listQueryIntentActivities = this.nr.getPackageManager().queryIntentActivities(this.J2, 0);
        int size = listQueryIntentActivities.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.rl.add(new ActivityResolveInfo(listQueryIntentActivities.get(i2)));
        }
        return true;
    }

    private boolean n(HistoricalRecord historicalRecord) {
        boolean zAdd = this.f14006t.add(historicalRecord);
        if (zAdd) {
            this.gh = true;
            qie();
            gh();
            ck();
            notifyChanged();
        }
        return zAdd;
    }

    public static ActivityChooserModel nr(Context context, String str) {
        ActivityChooserModel activityChooserModel;
        synchronized (HI) {
            try {
                Map map = ck;
                activityChooserModel = (ActivityChooserModel) map.get(str);
                if (activityChooserModel == null) {
                    activityChooserModel = new ActivityChooserModel(context, str);
                    map.put(str, activityChooserModel);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return activityChooserModel;
    }

    private void qie() {
        int size = this.f14006t.size() - this.KN;
        if (size <= 0) {
            return;
        }
        this.gh = true;
        for (int i2 = 0; i2 < size; i2++) {
        }
    }

    private void ty() throws IOException {
        try {
            FileInputStream fileInputStreamOpenFileInput = this.nr.openFileInput(this.f14004O);
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, com.google.android.exoplayer2.C.UTF8_NAME);
                    for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                    }
                    if (!"historical-records".equals(xmlPullParserNewPullParser.getName())) {
                        throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                    List list = this.f14006t;
                    list.clear();
                    while (true) {
                        int next2 = xmlPullParserNewPullParser.next();
                        if (next2 == 1) {
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                                return;
                            }
                            return;
                        } else if (next2 != 3 && next2 != 4) {
                            if (!"historical-record".equals(xmlPullParserNewPullParser.getName())) {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                            list.add(new HistoricalRecord(xmlPullParserNewPullParser.getAttributeValue(null, "activity"), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, "weight"))));
                        }
                    }
                } catch (IOException e2) {
                    Log.e(ty, "Error reading historical recrod file: " + this.f14004O, e2);
                    if (fileInputStreamOpenFileInput == null) {
                        return;
                    }
                    fileInputStreamOpenFileInput.close();
                } catch (XmlPullParserException e3) {
                    Log.e(ty, "Error reading historical recrod file: " + this.f14004O, e3);
                    if (fileInputStreamOpenFileInput == null) {
                        return;
                    }
                    fileInputStreamOpenFileInput.close();
                }
            } catch (Throwable th) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException | IOException unused2) {
        }
    }

    public void HI(int i2) {
        synchronized (this.f14005n) {
            try {
                t();
                ActivityResolveInfo activityResolveInfo = (ActivityResolveInfo) this.rl.get(i2);
                ActivityResolveInfo activityResolveInfo2 = (ActivityResolveInfo) this.rl.get(0);
                float f3 = activityResolveInfo2 != null ? (activityResolveInfo2.f14008t - activityResolveInfo.f14008t) + 5.0f : 1.0f;
                ActivityInfo activityInfo = activityResolveInfo.f14007n.activityInfo;
                n(new HistoricalRecord(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f3));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int J2() {
        int size;
        synchronized (this.f14005n) {
            t();
            size = this.rl.size();
        }
        return size;
    }

    public ResolveInfo KN() {
        synchronized (this.f14005n) {
            try {
                t();
                if (this.rl.isEmpty()) {
                    return null;
                }
                return ((ActivityResolveInfo) this.rl.get(0)).f14007n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo O(int i2) {
        ResolveInfo resolveInfo;
        synchronized (this.f14005n) {
            t();
            resolveInfo = ((ActivityResolveInfo) this.rl.get(i2)).f14007n;
        }
        return resolveInfo;
    }

    public int Uo(ResolveInfo resolveInfo) {
        synchronized (this.f14005n) {
            try {
                t();
                List list = this.rl;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((ActivityResolveInfo) list.get(i2)).f14007n == resolveInfo) {
                        return i2;
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Intent rl(int i2) {
        synchronized (this.f14005n) {
            try {
                if (this.J2 == null) {
                    return null;
                }
                t();
                ActivityInfo activityInfo = ((ActivityResolveInfo) this.rl.get(i2)).f14007n.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.J2);
                intent.setComponent(componentName);
                if (this.az != null) {
                    if (this.az.n(this, new Intent(intent))) {
                        return null;
                    }
                }
                n(new HistoricalRecord(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int xMQ() {
        int size;
        synchronized (this.f14005n) {
            t();
            size = this.f14006t.size();
        }
        return size;
    }

    private ActivityChooserModel(Context context, String str) {
        this.nr = context.getApplicationContext();
        if (!TextUtils.isEmpty(str) && !str.endsWith(".xml")) {
            this.f14004O = str + ".xml";
            return;
        }
        this.f14004O = str;
    }

    private void t() {
        boolean zMUb = mUb() | az();
        qie();
        if (zMUb) {
            ck();
            notifyChanged();
        }
    }
}
