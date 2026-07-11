package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class SPz extends l3D {
    private EditText J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f59290O;
    private final View.OnClickListener Uo;

    @Override // com.google.android.material.textfield.l3D
    boolean qie() {
        return true;
    }

    public static /* synthetic */ void S(SPz sPz, View view) {
        EditText editText = sPz.J2;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (sPz.WPU()) {
            sPz.J2.setTransformationMethod(null);
        } else {
            sPz.J2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            sPz.J2.setSelection(selectionEnd);
        }
        sPz.r();
    }

    private boolean WPU() {
        EditText editText = this.J2;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean aYN(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.l3D
    View.OnClickListener J2() {
        return this.Uo;
    }

    @Override // com.google.android.material.textfield.l3D
    void XQ() {
        EditText editText = this.J2;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.l3D
    int nr() {
        return this.f59290O;
    }

    @Override // com.google.android.material.textfield.l3D
    void o() {
        if (aYN(this.J2)) {
            this.J2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.l3D
    int t() {
        return Rxk.aC.f8778g;
    }

    @Override // com.google.android.material.textfield.l3D
    void ty(EditText editText) {
        this.J2 = editText;
        r();
    }

    SPz(QJ qj, int i2) {
        super(qj);
        this.f59290O = Rxk.I28.f8733n;
        this.Uo = new View.OnClickListener() { // from class: com.google.android.material.textfield.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SPz.S(this.f59363n, view);
            }
        };
        if (i2 != 0) {
            this.f59290O = i2;
        }
    }

    @Override // com.google.android.material.textfield.l3D
    boolean az() {
        return !WPU();
    }

    @Override // com.google.android.material.textfield.l3D
    void rl(CharSequence charSequence, int i2, int i3, int i5) {
        r();
    }
}
