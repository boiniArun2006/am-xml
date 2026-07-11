package oh;

import TFv.Lu;
import TFv.SPz;
import TFv.fuX;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.content.core.DataStore;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class n implements DataStore {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SharedPreferences f71559n;
    private final TFv.Wre nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SPz f71560t;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71562n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f71563t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71563t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.n(null, this);
        }
    }

    public n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferencesRl = CN3.rl(context, "oracle_refresh_token_encrypted");
        this.f71559n = sharedPreferencesRl;
        this.rl = "refresh_token";
        SPz sPzN = Lu.n(sharedPreferencesRl.getString("refresh_token", null));
        this.f71560t = sPzN;
        this.nr = fuX.t(sPzN);
    }

    @Override // androidx.content.core.DataStore
    public TFv.Wre getData() {
        return this.nr;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.content.core.DataStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Function2 function2, Continuation continuation) {
        j jVar;
        n nVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objInvoke = jVar.f71563t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            String str = (String) this.f71560t.getValue();
            jVar.f71562n = this;
            jVar.J2 = 1;
            objInvoke = function2.invoke(str, jVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            nVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (n) jVar.f71562n;
            ResultKt.throwOnFailure(objInvoke);
        }
        String str2 = (String) objInvoke;
        SharedPreferences.Editor editorEdit = nVar.f71559n.edit();
        if (str2 != null) {
            editorEdit.putString(nVar.rl, str2);
        } else {
            editorEdit.remove(nVar.rl);
        }
        editorEdit.apply();
        nVar.f71560t.setValue(str2);
        return str2;
    }
}
