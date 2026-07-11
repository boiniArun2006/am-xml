package WaZ;

import ILs.l3D;
import ILs.s4;
import QmE.iF;
import QmE.j;
import TFv.Wre;
import WaZ.I28;
import com.alightcreative.account.LicenseInfo;
import com.alightcreative.account.SKUInfo;
import com.alightcreative.account.o;
import java.util.Set;
import kgE.Sis;
import kgE.Zs;
import kgE.fuX;
import kgE.l4Z;
import kgE.psW;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 implements fVJ.I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f11522n;
    private final iF rl;

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ String E2;
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ String f11523N;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ String f11525S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ String f11526T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ String f11527X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ String f11528Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f11529e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f11530g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11531n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f11532o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f11533r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f11534t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ String f11535v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Continuation continuation) {
            super(2, continuation);
            this.J2 = str;
            this.f11533r = str2;
            this.f11532o = str3;
            this.f11528Z = str4;
            this.f11525S = str5;
            this.f11530g = str6;
            this.E2 = str7;
            this.f11529e = str8;
            this.f11527X = str9;
            this.f11526T = str10;
            this.f11523N = str11;
            this.f11535v = str12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = I28.this.new j(this.J2, this.f11533r, this.f11532o, this.f11528Z, this.f11525S, this.f11530g, this.E2, this.f11529e, this.f11527X, this.f11526T, this.f11523N, this.f11535v, continuation);
            jVar.f11534t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f11531n;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final s4 s4Var = (s4) this.f11534t;
                final I28 i28 = I28.this;
                final String str = this.J2;
                final String str2 = this.f11533r;
                final String str3 = this.f11532o;
                final String str4 = this.f11528Z;
                final String str5 = this.f11525S;
                final String str6 = this.f11530g;
                final String str7 = this.f11527X;
                final String str8 = this.f11526T;
                final String str9 = this.E2;
                final String str10 = this.f11529e;
                final String str11 = this.f11523N;
                final String str12 = this.f11535v;
                final l4Z l4z = new l4Z() { // from class: WaZ.w6
                    @Override // kgE.l4Z
                    public final void n(o oVar) {
                        I28.j.mUb(s4Var, i28, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, oVar);
                    }
                };
                I28.this.f11522n.n();
                I28.this.f11522n.S();
                Sis.gh(l4z);
                I28.this.f11522n.qie();
                fuX.j.n(I28.this.f11522n, CollectionsKt.listOfNotNull((Object[]) new String[]{this.J2, this.f11533r, this.f11532o, this.f11528Z, this.f11525S, this.f11530g, this.E2, this.f11529e, this.f11527X, this.f11526T, this.f11523N, this.f11535v}), null, 2, null);
                Function0 function0 = new Function0() { // from class: WaZ.Ml
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return I28.j.gh(l4z);
                    }
                };
                this.f11531n = 1;
                if (l3D.rl(s4Var, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit gh(l4Z l4z) {
            Sis.ty(l4z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void mUb(s4 s4Var, I28 i28, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, o oVar) {
            String sku;
            Zs zsXMQ = oVar.xMQ();
            Set setNr = oVar.nr();
            mg4.Ml ml = new mg4.Ml(TuplesKt.to(mg4.w6.f70997n, CollectionsKt.listOfNotNull((Object[]) new mg4.j[]{I28.xMQ(i28, oVar, str, str2, null, null, 24, null), I28.xMQ(i28, oVar, str3, str4, null, null, 24, null)})), TuplesKt.to(mg4.w6.f70998t, CollectionsKt.listOfNotNull((Object[]) new mg4.j[]{i28.KN(oVar, str5, str6, str7, str8), i28.KN(oVar, str9, str10, str11, str12)})));
            SKUInfo sKUInfo = (SKUInfo) CollectionsKt.firstOrNull(oVar.KN());
            psW pswO = null;
            if (sKUInfo != null) {
                sku = sKUInfo.getSku();
            } else {
                sku = null;
            }
            LicenseInfo licenseInfo = (LicenseInfo) CollectionsKt.firstOrNull(oVar.O());
            if (licenseInfo != null) {
                pswO = i28.O(oVar, licenseInfo);
            }
            s4Var.nr(new mg4.n(zsXMQ, setNr, ml, sku, pswO));
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
        public final Object invoke(s4 s4Var, Continuation continuation) {
            return ((j) create(s4Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final kgE.j J2(o oVar, String str, boolean z2) {
        if (str == null) {
            return null;
        }
        kgE.j jVar = (kgE.j) oVar.J2().get(str);
        if (jVar != null) {
            return jVar;
        }
        if ((!z2 || oVar.mUb()) && !oVar.J2().isEmpty()) {
            this.rl.n(new j.hQ(str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mg4.j KN(o oVar, String str, String str2, String str3, String str4) {
        kgE.j jVarUo = Uo(this, oVar, str, false, 4, null);
        if (jVarUo != null) {
            return new mg4.j(jVarUo, J2(oVar, str2, true), Uo(this, oVar, str3, false, 4, null), J2(oVar, str4, true));
        }
        return null;
    }

    public I28(fuX iapManager, iF eventLogger) {
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f11522n = iapManager;
        this.rl = eventLogger;
    }

    static /* synthetic */ kgE.j Uo(I28 i28, o oVar, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return i28.J2(oVar, str, z2);
    }

    static /* synthetic */ mg4.j xMQ(I28 i28, o oVar, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            str4 = null;
        }
        return i28.KN(oVar, str, str2, str3, str4);
    }

    @Override // fVJ.I28
    public Wre n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return TFv.fuX.J2(new j(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final psW O(o oVar, LicenseInfo licenseInfo) {
        kgE.j jVar = (kgE.j) oVar.J2().get(licenseInfo.getProductId());
        if (jVar != null) {
            return new psW(jVar.xMQ(), licenseInfo.getStore(), jVar.nr(), jVar.O(), jVar.Uo(), jVar.KN(), jVar.J2());
        }
        return null;
    }
}
