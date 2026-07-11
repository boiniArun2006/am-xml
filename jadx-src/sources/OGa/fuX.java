package OGa;

import OGa.fuX;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f7296n;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final WkR.w6 f7297t;

    public static final class j implements oy.n {
        private static final WkR.w6 nr = new WkR.w6() { // from class: OGa.CN3
            @Override // WkR.w6
            public final void n(Object obj, Object obj2) {
                fuX.j.rl(obj, (WkR.Ml) obj2);
            }
        };

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Map f7298n = new HashMap();
        private final Map rl = new HashMap();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private WkR.w6 f7299t = nr;

        public static /* synthetic */ void rl(Object obj, WkR.Ml ml) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        @Override // oy.n
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public j n(Class cls, WkR.w6 w6Var) {
            this.f7298n.put(cls, w6Var);
            this.rl.remove(cls);
            return this;
        }

        public fuX t() {
            return new fuX(new HashMap(this.f7298n), new HashMap(this.rl), this.f7299t);
        }

        public j nr(oy.j jVar) {
            jVar.n(this);
            return this;
        }
    }

    public static j n() {
        return new j();
    }

    public void rl(Object obj, OutputStream outputStream) {
        new Wre(outputStream, this.f7296n, this.rl, this.f7297t).Z(obj);
    }

    public byte[] t(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            rl(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    fuX(Map map, Map map2, WkR.w6 w6Var) {
        this.f7296n = map;
        this.rl = map2;
        this.f7297t = w6Var;
    }
}
