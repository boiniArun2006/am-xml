package kxT;

import GJW.vd;
import LQ.CN3;
import LQ.fuX;
import LQ.j;
import VoG.Ml;
import VoG.w6;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import d2n.Wre;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import uPp.CN3;
import uPp.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements Qp.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PjV.j f70334n;
    private final Function1 rl;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: kxT.j$j, reason: collision with other inner class name */
    public static final class C1043j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1043j f70335n = new C1043j();

        C1043j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Ouh.n invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Ouh.n(it, null, null, null, 14, null);
        }
    }

    static final class n extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f70336O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f70337S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f70338Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70339e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f70340g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70341n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f70342o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f70343r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f70344t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70340g = obj;
            this.f70339e |= Integer.MIN_VALUE;
            return j.this.n(null, null, 0, null, null, this);
        }
    }

    public j(PjV.j assetSampleStreamFactory, Function1 videoDecoderFactory) {
        Intrinsics.checkNotNullParameter(assetSampleStreamFactory, "assetSampleStreamFactory");
        Intrinsics.checkNotNullParameter(videoDecoderFactory, "videoDecoderFactory");
        this.f70334n = assetSampleStreamFactory;
        this.rl = videoDecoderFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // Qp.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Context context, Uri uri, int i2, Surface surface, vd vdVar, Continuation continuation) throws fuX.j {
        n nVar;
        Surface surface2;
        vd vdVar2;
        j jVar;
        Context context2;
        int i3;
        CN3 cn3;
        CN3 cn32;
        CN3 cn33;
        CN3.n nVar2;
        CSs.j jVar2;
        w6 w6Var;
        LQ.CN3 cn34;
        vd vdVar3;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i5 = nVar.f70339e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                nVar.f70339e = i5 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f70340g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = nVar.f70339e;
        ?? r7 = 1;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                fuX fux = new fuX();
                try {
                    PjV.j jVar3 = this.f70334n;
                    nVar.f70341n = this;
                    nVar.f70344t = context;
                    surface2 = surface;
                    nVar.f70336O = surface2;
                    vdVar2 = vdVar;
                    nVar.J2 = vdVar2;
                    nVar.f70343r = fux;
                    nVar.f70342o = fux;
                    nVar.f70338Z = fux;
                    nVar.f70337S = i2;
                    nVar.f70339e = 1;
                    Object objN = jVar3.n(context, uri, i2, nVar);
                    if (objN != coroutine_suspended) {
                        jVar = this;
                        context2 = context;
                        i3 = i2;
                        cn3 = fux;
                        cn32 = cn3;
                        obj = objN;
                        cn33 = cn32;
                    }
                    return coroutine_suspended;
                } catch (fuX.j e2) {
                    e = e2;
                    r7 = fux;
                    if (e.rl() == r7) {
                        return new j.n(e.n());
                    }
                    throw e;
                }
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar2 = (CN3.n) nVar.f70338Z;
                w6Var = (w6) nVar.f70342o;
                jVar2 = (CSs.j) nVar.f70343r;
                cn33 = (LQ.CN3) nVar.J2;
                cn34 = (LQ.CN3) nVar.f70336O;
                vdVar3 = (vd) nVar.f70341n;
                ResultKt.throwOnFailure(obj);
                cn33.O((LQ.j) obj);
                return new j.w6(new Ml(w6Var, jVar2, new Wre(((d2n.Ml) cn34.O(kxT.n.t(jVar2))).Ik(), kxT.n.O(jVar2), null), nVar2, vdVar3));
            }
            i3 = nVar.f70337S;
            cn3 = (LQ.CN3) nVar.f70338Z;
            cn33 = (LQ.CN3) nVar.f70342o;
            cn32 = (fuX) nVar.f70343r;
            vd vdVar4 = (vd) nVar.J2;
            Surface surface3 = (Surface) nVar.f70336O;
            context2 = (Context) nVar.f70344t;
            jVar = (j) nVar.f70341n;
            ResultKt.throwOnFailure(obj);
            vdVar2 = vdVar4;
            surface2 = surface3;
            CSs.j jVar4 = (CSs.j) cn3.O((LQ.j) obj);
            uPp.CN3 cn3O = uPp.fuX.O(jVar4.getFormat(), i3);
            nVar2 = cn3O instanceof CN3.n ? (CN3.n) cn3O : null;
            if (nVar2 == null) {
                jVar4.release();
                cn33.n(new n.j("Invalid media format for a video track: " + uPp.Wre.n(jVar4.getFormat())));
                throw new KotlinNothingValueException();
            }
            w6 w6Var2 = (w6) jVar.rl.invoke(context2);
            Format format = jVar4.getFormat();
            nVar.f70341n = vdVar2;
            nVar.f70344t = cn32;
            nVar.f70336O = cn33;
            nVar.J2 = cn33;
            nVar.f70343r = jVar4;
            nVar.f70342o = w6Var2;
            nVar.f70338Z = nVar2;
            nVar.f70339e = 2;
            Object objXMQ = w6Var2.xMQ(jVar4, format, surface2, nVar);
            if (objXMQ != coroutine_suspended) {
                jVar2 = jVar4;
                w6Var = w6Var2;
                obj = objXMQ;
                cn34 = cn33;
                vdVar3 = vdVar2;
                cn33.O((LQ.j) obj);
                return new j.w6(new Ml(w6Var, jVar2, new Wre(((d2n.Ml) cn34.O(kxT.n.t(jVar2))).Ik(), kxT.n.O(jVar2), null), nVar2, vdVar3));
            }
            return coroutine_suspended;
        } catch (fuX.j e3) {
            e = e3;
        }
    }

    public /* synthetic */ j(PjV.j jVar, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new xv.j(null, null, null, 7, null) : jVar, (i2 & 2) != 0 ? C1043j.f70335n : function1);
    }
}
