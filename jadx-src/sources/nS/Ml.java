package nS;

import com.google.firebase.encoders.EncodingException;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml implements oy.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final WkR.w6 f71156O = new WkR.w6() { // from class: nS.j
        @Override // WkR.w6
        public final void n(Object obj, Object obj2) {
            Ml.t(obj, (WkR.Ml) obj2);
        }
    };
    private static final WkR.I28 J2 = new WkR.I28() { // from class: nS.n
        @Override // WkR.I28
        public final void n(Object obj, Object obj2) {
            ((WkR.Wre) obj2).nr((String) obj);
        }
    };
    private static final WkR.I28 Uo = new WkR.I28() { // from class: nS.w6
        @Override // WkR.I28
        public final void n(Object obj, Object obj2) {
            ((WkR.Wre) obj2).J2(((Boolean) obj).booleanValue());
        }
    };
    private static final n KN = new n(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f71157n = new HashMap();
    private final Map rl = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private WkR.w6 f71158t = f71156O;
    private boolean nr = false;

    class j implements WkR.j {
        j() {
        }

        @Override // WkR.j
        public void n(Object obj, Writer writer) {
            I28 i28 = new I28(writer, Ml.this.f71157n, Ml.this.rl, Ml.this.f71158t, Ml.this.nr);
            i28.gh(obj, false);
            i28.XQ();
        }

        @Override // WkR.j
        public String rl(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                n(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class n implements WkR.I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final DateFormat f71160n;

        private n() {
        }

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f71160n = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        /* synthetic */ n(j jVar) {
            this();
        }

        @Override // WkR.I28
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Date date, WkR.Wre wre) {
            wre.nr(f71160n.format(date));
        }
    }

    public static /* synthetic */ void t(Object obj, WkR.Ml ml) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public Ml az(Class cls, WkR.I28 i28) {
        this.rl.put(cls, i28);
        this.f71157n.remove(cls);
        return this;
    }

    public Ml gh(boolean z2) {
        this.nr = z2;
        return this;
    }

    @Override // oy.n
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public Ml n(Class cls, WkR.w6 w6Var) {
        this.f71157n.put(cls, w6Var);
        this.rl.remove(cls);
        return this;
    }

    public WkR.j xMQ() {
        return new j();
    }

    public Ml() {
        az(String.class, J2);
        az(Boolean.class, Uo);
        az(Date.class, KN);
    }

    public Ml mUb(oy.j jVar) {
        jVar.n(this);
        return this;
    }
}
