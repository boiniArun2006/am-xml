package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007*\n\u0010\t\"\u00020\b2\u00020\b¨\u0006\n"}, d2 = {"Landroid/content/ClipData;", "Landroidx/compose/ui/platform/ClipEntry;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/content/ClipData;)Landroidx/compose/ui/platform/ClipEntry;", "Landroid/content/ClipDescription;", "Landroidx/compose/ui/platform/ClipMetadata;", "rl", "(Landroid/content/ClipDescription;)Landroidx/compose/ui/platform/ClipMetadata;", "Landroid/content/ClipboardManager;", "NativeClipboard", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,599:1\n34#2,6:600\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n*L\n161#1:600,6\n*E\n"})
public final class AndroidClipboardManager_androidKt {
    public static final ClipEntry n(ClipData clipData) {
        return new ClipEntry(clipData);
    }

    public static final ClipMetadata rl(ClipDescription clipDescription) {
        return new ClipMetadata(clipDescription);
    }
}
