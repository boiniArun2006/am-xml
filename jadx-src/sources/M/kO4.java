package M;

import M.rv6;
import QmE.j;
import android.net.Uri;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import com.alightcreative.account.CloudStorageStatus;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import wtO.n;
import x0X.n;
import y.EnumC2429Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 V2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001WBY\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u001d\u0010!\u001a\u00020\u0002*\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u001b2\b\b\u0002\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J3\u0010,\u001a\u00020\u001b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001bH\u0002¢\u0006\u0004\b.\u0010\u001dJ\u0017\u00100\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020*H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001bH\u0010¢\u0006\u0004\b2\u0010\u001dJ\r\u00103\u001a\u00020\u001b¢\u0006\u0004\b3\u0010\u001dJ\u0015\u00106\u001a\u00020\u001b2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\u001b2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u001b¢\u0006\u0004\b<\u0010\u001dJ\r\u0010=\u001a\u00020\u001b¢\u0006\u0004\b=\u0010\u001dJ!\u0010A\u001a\u00020\u001b2\b\u0010?\u001a\u0004\u0018\u00010>2\b\u0010@\u001a\u0004\u0018\u00010'¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010CR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, d2 = {"LM/kO4;", "LuW/w6;", "LM/qYU;", "LM/c7r;", "LM/rv6;", "LU/j;", "getProjectListSortOrderUseCase", "LU/w6;", "setProjectListSortOrderUseCase", "LWK/I28;", "newFeatureManager", "LQmE/iF;", "eventLogger", "LnYs/Ml;", "getAlightSettingsUseCase", "LkgE/fuX;", "iapManager", "LwtO/n;", "cleanUpFailedUploadsUseCase", "LwtO/CN3;", "getCurrentCloudStorageStatusUseCase", "LwtO/Dsr;", "linkLocalAndCloudProjectUseCase", "Lr53/aC;", "importTemplateUseCase", "<init>", "(LU/j;LU/w6;LWK/I28;LQmE/iF;LnYs/Ml;LkgE/fuX;LwtO/n;LwtO/CN3;LwtO/Dsr;Lr53/aC;)V", "", "WPU", "()V", "S", "Lcom/alightcreative/account/CloudStorageStatus;", "cloudStatus", "N", "(LM/qYU;Lcom/alightcreative/account/CloudStorageStatus;)LM/qYU;", "", "isSingleImport", "g", "(Z)V", "", "id", "Lkotlin/Pair;", "", "importTemplateSuccessAndFailCount", "ViF", "(Ljava/lang/String;Lkotlin/Pair;)V", "X", "progressDialogValue", "iF", "(I)V", "Uo", "fD", "Lsix/CN3;", "filterType", "E2", "(Lsix/CN3;)V", "LKA9/u;", "option", "e", "(LKA9/u;)V", "XQ", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroid/net/Uri;", "uri", "type", "aYN", "(Landroid/net/Uri;Ljava/lang/String;)V", "LU/j;", "KN", "LU/w6;", "xMQ", "LWK/I28;", "mUb", "LQmE/iF;", "gh", "LnYs/Ml;", "qie", "LkgE/fuX;", "az", "LwtO/n;", "ty", "LwtO/CN3;", "HI", "LwtO/Dsr;", "ck", "Lr53/aC;", "Ik", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class kO4 extends uW.w6 {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final wtO.Dsr linkLocalAndCloudProjectUseCase;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final U.w6 setProjectListSortOrderUseCase;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final U.j getProjectListSortOrderUseCase;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final wtO.n cleanUpFailedUploadsUseCase;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final r53.aC importTemplateUseCase;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final QmE.iF eventLogger;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final kgE.fuX iapManager;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final wtO.CN3 getCurrentCloudStorageStatusUseCase;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final WK.I28 newFeatureManager;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Uri f6419O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6420n;

        /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
            j(Object obj) {
                super(1, obj, kO4.class, "onProgressChanged", "onProgressChanged(I)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void n(int i2) {
                ((kO4) this.receiver).iF(i2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f6419O = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return kO4.this.new I28(this.f6419O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6420n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                r53.aC aCVar = kO4.this.importTemplateUseCase;
                Uri uri = this.f6419O;
                j jVar = new j(kO4.this);
                this.f6420n = 1;
                obj = aCVar.rl(uri, jVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            kO4 ko4 = kO4.this;
            boolean z2 = nVar instanceof n.C1266n;
            if (!z2) {
                if (nVar instanceof n.w6) {
                    kO4.nY(ko4, null, (Pair) ((n.w6) nVar).n(), 1, null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            kO4 ko42 = kO4.this;
            if (z2) {
                ko42.g(false);
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Uri f6422O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6423n;

        /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
            j(Object obj) {
                super(1, obj, kO4.class, "onProgressChanged", "onProgressChanged(I)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void n(int i2) {
                ((kO4) this.receiver).iF(i2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f6422O = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return kO4.this.new Ml(this.f6422O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6423n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                r53.aC aCVar = kO4.this.importTemplateUseCase;
                Uri uri = this.f6422O;
                j jVar = new j(kO4.this);
                this.f6423n = 1;
                obj = aCVar.n(uri, jVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            kO4 ko4 = kO4.this;
            boolean z2 = nVar instanceof n.C1266n;
            if (!z2) {
                if (nVar instanceof n.w6) {
                    kO4.nY(ko4, (String) ((n.w6) nVar).n(), null, 2, null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            kO4 ko42 = kO4.this;
            if (z2) {
                kO4.te(ko42, false, 1, null);
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6425n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return kO4.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6425n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                wtO.n nVar = kO4.this.cleanUpFailedUploadsUseCase;
                String uid = kO4.this.iapManager.getUid();
                this.f6425n = 1;
                if (n.j.n(nVar, uid, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6427n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ kO4 f6429O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f6430n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f6431t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(kO4 ko4, Continuation continuation) {
                super(2, continuation);
                this.f6429O = ko4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f6429O, continuation);
                jVar.f6431t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                qYU qyuN;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f6430n == 0) {
                    ResultKt.throwOnFailure(obj);
                    CloudStorageStatus cloudStorageStatus = (CloudStorageStatus) this.f6431t;
                    kO4 ko4 = this.f6429O;
                    qYU qyu = (qYU) ko4.nr();
                    if (qyu != null) {
                        qyuN = this.f6429O.N(qyu, cloudStorageStatus);
                    } else {
                        qyuN = null;
                    }
                    ko4.mUb(qyuN);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CloudStorageStatus cloudStorageStatus, Continuation continuation) {
                return ((j) create(cloudStorageStatus, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return kO4.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6427n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreS7N = TFv.fuX.s7N(kO4.this.getCurrentCloudStorageStatusUseCase.invoke(), new j(kO4.this, null));
                this.f6427n = 1;
                if (TFv.fuX.mUb(wreS7N, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ void te(kO4 ko4, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        ko4.g(z2);
    }

    @Override // uW.w6
    public void Uo() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO4(U.j getProjectListSortOrderUseCase, U.w6 setProjectListSortOrderUseCase, WK.I28 newFeatureManager, QmE.iF eventLogger, nYs.Ml ml, kgE.fuX iapManager, wtO.n cleanUpFailedUploadsUseCase, wtO.CN3 getCurrentCloudStorageStatusUseCase, wtO.Dsr linkLocalAndCloudProjectUseCase, r53.aC importTemplateUseCase) {
        super(new Function1() { // from class: M.pq
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kO4.az((qYU) obj);
            }
        });
        Intrinsics.checkNotNullParameter(getProjectListSortOrderUseCase, "getProjectListSortOrderUseCase");
        Intrinsics.checkNotNullParameter(setProjectListSortOrderUseCase, "setProjectListSortOrderUseCase");
        Intrinsics.checkNotNullParameter(newFeatureManager, "newFeatureManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(ml, qUrazMnwDskFs.FJSKZbcptFnp);
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(cleanUpFailedUploadsUseCase, "cleanUpFailedUploadsUseCase");
        Intrinsics.checkNotNullParameter(getCurrentCloudStorageStatusUseCase, "getCurrentCloudStorageStatusUseCase");
        Intrinsics.checkNotNullParameter(linkLocalAndCloudProjectUseCase, "linkLocalAndCloudProjectUseCase");
        Intrinsics.checkNotNullParameter(importTemplateUseCase, "importTemplateUseCase");
        this.getProjectListSortOrderUseCase = getProjectListSortOrderUseCase;
        this.setProjectListSortOrderUseCase = setProjectListSortOrderUseCase;
        this.newFeatureManager = newFeatureManager;
        this.eventLogger = eventLogger;
        this.getAlightSettingsUseCase = ml;
        this.iapManager = iapManager;
        this.cleanUpFailedUploadsUseCase = cleanUpFailedUploadsUseCase;
        this.getCurrentCloudStorageStatusUseCase = getCurrentCloudStorageStatusUseCase;
        this.linkLocalAndCloudProjectUseCase = linkLocalAndCloudProjectUseCase;
        this.importTemplateUseCase = importTemplateUseCase;
        KA9.u uVarInvoke = getProjectListSortOrderUseCase.invoke();
        boolean zRl = newFeatureManager.rl(WK.Ml.f11456g);
        nYs.j jVarInvoke = ml.invoke();
        boolean zU = jVarInvoke != null ? jVarInvoke.U() : false;
        nYs.j jVarInvoke2 = ml.invoke();
        mUb(N(new qYU(uVarInvoke, zRl, true, zU, jVarInvoke2 != null ? jVarInvoke2.U() : false, XFr.j.nr(0), XFr.j.nr(0), EnumC2429Ml.f75527n, false, MapsKt.emptyMap(), null, 1024, null), (CloudStorageStatus) getCurrentCloudStorageStatusUseCase.invoke().getValue()));
        S();
        WPU();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qYU N(qYU qyu, CloudStorageStatus cloudStorageStatus) {
        EnumC2429Ml enumC2429Ml;
        if (cloudStorageStatus == null) {
            return qyu;
        }
        long jJ2 = XFr.j.J2(cloudStorageStatus.getUsedStorage());
        long jJ22 = XFr.j.J2(cloudStorageStatus.getAllowedStorage());
        float usedStorage = (cloudStorageStatus.getUsedStorage() * 1.0f) / cloudStorageStatus.getAllowedStorage();
        boolean zContains = this.iapManager.Uo().contains(kgE.K.Xw);
        if (usedStorage > 0.95f) {
            enumC2429Ml = EnumC2429Ml.f75526O;
        } else {
            enumC2429Ml = usedStorage > (zContains ? 0.8f : 0.5f) ? EnumC2429Ml.f75529t : EnumC2429Ml.f75527n;
        }
        return qYU.rl(qyu, null, false, false, false, false, jJ2, jJ22, enumC2429Ml, false, null, null, 1567, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c7r az(qYU it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return hQ.n(it);
    }

    static /* synthetic */ void nY(kO4 ko4, String str, Pair pair, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            pair = null;
        }
        ko4.ViF(str, pair);
    }

    public final void E2(six.CN3 filterType) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        if (filterType == six.CN3.f73283r) {
            this.newFeatureManager.n(WK.Ml.f11456g);
            qYU qyu = (qYU) nr();
            mUb(qyu != null ? qYU.rl(qyu, null, false, false, false, false, 0L, 0L, null, false, null, null, 2045, null) : null);
        }
        this.eventLogger.n(new j.bwY(rWZ.j.qie(filterType)));
        S();
    }

    public final void T() {
        xMQ(rv6.w6.f6520n);
    }

    public final void XQ() {
        KA9.u uVarInvoke = this.getProjectListSortOrderUseCase.invoke();
        qYU qyu = (qYU) nr();
        if ((qyu != null ? qyu.O() : null) != uVarInvoke) {
            qYU qyu2 = (qYU) nr();
            mUb(qyu2 != null ? qYU.rl(qyu2, uVarInvoke, false, false, false, false, 0L, 0L, null, false, null, null, 2046, null) : null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r11.equals("text/xml") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r11.equals("application/xml") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        r0 = GJW.C.nr(androidx.view.ViewModelKt.n(r9), null, null, new M.kO4.Ml(r9, r10, null), 3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void aYN(Uri uri, String type) {
        this.eventLogger.n(j.g9.f8508n);
        if (uri == null) {
            te(this, false, 1, null);
            return;
        }
        iF(0);
        if (type != null) {
            int iHashCode = type.hashCode();
            if (iHashCode != -1248326952) {
                if (iHashCode != -1248325150) {
                    if (iHashCode == -1004727243) {
                    }
                } else if (type.equals("application/zip")) {
                    GJW.C.nr(ViewModelKt.n(this), null, null, new I28(uri, null), 3, null);
                    return;
                }
            }
        }
        te(this, false, 1, null);
        Unit unit = Unit.INSTANCE;
    }

    public final void e(KA9.u option) {
        Intrinsics.checkNotNullParameter(option, "option");
        if (this.getProjectListSortOrderUseCase.invoke() != option) {
            this.setProjectListSortOrderUseCase.n(option);
        }
        qYU qyu = (qYU) nr();
        mUb(qyu != null ? qYU.rl(qyu, option, false, false, false, false, 0L, 0L, null, false, null, null, 2046, null) : null);
    }

    public final void fD() {
        qYU qyuRl;
        Map mapEmptyMap;
        qYU qyu = (qYU) nr();
        if (qyu != null) {
            String uid = this.iapManager.getUid();
            if (uid == null || (mapEmptyMap = this.linkLocalAndCloudProjectUseCase.O(uid)) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            qyuRl = qYU.rl(qyu, null, false, false, false, false, 0L, 0L, null, false, mapEmptyMap, null, 1535, null);
        } else {
            qyuRl = null;
        }
        mUb(qyuRl);
    }

    private final void S() {
        GJW.C.nr(ViewModelKt.n(this), null, null, new n(null), 3, null);
    }

    private final void ViF(String id, Pair importTemplateSuccessAndFailCount) {
        Pair pair;
        X();
        if (importTemplateSuccessAndFailCount == null) {
            pair = new Pair(1, 0);
        } else {
            pair = importTemplateSuccessAndFailCount;
        }
        int iIntValue = ((Number) pair.component1()).intValue();
        this.eventLogger.n(new j.C1446t(((Number) pair.component2()).intValue() + iIntValue, iIntValue, rWZ.QJ.f73066n));
        xMQ(new rv6.n(id, importTemplateSuccessAndFailCount));
    }

    private final void WPU() {
        GJW.C.nr(ViewModelKt.n(this), null, null, new w6(null), 3, null);
    }

    private final void X() {
        qYU qyuRl;
        qYU qyu = (qYU) nr();
        if (qyu != null) {
            qyuRl = qYU.rl(qyu, null, false, false, false, false, 0L, 0L, null, false, null, null, 1023, null);
        } else {
            qyuRl = null;
        }
        mUb(qyuRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(boolean isSingleImport) {
        X();
        this.eventLogger.n(j.cA.f8485n);
        xMQ(new rv6.j(isSingleImport));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iF(int progressDialogValue) {
        qYU qyuRl;
        qYU qyu = (qYU) nr();
        if (qyu != null) {
            qyuRl = qYU.rl(qyu, null, false, false, false, false, 0L, 0L, null, false, null, Integer.valueOf(progressDialogValue), 1023, null);
        } else {
            qyuRl = null;
        }
        mUb(qyuRl);
    }
}
