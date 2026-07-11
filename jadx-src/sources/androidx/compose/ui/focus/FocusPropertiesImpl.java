package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusRequester;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001e\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\"\u0010!\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b \u0010\u0012R\"\u0010#\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\"\u0010\u0012R\"\u0010&\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R\"\u0010)\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b(\u0010\u0012R3\u00102\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0002\b-8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100\"\u0004\b'\u00101R3\u00105\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0002\b-8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010.\u001a\u0004\b3\u00100\"\u0004\b4\u00101¨\u00066"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesImpl;", "Landroidx/compose/ui/focus/FocusProperties;", "<init>", "()V", "", c.f62177j, "Z", "mUb", "()Z", "KN", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/FocusRequester;", "rl", "Landroidx/compose/ui/focus/FocusRequester;", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "next", "t", "gh", "setPrevious", "previous", "nr", "O", "setUp", "up", "Uo", "setDown", "down", "J2", "setLeft", TtmlNode.LEFT, "setRight", TtmlNode.RIGHT, "getStart", "setStart", TtmlNode.START, "xMQ", "setEnd", TtmlNode.END, "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "qie", "()Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "onEnter", "az", "ty", "onExit", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FocusPropertiesImpl implements FocusProperties {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private FocusRequester left;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private FocusRequester start;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private FocusRequester down;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private FocusRequester right;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private Function1 onExit;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private Function1 onEnter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean canFocus = true;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private FocusRequester up;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private FocusRequester next;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private FocusRequester previous;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private FocusRequester end;

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: J2, reason: from getter */
    public FocusRequester getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void KN(boolean z2) {
        this.canFocus = z2;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: O, reason: from getter */
    public FocusRequester getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: Uo, reason: from getter */
    public FocusRequester getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: az, reason: from getter */
    public Function1 getOnExit() {
        return this.onExit;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: gh, reason: from getter */
    public FocusRequester getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: mUb, reason: from getter */
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: nr, reason: from getter */
    public FocusRequester getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: qie, reason: from getter */
    public Function1 getOnEnter() {
        return this.onEnter;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: t, reason: from getter */
    public FocusRequester getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void ty(Function1 function1) {
        this.onExit = function1;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void xMQ(Function1 function1) {
        this.onEnter = function1;
    }

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        this.next = companion.rl();
        this.previous = companion.rl();
        this.up = companion.rl();
        this.down = companion.rl();
        this.left = companion.rl();
        this.right = companion.rl();
        this.start = companion.rl();
        this.end = companion.rl();
        this.onEnter = new Function1<FocusEnterExitScope, Unit>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onEnter$1
            public final void n(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FocusEnterExitScope focusEnterExitScope) {
                n(focusEnterExitScope);
                return Unit.INSTANCE;
            }
        };
        this.onExit = new Function1<FocusEnterExitScope, Unit>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onExit$1
            public final void n(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FocusEnterExitScope focusEnterExitScope) {
                n(focusEnterExitScope);
                return Unit.INSTANCE;
            }
        };
    }
}
