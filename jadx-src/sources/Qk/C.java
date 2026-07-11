package Qk;

import SJ0.V1;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.alightcreative.app.motion.scene.ExportProgress;
import com.alightcreative.app.motion.scene.SceneExporterSuspendKt;
import com.alightcreative.time.Kw.znsSxz;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class C extends Dialog {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Function0 f8226O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private V1 f8227n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f8228t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Context context, int i2) {
        super(context, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8228t = "";
        setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(C c2, View view) {
        Function0 function0 = c2.f8226O;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void J2(ExportProgress progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        V1 v1 = this.f8227n;
        V1 v12 = null;
        if (v1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1 = null;
        }
        v1.J2.setMax(progress.getMax());
        V1 v13 = this.f8227n;
        if (v13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v13 = null;
        }
        v13.J2.setProgress(progress.getCurrent());
        double percentage = SceneExporterSuspendKt.getPercentage(progress);
        String strValueOf = Double.isNaN(percentage) ? "0" : String.valueOf(MathKt.roundToInt(percentage * ((double) 100)));
        V1 v14 = this.f8227n;
        if (v14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            v12 = v14;
        }
        v12.f9372O.setText(strValueOf + "%");
    }

    public final void O(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f8228t = str;
    }

    public final void nr(String msg, String str) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        V1 v1 = this.f8227n;
        V1 v12 = null;
        if (v1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1 = null;
        }
        v1.Uo.setVisibility(0);
        V1 v13 = this.f8227n;
        if (v13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v13 = null;
        }
        v13.Uo.setText(msg);
        V1 v14 = this.f8227n;
        if (v14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            v12 = v14;
        }
        AppCompatTextView appCompatTextView = v12.nr;
        if (str == null) {
            str = znsSxz.cjfYnXfhB;
        }
        appCompatTextView.setText(str);
        this.f8228t = msg;
    }

    public final void t(Function0 function0) {
        this.f8226O = function0;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        V1 v1T = V1.t(getLayoutInflater());
        this.f8227n = v1T;
        V1 v1 = null;
        if (v1T == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1T = null;
        }
        setContentView(v1T.getRoot());
        nr(this.f8228t, null);
        V1 v12 = this.f8227n;
        if (v12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12 = null;
        }
        v12.f9374t.setVisibility(0);
        V1 v13 = this.f8227n;
        if (v13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v13 = null;
        }
        v13.J2.setVisibility(0);
        V1 v14 = this.f8227n;
        if (v14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v14 = null;
        }
        v14.f9372O.setVisibility(0);
        V1 v15 = this.f8227n;
        if (v15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v15 = null;
        }
        v15.nr.setVisibility(0);
        V1 v16 = this.f8227n;
        if (v16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v16 = null;
        }
        v16.rl.setVisibility(0);
        V1 v17 = this.f8227n;
        if (v17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            v1 = v17;
        }
        v1.rl.setOnClickListener(new View.OnClickListener() { // from class: Qk.aC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C.rl(this.f8246n, view);
            }
        });
    }
}
