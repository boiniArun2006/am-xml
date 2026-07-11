package com.firebase.ui.auth.ui.phone;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ScaleXSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.firebase.ui.auth.R$styleable;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class SpacedEditText extends TextInputEditText {
    private SpannableStringBuilder mOriginalText;
    private float mProportion;

    private SpannableStringBuilder getSpacedOutString(CharSequence charSequence) {
        int i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = charSequence.length();
        int i3 = -1;
        int i5 = 0;
        while (true) {
            i2 = length - 1;
            if (i5 >= i2) {
                break;
            }
            spannableStringBuilder.append(charSequence.charAt(i5));
            spannableStringBuilder.append((CharSequence) " ");
            int i7 = i3 + 2;
            spannableStringBuilder.setSpan(new ScaleXSpan(this.mProportion), i7, i3 + 3, 33);
            i5++;
            i3 = i7;
        }
        if (length != 0) {
            spannableStringBuilder.append(charSequence.charAt(i2));
        }
        return spannableStringBuilder;
    }

    public Editable getUnspacedText() {
        return this.mOriginalText;
    }

    void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SpacedEditText);
        this.mProportion = typedArrayObtainStyledAttributes.getFloat(R$styleable.SpacedEditText_spacingProportion, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.EditText
    public void setSelection(int i2) {
        int iMin = Math.min(Math.max((i2 * 2) - 1, 0), (this.mOriginalText.length() * 2) - 1);
        try {
            super.setSelection(iMin);
        } catch (IndexOutOfBoundsException e2) {
            throw new IndexOutOfBoundsException(e2.getMessage() + ", requestedIndex=" + i2 + ", newIndex= " + iMin + ", originalText=" + ((Object) this.mOriginalText));
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.mOriginalText = new SpannableStringBuilder(charSequence);
        super.setText(getSpacedOutString(charSequence), TextView.BufferType.SPANNABLE);
    }

    public SpacedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOriginalText = new SpannableStringBuilder("");
        initAttrs(context, attributeSet);
    }
}
