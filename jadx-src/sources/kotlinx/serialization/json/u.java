package kotlinx.serialization.json;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class u implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f70282n = new u();
    private static final EJn.Wre rl = j.rl;

    private static final class j implements EJn.Wre {
        public static final j rl = new j();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f70283t = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final /* synthetic */ EJn.Wre f70284n = WY.j.gh(WY.j.T(StringCompanionObject.INSTANCE), QJ.f70267n).getDescriptor();

        @Override // EJn.Wre
        public List J2(int i2) {
            return this.f70284n.J2(i2);
        }

        @Override // EJn.Wre
        public String O(int i2) {
            return this.f70284n.O(i2);
        }

        @Override // EJn.Wre
        public List getAnnotations() {
            return this.f70284n.getAnnotations();
        }

        @Override // EJn.Wre
        public boolean isInline() {
            return this.f70284n.isInline();
        }

        @Override // EJn.Wre
        public int nr() {
            return this.f70284n.nr();
        }

        @Override // EJn.Wre
        public boolean rl() {
            return this.f70284n.rl();
        }

        @Override // EJn.Wre
        public int t(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f70284n.t(name);
        }

        @Override // EJn.Wre
        public boolean xMQ(int i2) {
            return this.f70284n.xMQ(i2);
        }

        @Override // EJn.Wre
        public String KN() {
            return f70283t;
        }

        @Override // EJn.Wre
        public EJn.Wre Uo(int i2) {
            return this.f70284n.Uo(i2);
        }

        @Override // EJn.Wre
        public EJn.Pl getKind() {
            return this.f70284n.getKind();
        }

        private j() {
        }
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public nKK deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        l3D.Uo(decoder);
        return new nKK((Map) WY.j.gh(WY.j.T(StringCompanionObject.INSTANCE), QJ.f70267n).deserialize(decoder));
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, nKK value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        l3D.KN(encoder);
        WY.j.gh(WY.j.T(StringCompanionObject.INSTANCE), QJ.f70267n).serialize(encoder, value);
    }

    private u() {
    }
}
