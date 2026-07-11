package UnP;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class fuX implements Wre {
    private static final Bitmap.Config[] J2;
    private static final Bitmap.Config[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Bitmap.Config[] f10830O;
    private static final Bitmap.Config[] Uo;
    private static final Bitmap.Config[] nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f10831n = new w6();
    private final Ml rl = new Ml();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f10832t = new HashMap();

    static final class n implements CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final w6 f10834n;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Bitmap.Config f10835t;

        public boolean equals(Object obj) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (this.rl == nVar.rl && UrZ.j.n(this.f10835t, nVar.f10835t)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i2 = this.rl * 31;
            Bitmap.Config config = this.f10835t;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        @Override // UnP.CN3
        public void n() {
            this.f10834n.t(this);
        }

        public void rl(int i2, Bitmap.Config config) {
            this.rl = i2;
            this.f10835t = config;
        }

        public String toString() {
            return fuX.KN(this.rl, this.f10835t);
        }

        public n(w6 w6Var) {
            this.f10834n = w6Var;
        }
    }

    static class w6 extends UnP.n {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // UnP.n
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public n n() {
            return new n(this);
        }

        w6() {
        }

        public n O(int i2, Bitmap.Config config) {
            n nVar = (n) rl();
            nVar.rl(i2, config);
            return nVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        nr = configArr;
        f10830O = configArr;
        J2 = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        Uo = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        KN = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f10833n;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f10833n = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10833n[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10833n[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10833n[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static String KN(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private n Uo(int i2, Bitmap.Config config) {
        n nVarO = this.f10831n.O(i2, config);
        Bitmap.Config[] configArrXMQ = xMQ(config);
        int length = configArrXMQ.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArrXMQ[i3];
            Integer num = (Integer) mUb(config2).ceilingKey(Integer.valueOf(i2));
            if (num == null || num.intValue() > i2 * 8) {
                i3++;
            } else if (num.intValue() != i2 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f10831n.t(nVarO);
                return this.f10831n.O(num.intValue(), config2);
            }
        }
    }

    private NavigableMap mUb(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f10832t.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f10832t.put(config, treeMap);
        return treeMap;
    }

    private static Bitmap.Config[] xMQ(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f10830O;
        }
        int i2 = j.f10833n[config.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new Bitmap.Config[]{config} : KN : Uo : J2 : nr;
    }

    @Override // UnP.Wre
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.rl.J2();
        if (bitmap != null) {
            J2(Integer.valueOf(UrZ.j.nr(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.rl);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f10832t.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f10832t.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    private void J2(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapMUb = mUb(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapMUb.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapMUb.remove(num);
                return;
            } else {
                navigableMapMUb.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + rl(bitmap) + ", this: " + this);
    }

    @Override // UnP.Wre
    public int O(Bitmap bitmap) {
        return UrZ.j.nr(bitmap);
    }

    @Override // UnP.Wre
    public void n(Bitmap bitmap) {
        n nVarO = this.f10831n.O(UrZ.j.nr(bitmap), bitmap.getConfig());
        this.rl.nr(nVarO, bitmap);
        NavigableMap navigableMapMUb = mUb(bitmap.getConfig());
        Integer num = (Integer) navigableMapMUb.get(Integer.valueOf(nVarO.rl));
        Integer numValueOf = Integer.valueOf(nVarO.rl);
        int iIntValue = 1;
        if (num != null) {
            iIntValue = 1 + num.intValue();
        }
        navigableMapMUb.put(numValueOf, Integer.valueOf(iIntValue));
    }

    @Override // UnP.Wre
    public Bitmap nr(int i2, int i3, Bitmap.Config config) {
        n nVarUo = Uo(UrZ.j.t(i2, i3, config), config);
        Bitmap bitmap = (Bitmap) this.rl.n(nVarUo);
        if (bitmap != null) {
            J2(Integer.valueOf(nVarUo.rl), bitmap);
            bitmap.reconfigure(i2, i3, config);
        }
        return bitmap;
    }

    @Override // UnP.Wre
    public String rl(Bitmap bitmap) {
        return KN(UrZ.j.nr(bitmap), bitmap.getConfig());
    }

    @Override // UnP.Wre
    public String t(int i2, int i3, Bitmap.Config config) {
        return KN(UrZ.j.t(i2, i3, config), config);
    }
}
