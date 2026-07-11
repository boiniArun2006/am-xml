package kotlinx.serialization.json;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f70264n = new Ml();
    private static final EJn.Wre rl = j.rl;

    private static final class j implements EJn.Wre {
        public static final j rl = new j();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f70265t = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final /* synthetic */ EJn.Wre f70266n = WY.j.KN(QJ.f70267n).getDescriptor();

        @Override // EJn.Wre
        public List J2(int i2) {
            return this.f70266n.J2(i2);
        }

        @Override // EJn.Wre
        public String O(int i2) {
            return this.f70266n.O(i2);
        }

        @Override // EJn.Wre
        public List getAnnotations() {
            return this.f70266n.getAnnotations();
        }

        @Override // EJn.Wre
        public boolean isInline() {
            return this.f70266n.isInline();
        }

        @Override // EJn.Wre
        public int nr() {
            return this.f70266n.nr();
        }

        @Override // EJn.Wre
        public boolean rl() {
            return this.f70266n.rl();
        }

        @Override // EJn.Wre
        public int t(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f70266n.t(name);
        }

        @Override // EJn.Wre
        public boolean xMQ(int i2) {
            return this.f70266n.xMQ(i2);
        }

        @Override // EJn.Wre
        public String KN() {
            return f70265t;
        }

        @Override // EJn.Wre
        public EJn.Wre Uo(int i2) {
            return this.f70266n.Uo(i2);
        }

        @Override // EJn.Wre
        public EJn.Pl getKind() {
            return this.f70266n.getKind();
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
    public w6 deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        l3D.Uo(decoder);
        return new w6((List) WY.j.KN(QJ.f70267n).deserialize(decoder));
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, w6 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        l3D.KN(encoder);
        WY.j.KN(QJ.f70267n).serialize(encoder, value);
    }

    private Ml() {
    }
}
