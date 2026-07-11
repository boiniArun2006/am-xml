package UX1;

import android.content.Context;
import androidx.content.core.DataStore;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.content.preferences.core.PreferencesKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {
    public static final int nr = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Preferences.Key f10777n;
    private final DataStore rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TFv.Wre f10778t;

    /* JADX INFO: renamed from: UX1.j$j, reason: collision with other inner class name */
    static final class C0380j extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10780n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f10781t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0380j(String str, Continuation continuation) {
            super(2, continuation);
            this.J2 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C0380j c0380j = j.this.new C0380j(this.J2, continuation);
            c0380j.f10781t = obj;
            return c0380j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10780n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f10781t).mUb(j.this.f10777n, this.J2);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((C0380j) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class n implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f10782n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ j f10783t;

        /* JADX INFO: renamed from: UX1.j$n$j, reason: collision with other inner class name */
        public static final class C0381j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f10784n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ j f10785t;

            /* JADX INFO: renamed from: UX1.j$n$j$j, reason: collision with other inner class name */
            public static final class C0382j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f10787n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f10788t;

                public C0382j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f10787n = obj;
                    this.f10788t |= Integer.MIN_VALUE;
                    return C0381j.this.rl(null, this);
                }
            }

            public C0381j(TFv.CN3 cn3, j jVar) {
                this.f10784n = cn3;
                this.f10785t = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0382j c0382j;
                if (continuation instanceof C0382j) {
                    c0382j = (C0382j) continuation;
                    int i2 = c0382j.f10788t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0382j.f10788t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0382j = new C0382j(continuation);
                    }
                }
                Object obj2 = c0382j.f10787n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0382j.f10788t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f10784n;
                    Object objRl = ((Preferences) obj).rl(this.f10785t.f10777n);
                    c0382j.f10788t = 1;
                    if (cn3.rl(objRl, c0382j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public n(TFv.Wre wre, j jVar) {
            this.f10782n = wre;
            this.f10783t = jVar;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f10782n.n(new C0381j(cn3, this.f10783t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public j(Context context, String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f10777n = PreferencesKeys.Uo("endpoint_override_" + key);
        DataStore dataStoreNr = w6.nr(context);
        this.rl = dataStoreNr;
        this.f10778t = new n(dataStoreNr.getData(), this);
    }

    public final TFv.Wre rl() {
        return this.f10778t;
    }

    public final Object t(String str, Continuation continuation) {
        Object objN = PreferencesKt.n(this.rl, new C0380j(str, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }
}
