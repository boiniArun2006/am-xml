package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003R\u001c\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\t\u0010\u0006\u0012\u0004\b\n\u0010\u0003R\u001c\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\f\u0010\u0006\u0012\u0004\b\r\u0010\u0003R\u001c\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0010\u0010\u0003R\u001c\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u0012\u0004\b\u0013\u0010\u0003R\u001c\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u0012\u0004\b\u0016\u0010\u0003¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/ComposeUiFlags;", "", "<init>", "()V", "", "rl", "Z", "isRectTrackingEnabled$annotations", "isRectTrackingEnabled", "t", "getNewNestedScrollFlingDispatchingEnabled$annotations", "NewNestedScrollFlingDispatchingEnabled", "nr", "isSemanticAutofillEnabled$annotations", "isSemanticAutofillEnabled", "O", "isViewFocusFixEnabled$annotations", "isViewFocusFixEnabled", "J2", "isRemoveFocusedViewFixEnabled$annotations", "isRemoveFocusedViewFixEnabled", "Uo", "isTrackFocusEnabled$annotations", "isTrackFocusEnabled", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposeUiFlags {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public static boolean isRemoveFocusedViewFixEnabled;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public static boolean isViewFocusFixEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ComposeUiFlags f31050n = new ComposeUiFlags();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static boolean isRectTrackingEnabled = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static boolean NewNestedScrollFlingDispatchingEnabled = true;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public static boolean isSemanticAutofillEnabled = true;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    public static boolean isTrackFocusEnabled = true;
    public static final int KN = 8;

    private ComposeUiFlags() {
    }
}
