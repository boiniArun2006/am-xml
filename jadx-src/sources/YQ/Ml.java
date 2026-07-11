package YQ;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import com.skydoves.balloon.vectortext.VectorTextView;
import hz.C2163j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rH.UGc;
import rH.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Ml {
    private static final Spanned nr(String str) {
        return Html.fromHtml(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(TextView applyDrawable, C2163j vectorTextViewParams) {
        Drawable drawableRl;
        Drawable drawableRl2;
        Drawable drawableRl3;
        Intrinsics.checkNotNullParameter(applyDrawable, "$this$applyDrawable");
        Intrinsics.checkNotNullParameter(vectorTextViewParams, "vectorTextViewParams");
        Integer numQie = vectorTextViewParams.qie();
        Drawable drawableRl4 = null;
        if (numQie == null) {
            Integer numGh = vectorTextViewParams.gh();
            if (numGh != null) {
                int iIntValue = numGh.intValue();
                Context context = applyDrawable.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                numQie = Integer.valueOf(context.getResources().getDimensionPixelSize(iIntValue));
            } else {
                numQie = null;
            }
        }
        if (numQie == null) {
            Integer numTy = vectorTextViewParams.ty();
            if (numTy != null) {
                int iIntValue2 = numTy.intValue();
                Context context2 = applyDrawable.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                numQie = Integer.valueOf(context2.getResources().getDimensionPixelSize(iIntValue2));
            } else {
                numQie = null;
            }
        }
        Integer numAz = vectorTextViewParams.az();
        if (numAz == null) {
            Integer numCk = vectorTextViewParams.ck();
            if (numCk != null) {
                int iIntValue3 = numCk.intValue();
                Context context3 = applyDrawable.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "context");
                numAz = Integer.valueOf(context3.getResources().getDimensionPixelSize(iIntValue3));
            } else {
                numAz = null;
            }
        }
        if (numAz == null) {
            Integer numTy2 = vectorTextViewParams.ty();
            if (numTy2 != null) {
                int iIntValue4 = numTy2.intValue();
                Context context4 = applyDrawable.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "context");
                numAz = Integer.valueOf(context4.getResources().getDimensionPixelSize(iIntValue4));
            } else {
                numAz = null;
            }
        }
        Drawable drawableO = vectorTextViewParams.O();
        if (drawableO == null) {
            Integer numJ2 = vectorTextViewParams.J2();
            drawableO = numJ2 != null ? AppCompatResources.rl(applyDrawable.getContext(), numJ2.intValue()) : null;
        }
        if (drawableO != null) {
            Context context5 = applyDrawable.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "context");
            Drawable drawableN = n.n(drawableO, context5, numAz, numQie);
            drawableRl = drawableN != null ? n.rl(drawableN, vectorTextViewParams.HI()) : null;
        }
        Drawable drawableUo = vectorTextViewParams.Uo();
        if (drawableUo == null) {
            Integer numKN = vectorTextViewParams.KN();
            drawableUo = numKN != null ? AppCompatResources.rl(applyDrawable.getContext(), numKN.intValue()) : null;
        }
        if (drawableUo != null) {
            Context context6 = applyDrawable.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "context");
            Drawable drawableN2 = n.n(drawableUo, context6, numAz, numQie);
            drawableRl2 = drawableN2 != null ? n.rl(drawableN2, vectorTextViewParams.HI()) : null;
        }
        Drawable drawableT = vectorTextViewParams.t();
        if (drawableT == null) {
            Integer numNr = vectorTextViewParams.nr();
            drawableT = numNr != null ? AppCompatResources.rl(applyDrawable.getContext(), numNr.intValue()) : null;
        }
        if (drawableT != null) {
            Context context7 = applyDrawable.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "context");
            Drawable drawableN3 = n.n(drawableT, context7, numAz, numQie);
            drawableRl3 = drawableN3 != null ? n.rl(drawableN3, vectorTextViewParams.HI()) : null;
        }
        Drawable drawableXMQ = vectorTextViewParams.xMQ();
        if (drawableXMQ == null) {
            Integer numMUb = vectorTextViewParams.mUb();
            drawableXMQ = numMUb != null ? AppCompatResources.rl(applyDrawable.getContext(), numMUb.intValue()) : null;
        }
        if (drawableXMQ != null) {
            Context context8 = applyDrawable.getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "context");
            Drawable drawableN4 = n.n(drawableXMQ, context8, numAz, numQie);
            if (drawableN4 != null) {
                drawableRl4 = n.rl(drawableN4, vectorTextViewParams.HI());
            }
        }
        applyDrawable.setCompoundDrawablesWithIntrinsicBounds(drawableRl, drawableRl4, drawableRl2, drawableRl3);
        Integer numN = vectorTextViewParams.n();
        if (numN != null) {
            applyDrawable.setCompoundDrawablePadding(numN.intValue());
            return;
        }
        Integer numRl = vectorTextViewParams.rl();
        if (numRl != null) {
            int iIntValue5 = numRl.intValue();
            Context context9 = applyDrawable.getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "context");
            applyDrawable.setCompoundDrawablePadding(context9.getResources().getDimensionPixelSize(iIntValue5));
        }
    }

    public static final void rl(VectorTextView applyIconForm, aC iconForm) {
        Intrinsics.checkNotNullParameter(applyIconForm, "$this$applyIconForm");
        Intrinsics.checkNotNullParameter(iconForm, "iconForm");
        if (iconForm.n() != null) {
            Integer numValueOf = Integer.valueOf(iconForm.Uo());
            Integer numValueOf2 = Integer.valueOf(iconForm.O());
            Integer numValueOf3 = Integer.valueOf(iconForm.J2());
            Integer numValueOf4 = Integer.valueOf(iconForm.t());
            if (numValueOf4.intValue() == Integer.MIN_VALUE) {
                numValueOf4 = null;
            }
            C2163j c2163j = new C2163j(null, null, null, null, null, null, null, null, numValueOf3, numValueOf, numValueOf2, null, numValueOf4, null, null, null, 59647, null);
            int i2 = w6.$EnumSwitchMapping$0[iconForm.nr().ordinal()];
            if (i2 == 1) {
                c2163j.o(iconForm.n());
                c2163j.Z(iconForm.rl());
            } else if (i2 == 2) {
                c2163j.WPU(iconForm.n());
                c2163j.aYN(iconForm.rl());
            } else if (i2 == 3) {
                c2163j.Ik(iconForm.n());
                c2163j.r(iconForm.rl());
            } else if (i2 == 4) {
                c2163j.XQ(iconForm.n());
                c2163j.S(iconForm.rl());
            }
            Unit unit = Unit.INSTANCE;
            applyIconForm.setDrawableTextViewParams(c2163j);
        }
    }

    public static final void t(TextView applyTextForm, UGc textForm) {
        CharSequence charSequenceRl;
        Intrinsics.checkNotNullParameter(applyTextForm, "$this$applyTextForm");
        Intrinsics.checkNotNullParameter(textForm, "textForm");
        boolean zO = textForm.O();
        if (zO) {
            charSequenceRl = nr(textForm.rl().toString());
        } else {
            if (zO) {
                throw new NoWhenBranchMatchedException();
            }
            charSequenceRl = textForm.rl();
        }
        applyTextForm.setText(charSequenceRl);
        applyTextForm.setTextSize(textForm.J2());
        applyTextForm.setGravity(textForm.nr());
        applyTextForm.setTextColor(textForm.t());
        Typeface typefaceKN = textForm.KN();
        if (typefaceKN != null) {
            applyTextForm.setTypeface(typefaceKN);
        } else {
            applyTextForm.setTypeface(applyTextForm.getTypeface(), textForm.Uo());
        }
        MovementMethod movementMethodN = textForm.n();
        if (movementMethodN != null) {
            applyTextForm.setMovementMethod(movementMethodN);
        }
    }
}
