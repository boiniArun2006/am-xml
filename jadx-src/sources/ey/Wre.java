package ey;

import LQ.fuX;
import LQ.j;
import android.content.Context;
import android.net.Uri;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Wre implements F3.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PjV.j f63917n;
    private final Function1 rl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f63918n = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final w6 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new w6(it, null, null, null, null, 30, null);
        }
    }

    static final class n extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f63919O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f63921Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f63922g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f63923n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f63924o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f63925r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f63926t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63921Z = obj;
            this.f63922g |= Integer.MIN_VALUE;
            return Wre.this.n(null, null, 0, this);
        }
    }

    public Wre(PjV.j assetSampleStreamFactory, Function1 audioDecoderFactory) {
        Intrinsics.checkNotNullParameter(assetSampleStreamFactory, "assetSampleStreamFactory");
        Intrinsics.checkNotNullParameter(audioDecoderFactory, "audioDecoderFactory");
        this.f63917n = assetSampleStreamFactory;
        this.rl = audioDecoderFactory;
    }

    private final LQ.j rl(Context context, CSs.j jVar, int i2) throws fuX.j {
        LQ.j nVar;
        F3.j jVar2;
        uPp.CN3 cn3O;
        LQ.fuX fux = new LQ.fuX();
        try {
            jVar2 = (F3.j) this.rl.invoke(context);
            cn3O = uPp.fuX.O(jVar.getFormat(), i2);
        } catch (fuX.j e2) {
            if (e2.rl() != fux) {
                throw e2;
            }
            nVar = new j.n(e2.n());
        }
        if ((cn3O instanceof CN3.j ? (CN3.j) cn3O : null) == null) {
            jVar2.release();
            fux.n(new n.j("Invalid media format for an audio track: " + uPp.Wre.n(jVar.getFormat())));
            throw new KotlinNothingValueException();
        }
        fux.O(jVar2.Uo(jVar.getFormat(), jVar));
        nVar = new j.w6(new CN3(jVar2, jVar));
        if (nVar instanceof j.n) {
            jVar.release();
        } else {
            boolean z2 = nVar instanceof j.w6;
        }
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // F3.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Context context, Uri uri, int i2, Continuation continuation) throws fuX.j {
        n nVar;
        LQ.CN3 cn3;
        Wre wre;
        Context context2;
        LQ.CN3 cn32;
        LQ.CN3 cn33;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i3 = nVar.f63922g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.f63922g = i3 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f63921Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = nVar.f63922g;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            LQ.fuX fux = new LQ.fuX();
            try {
                PjV.j jVar = this.f63917n;
                nVar.f63923n = this;
                nVar.f63926t = context;
                nVar.f63919O = fux;
                nVar.J2 = fux;
                nVar.f63925r = fux;
                nVar.f63924o = i2;
                nVar.f63922g = 1;
                Object objN = jVar.n(context, uri, i2, nVar);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                wre = this;
                context2 = context;
                cn32 = fux;
                cn3 = cn32;
                obj = objN;
                cn33 = cn3;
            } catch (fuX.j e2) {
                e = e2;
                cn3 = fux;
                if (e.rl() != cn3) {
                    return new j.n(e.n());
                }
                throw e;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = nVar.f63924o;
            cn32 = (LQ.CN3) nVar.f63925r;
            cn33 = (LQ.CN3) nVar.J2;
            cn3 = (LQ.fuX) nVar.f63919O;
            context2 = (Context) nVar.f63926t;
            wre = (Wre) nVar.f63923n;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (fuX.j e3) {
                e = e3;
                if (e.rl() != cn3) {
                }
            }
        }
        return new j.w6((Fs8.j) cn33.O(wre.rl(context2, (CSs.j) cn32.O((LQ.j) obj), i2)));
    }

    public /* synthetic */ Wre(PjV.j jVar, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new xv.j(null, null, null, 7, null) : jVar, (i2 & 2) != 0 ? j.f63918n : function1);
    }
}
