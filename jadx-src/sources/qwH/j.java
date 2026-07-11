package qwH;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.internal.format.parser.ParseException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class j implements Pl {
    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object nr(stX.w6 w6Var);

    public abstract co4.Wre rl();

    public abstract stX.w6 t();

    private j() {
    }

    @Override // qwH.Pl
    public Object n(CharSequence input) {
        CharSequence charSequence;
        String str;
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            charSequence = input;
        } catch (ParseException e2) {
            e = e2;
            charSequence = input;
        }
        try {
            try {
                return nr(stX.C.t(stX.C.n(rl().rl()), charSequence, t(), 0, 4, null));
            } catch (IllegalArgumentException e3) {
                String message = e3.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + ((Object) charSequence) + "' is invalid";
                } else {
                    str = message + " (when parsing '" + ((Object) charSequence) + "')";
                }
                throw new DateTimeFormatException(str, e3);
            }
        } catch (ParseException e4) {
            e = e4;
            throw new DateTimeFormatException("Failed to parse value from '" + ((Object) charSequence) + '\'', e);
        }
    }
}
