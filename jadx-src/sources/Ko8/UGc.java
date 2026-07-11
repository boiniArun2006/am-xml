package Ko8;

import HI0.afx;
import QmE.iF;
import android.content.Context;
import android.net.Uri;
import com.alightcreative.app.motion.scene.Scene;
import ga6.j;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r53.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class UGc implements l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f5801n;
    private final r53.o rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final iF f5802t;

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Xo.values().length];
            try {
                iArr[Xo.f5805t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Xo.f5804n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UGc(Context context, r53.o sceneSerializer, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sceneSerializer, "sceneSerializer");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f5801n = context;
        this.rl = sceneSerializer;
        this.f5802t = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Uo(UUID uuid, UGc uGc, Scene scene) {
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        Context context = uGc.f5801n;
        Intrinsics.checkNotNull(uuid);
        FilesKt.writeText$default(afx.Z(context, uuid), o.j.n(uGc.rl, scene, null, 2, null), null, 2, null);
        return uuid.toString();
    }

    public x0X.n J2(final Scene scene, final UUID uuid) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: Ko8.s4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGc.Uo(uuid, this, scene);
            }
        }), j.w6.f67628O, j.EnumC0949j.f67618r, j.n.f67621O, null, 8, null), this.f5802t);
    }

    @Override // Ko8.l3D
    public x0X.n n(Scene scene, String id) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(id, "id");
        return J2(scene, UUID.fromString(id));
    }

    @Override // Ko8.l3D
    public x0X.n rl(final Scene scene, final Uri uri, final Xo importType) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(importType, "importType");
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: Ko8.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGc.O(this.f5809n, scene, uri, importType);
            }
        }), j.w6.f67628O, j.EnumC0949j.J2, j.n.f67621O, null, 8, null), this.f5802t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(UGc uGc, Scene scene, Uri uri, Xo xo) {
        UUID uuidRandomUUID = UUID.randomUUID();
        Context context = uGc.f5801n;
        Intrinsics.checkNotNull(uuidRandomUUID);
        FilesKt.writeText$default(afx.Z(context, uuidRandomUUID), uGc.rl.n(scene, uri.toString()), null, 2, null);
        int i2 = j.$EnumSwitchMapping$0[xo.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                jVar.setImportedProjectIds(SetsKt.plus(jVar.getImportedProjectIds(), uri.toString()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar2.setImportedXmlIds(SetsKt.plus(jVar2.getImportedXmlIds(), uri.toString()));
        }
        return uuidRandomUUID.toString();
    }
}
