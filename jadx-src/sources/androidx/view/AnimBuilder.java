package androidx.view;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0014"}, d2 = {"Landroidx/navigation/AnimBuilder;", "", "<init>", "()V", "", c.f62177j, "I", "()I", "O", "(I)V", "enter", "rl", "J2", "exit", "t", "setPopEnter", "popEnter", "nr", "setPopExit", "popExit", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@NavOptionsDsl
public final class AnimBuilder {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int enter = -1;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int exit = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int popEnter = -1;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int popExit = -1;

    public final void J2(int i2) {
        this.exit = i2;
    }

    public final void O(int i2) {
        this.enter = i2;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getEnter() {
        return this.enter;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getPopExit() {
        return this.popExit;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getExit() {
        return this.exit;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getPopEnter() {
        return this.popEnter;
    }
}
