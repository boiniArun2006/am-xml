package com.alightcreative.app.motion.activities.main;

import GJW.vd;
import GJW.xuv;
import QmE.iF;
import QmE.j;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import com.alightcreative.app.motion.activities.main.InterfaceC1725c;
import com.alightcreative.app.motion.activities.main.SPz;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000eJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u000eJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u000eJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010\u000eJ3\u0010)\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/alightcreative/app/motion/activities/main/r;", "LuW/n;", "Lcom/alightcreative/app/motion/activities/main/SPz;", "Lcom/alightcreative/app/motion/activities/main/c;", "LQmE/iF;", "eventLogger", "LJfs/CN3;", "setCreatorRankingDataUseCase", "LU/j;", "getProjectListSortOrderUseCase", "<init>", "(LQmE/iF;LJfs/CN3;LU/j;)V", "", "Uo", "()V", "Ik", "Z", "WPU", "aYN", "LtN/n;", "item", "XQ", "(LtN/n;)V", "ck", "o", "r", "S", "te", "nY", "LGJW/xuv;", "ViF", "()LGJW/xuv;", "g", "", "Lcom/alightcreative/app/motion/project/ProjectInfo$n;", "projectList", "Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "Lcom/alightcreative/app/motion/project/ProjectInfo;", "thumbnailCache", "Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;", "thumbnailMaker", "iF", "(Ljava/util/List;Lcom/alightcreative/app/motion/scene/BitmapLruCache;Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;)V", "LQmE/iF;", "KN", "LJfs/CN3;", "xMQ", "LU/j;", "mUb", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r extends uW.n {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    public final Jfs.CN3 setCreatorRankingDataUseCase;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    public final iF eventLogger;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    public final U.j getProjectListSortOrderUseCase;

    @Override // uW.w6
    public void Uo() {
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f45467n;

        public n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return r.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f45467n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                r.this.eventLogger.n(j.FP.f8392n);
                r.this.mUb(new SPz.I28(true));
                Jfs.CN3 cn3 = r.this.setCreatorRankingDataUseCase;
                this.f45467n = 1;
                if (cn3.xMQ(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            r.this.mUb(new SPz.I28(false));
            r.this.xMQ(InterfaceC1725c.j.f45430n);
            return Unit.INSTANCE;
        }
    }

    public r(iF eventLogger, Jfs.CN3 setCreatorRankingDataUseCase, U.j getProjectListSortOrderUseCase) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(setCreatorRankingDataUseCase, "setCreatorRankingDataUseCase");
        Intrinsics.checkNotNullParameter(getProjectListSortOrderUseCase, "getProjectListSortOrderUseCase");
        this.eventLogger = eventLogger;
        this.setCreatorRankingDataUseCase = setCreatorRankingDataUseCase;
        this.getProjectListSortOrderUseCase = getProjectListSortOrderUseCase;
        mUb(SPz.w6.f45416n);
    }

    public final void Ik() {
        mUb(SPz.w6.f45416n);
    }

    public final void S() {
        this.eventLogger.n(j.g.f8506n);
        xMQ(InterfaceC1725c.w6.f45432n);
        xMQ(InterfaceC1725c.j.f45430n);
    }

    public final void WPU() {
        mUb(SPz.Ml.f45412n);
    }

    public final void XQ(tN.n item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.eventLogger.n(new j.C1441i(item.n(), rWZ.o.f73106t));
        xMQ(new InterfaceC1725c.n(item.rl()));
    }

    public final void Z() {
        this.eventLogger.n(j.IG.f8406n);
        mUb(SPz.j.f45413n);
    }

    public final void aYN() {
        mUb(new SPz.I28(false, 1, null));
    }

    public final void g() {
        xMQ(InterfaceC1725c.j.f45430n);
    }

    public final void iF(List projectList, BitmapLruCache thumbnailCache, SceneThumbnailMaker thumbnailMaker) {
        Intrinsics.checkNotNullParameter(projectList, "projectList");
        Intrinsics.checkNotNullParameter(thumbnailMaker, "thumbnailMaker");
        this.eventLogger.n(j.s4.f8570n);
        mUb(new SPz.n(projectList, this.getProjectListSortOrderUseCase.invoke(), thumbnailCache, thumbnailMaker));
    }

    public final void nY() {
        xMQ(new InterfaceC1725c.Ml("https://www.alightcreative.com/ranking_program_pp.pdf"));
        xMQ(InterfaceC1725c.j.f45430n);
    }

    public final void o() {
        xMQ(InterfaceC1725c.j.f45430n);
    }

    public final void r() {
        this.eventLogger.n(j.mrQ.f8531n);
        xMQ(InterfaceC1725c.j.f45430n);
    }

    public final void te() {
        xMQ(new InterfaceC1725c.Ml("https://www.alightcreative.com/ranking_program_tos.pdf"));
        xMQ(InterfaceC1725c.j.f45430n);
    }

    public final xuv ViF() {
        return GJW.C.nr(ViewModelKt.n(this), null, null, new n(null), 3, null);
    }

    public final void ck() {
        SPz sPz = (SPz) nr();
        if (Intrinsics.areEqual(sPz, SPz.j.f45413n)) {
            this.eventLogger.n(j.mrQ.f8531n);
        } else if (!(sPz instanceof SPz.n) && !Intrinsics.areEqual(sPz, SPz.w6.f45416n) && !Intrinsics.areEqual(sPz, SPz.Ml.f45412n) && !(sPz instanceof SPz.I28) && sPz != null) {
            throw new NoWhenBranchMatchedException();
        }
        xMQ(InterfaceC1725c.j.f45430n);
    }
}
