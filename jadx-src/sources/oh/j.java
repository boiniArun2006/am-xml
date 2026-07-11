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
final class j implements DataStore {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SharedPreferences f71554n;
    private final TFv.Wre nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SPz f71555t;

    /* JADX INFO: renamed from: oh.j$j, reason: collision with other inner class name */
    static final class C1087j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71557n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f71558t;

        C1087j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71558t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.n(null, this);
        }
    }

    public j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferencesRl = CN3.rl(context, "oracle_identity_token_encrypted");
        this.f71554n = sharedPreferencesRl;
        this.rl = "identity_token";
        SPz sPzN = Lu.n(sharedPreferencesRl.getString("identity_token", null));
        this.f71555t = sPzN;
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
        C1087j c1087j;
        j jVar;
        if (continuation instanceof C1087j) {
            c1087j = (C1087j) continuation;
            int i2 = c1087j.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1087j.J2 = i2 - Integer.MIN_VALUE;
            } else {
                c1087j = new C1087j(continuation);
            }
        }
        Object objInvoke = c1087j.f71558t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c1087j.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            String str = (String) this.f71555t.getValue();
            c1087j.f71557n = this;
            c1087j.J2 = 1;
            objInvoke = function2.invoke(str, c1087j);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) c1087j.f71557n;
            ResultKt.throwOnFailure(objInvoke);
        }
        String str2 = (String) objInvoke;
        SharedPreferences.Editor editorEdit = jVar.f71554n.edit();
        if (str2 != null) {
            editorEdit.putString(jVar.rl, str2);
        } else {
            editorEdit.remove(jVar.rl);
        }
        editorEdit.apply();
        jVar.f71555t.setValue(str2);
        return str2;
    }
}
