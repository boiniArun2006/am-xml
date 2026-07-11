package com.google.android.material.timepicker;

import Rxk.Wre;
import Rxk.fuX;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.Xo;
import com.google.android.material.internal.l3D;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {
    private TextWatcher J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final EditText f59378O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Chip f59379n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f59380r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TextInputLayout f59381t;

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private class n extends Xo {
        private n() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!TextUtils.isEmpty(editable)) {
                String strT = ChipTextInputComboView.this.t(editable);
                Chip chip = ChipTextInputComboView.this.f59379n;
                if (TextUtils.isEmpty(strT)) {
                    strT = ChipTextInputComboView.this.t("00");
                }
                chip.setText(strT);
                return;
            }
            ChipTextInputComboView.this.f59379n.setText(ChipTextInputComboView.this.t("00"));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(fuX.ck, (ViewGroup) this, false);
        this.f59379n = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(fuX.Ik, (ViewGroup) this, false);
        this.f59381t = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f59378O = editText;
        editText.setVisibility(4);
        n nVar = new n();
        this.J2 = nVar;
        editText.addTextChangedListener(nVar);
        nr();
        addView(chip);
        addView(textInputLayout);
        this.f59380r = (TextView) findViewById(Wre.ty);
        editText.setId(ViewCompat.gh());
        ViewCompat.Rl(this.f59380r, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f59379n.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        this.f59379n.setChecked(z2);
        this.f59378O.setVisibility(z2 ? 0 : 4);
        this.f59379n.setVisibility(z2 ? 8 : 0);
        if (isChecked()) {
            l3D.mUb(this.f59378O, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f59379n.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        this.f59379n.setTag(i2, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f59379n.toggle();
    }

    private void nr() {
        this.f59378O.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String t(CharSequence charSequence) {
        return TimeModel.n(getResources(), charSequence);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nr();
    }
}
