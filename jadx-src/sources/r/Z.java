package r;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.BackspaceCommand;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Z extends TextInputService {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Function1 f72683O;
    private Function1 nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextFieldValue f72684t;

    public static final class j implements PlatformTextInputService {
        @Override // androidx.compose.ui.text.input.PlatformTextInputService
        public void J2(TextFieldValue value, ImeOptions imeOptions, Function1 onEditCommand, Function1 onImeActionPerformed) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
            Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
            Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        }

        @Override // androidx.compose.ui.text.input.PlatformTextInputService
        public void KN(Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "rect");
        }

        @Override // androidx.compose.ui.text.input.PlatformTextInputService
        public void O() {
        }

        @Override // androidx.compose.ui.text.input.PlatformTextInputService
        public void nr(TextFieldValue textFieldValue, TextFieldValue newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
        }

        @Override // androidx.compose.ui.text.input.PlatformTextInputService
        public void rl() {
        }

        @Override // androidx.compose.ui.text.input.PlatformTextInputService
        public void t() {
        }

        j() {
        }
    }

    public Z() {
        super(new j());
        this.f72684t = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.nr = new Function1() { // from class: r.SPz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Z.az((List) obj);
            }
        };
        this.f72683O = new Function1() { // from class: r.ci
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Z.ty((ImeAction) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(ImeAction imeAction) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(ImeAction imeAction) {
        return Unit.INSTANCE;
    }

    public final void Ik(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.nr.invoke(CollectionsKt.listOf(new CommitTextCommand(text, text.length())));
    }

    @Override // androidx.compose.ui.text.input.TextInputService
    public void Uo(TextInputSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f72684t = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.nr = new Function1() { // from class: r.g9s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Z.HI((List) obj);
            }
        };
        this.f72683O = new Function1() { // from class: r.afx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Z.ck((ImeAction) obj);
            }
        };
        super.Uo(session);
    }

    @Override // androidx.compose.ui.text.input.TextInputService
    public TextInputSession nr(TextFieldValue value, ImeOptions imeOptions, Function1 onEditCommand, Function1 onImeActionPerformed) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
        Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        this.f72684t = value;
        this.nr = onEditCommand;
        this.f72683O = onImeActionPerformed;
        return super.nr(value, imeOptions, onEditCommand, onImeActionPerformed);
    }

    public final void qie() {
        this.nr.invoke(CollectionsKt.listOf(new BackspaceCommand()));
    }
}
