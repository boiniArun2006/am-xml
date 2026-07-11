package com.alightcreative.app.motion.ranking.ui.editprofile;

import F.Xo;
import FX.Ml;
import GJW.C;
import GJW.vd;
import GJW.xuv;
import MO.z;
import QmE.iF;
import QmE.j;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import com.alightcreative.app.motion.ranking.ui.editprofile.I28;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0015J%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/alightcreative/app/motion/ranking/ui/editprofile/Wre;", "LuW/n;", "LF/Xo;", "Lcom/alightcreative/app/motion/ranking/ui/editprofile/I28;", "LQmE/iF;", "eventLogger", "LJfs/w6;", "getCurrentCreatorRankingDataUseCase", "LJfs/CN3;", "setCreatorRankingDataUseCase", "<init>", "(LQmE/iF;LJfs/w6;LJfs/CN3;)V", "", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "", "aYN", "(Ljava/lang/String;)Z", "ViF", "nY", "", "Uo", "()V", "o", "XQ", "WPU", "S", "tiktokUsername", "instagramUsername", "youtubeUsername", "LGJW/xuv;", "Z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LGJW/xuv;", "LQmE/iF;", "KN", "LJfs/w6;", "xMQ", "LJfs/CN3;", "mUb", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEditProfileViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProfileViewModel.kt\ncom/alightcreative/app/motion/ranking/ui/editprofile/EditProfileViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
public final class Wre extends uW.n {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final Jfs.w6 getCurrentCreatorRankingDataUseCase;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final iF eventLogger;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final Jfs.CN3 setCreatorRankingDataUseCase;

    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f45900O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f45901n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f45902r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.f45900O = str;
            this.J2 = str2;
            this.f45902r = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Wre.this.new n(this.f45900O, this.J2, this.f45902r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objUo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f45901n;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (Wre.this.ViF(this.f45900O) && Wre.this.aYN(this.J2) && Wre.this.nY(this.f45902r)) {
                    Xo xo = (Xo) Wre.this.nr();
                    if (xo == null || !xo.mUb()) {
                        Wre.this.eventLogger.n(j.I7.f8403n);
                    } else {
                        Wre.this.eventLogger.n(new j.C1447u(!StringsKt.isBlank(this.J2), !StringsKt.isBlank(this.f45900O), !StringsKt.isBlank(this.f45902r)));
                    }
                    Wre wre = Wre.this;
                    Xo xo2 = (Xo) wre.nr();
                    wre.mUb(xo2 != null ? Xo.rl(xo2, false, true, false, null, null, null, null, null, null, 509, null) : null);
                    Jfs.CN3 cn3 = Wre.this.setCreatorRankingDataUseCase;
                    List listListOf = CollectionsKt.listOf((Object[]) new FX.Ml[]{new Ml.n(this.f45900O), new Ml.j(this.J2), new Ml.w6(this.f45902r)});
                    this.f45901n = 1;
                    objUo = cn3.Uo(listListOf, this);
                    if (objUo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objUo = obj;
            x0X.n nVar = (x0X.n) objUo;
            Wre wre2 = Wre.this;
            boolean z2 = nVar instanceof n.C1266n;
            if (!z2) {
                if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Xo xo3 = (Xo) wre2.nr();
                if (xo3 == null || !xo3.mUb()) {
                    wre2.xMQ(I28.j.f45896n);
                } else {
                    Xo xo4 = (Xo) wre2.nr();
                    wre2.mUb(xo4 != null ? Xo.rl(xo4, false, false, true, null, null, null, null, null, null, 505, null) : null);
                }
            }
            Wre wre3 = Wre.this;
            if (z2) {
                Xo xo5 = (Xo) wre3.nr();
                wre3.mUb(xo5 != null ? Xo.rl(xo5, false, false, false, null, null, null, null, null, null, 509, null) : null);
                wre3.xMQ(I28.Ml.f45895n);
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    public Wre(iF eventLogger, Jfs.w6 getCurrentCreatorRankingDataUseCase, Jfs.CN3 setCreatorRankingDataUseCase) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(getCurrentCreatorRankingDataUseCase, "getCurrentCreatorRankingDataUseCase");
        Intrinsics.checkNotNullParameter(setCreatorRankingDataUseCase, "setCreatorRankingDataUseCase");
        this.eventLogger = eventLogger;
        this.getCurrentCreatorRankingDataUseCase = getCurrentCreatorRankingDataUseCase;
        this.setCreatorRankingDataUseCase = setCreatorRankingDataUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ViF(String username) {
        if (new Regex("^[a-zA-Z0-9_.]{0,24}$").matches(username)) {
            return true;
        }
        Xo xo = (Xo) nr();
        mUb(xo != null ? Xo.rl(xo, false, false, false, null, z.f6601o, null, null, null, null, 175, null) : null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean aYN(String username) {
        if (new Regex("^[a-zA-Z0-9_.]{0,30}$").matches(username)) {
            return true;
        }
        Xo xo = (Xo) nr();
        mUb(xo != null ? Xo.rl(xo, false, false, false, null, null, null, z.f6599Z, null, null, 175, null) : null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean nY(String username) {
        if (new Regex("^.{0,60}$").matches(username)) {
            return true;
        }
        Xo xo = (Xo) nr();
        mUb(xo != null ? Xo.rl(xo, false, false, false, null, null, null, null, null, z.f6598S, 175, null) : null);
        return false;
    }

    public final void S() {
        xMQ(I28.n.f45897n);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    @Override // uW.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Uo() {
        String str;
        String str2;
        String str3;
        FX.j jVarN;
        List listT;
        String strRl;
        FX.j jVarN2;
        List listT2;
        Object next;
        String strRl2;
        FX.j jVarN3;
        List listT3;
        Object next2;
        String strRl3;
        FX.n nVar = (FX.n) this.getCurrentCreatorRankingDataUseCase.n().getValue();
        boolean z2 = nVar == null || !nVar.t();
        Object obj = null;
        if (nVar == null || (jVarN3 = nVar.n()) == null || (listT3 = jVarN3.t()) == null) {
            str = "";
        } else {
            Iterator it = listT3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (((FX.Ml) next2) instanceof Ml.j) {
                        break;
                    }
                }
            }
            FX.Ml ml = (FX.Ml) next2;
            if (ml != null && (strRl3 = ml.rl()) != null) {
                str = strRl3;
            }
        }
        if (nVar == null || (jVarN2 = nVar.n()) == null || (listT2 = jVarN2.t()) == null) {
            str2 = "";
        } else {
            Iterator it2 = listT2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((FX.Ml) next) instanceof Ml.n) {
                        break;
                    }
                }
            }
            FX.Ml ml2 = (FX.Ml) next;
            if (ml2 != null && (strRl2 = ml2.rl()) != null) {
                str2 = strRl2;
            }
        }
        if (nVar == null || (jVarN = nVar.n()) == null || (listT = jVarN.t()) == null) {
            str3 = "";
        } else {
            Iterator it3 = listT.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if (((FX.Ml) next3) instanceof Ml.w6) {
                    obj = next3;
                    break;
                }
            }
            FX.Ml ml3 = (FX.Ml) obj;
            if (ml3 != null && (strRl = ml3.rl()) != null) {
                str3 = strRl;
            }
        }
        mUb(new Xo(z2, false, false, str2, null, str, null, str3, null, 342, null));
    }

    public final void WPU() {
        this.eventLogger.n(j.g62.f8507n);
        xMQ(I28.w6.f45898n);
    }

    public final void XQ() {
        xMQ(I28.j.f45896n);
    }

    public final xuv Z(String tiktokUsername, String instagramUsername, String youtubeUsername) {
        Intrinsics.checkNotNullParameter(tiktokUsername, "tiktokUsername");
        Intrinsics.checkNotNullParameter(instagramUsername, "instagramUsername");
        Intrinsics.checkNotNullParameter(youtubeUsername, "youtubeUsername");
        return C.nr(ViewModelKt.n(this), null, null, new n(tiktokUsername, instagramUsername, youtubeUsername, null), 3, null);
    }

    public final void o() {
        xMQ(I28.j.f45896n);
    }
}
