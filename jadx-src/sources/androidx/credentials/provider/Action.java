package androidx.credentials.provider;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.alightcreative.time.Kw.znsSxz;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00102\u00020\u0001:\u0003\u0011\u0012\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/credentials/provider/Action;", "", "", "title", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "subtitle", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;Ljava/lang/CharSequence;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Ljava/lang/CharSequence;", "t", "()Ljava/lang/CharSequence;", "rl", "Landroid/app/PendingIntent;", "()Landroid/app/PendingIntent;", "nr", "Api34Impl", "Builder", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Action.kt\nandroidx/credentials/provider/Action\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
public final class Action {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CharSequence title;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final PendingIntent pendingIntent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final CharSequence subtitle;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/Action$Builder;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Landroidx/credentials/provider/Action$Companion;", "", "<init>", "()V", "Landroidx/credentials/provider/Action;", FileUploadManager.f61572j, "Landroid/app/slice/Slice;", "rl", "(Landroidx/credentials/provider/Action;)Landroid/app/slice/Slice;", "slice", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/Action;", "", "SLICE_HINT_PENDING_INTENT", "Ljava/lang/String;", "SLICE_HINT_SUBTITLE", "SLICE_HINT_TITLE", "", "SLICE_SPEC_REVISION", "I", "SLICE_SPEC_TYPE", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Action.kt\nandroidx/credentials/provider/Action$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n1855#2,2:206\n*S KotlinDebug\n*F\n+ 1 Action.kt\nandroidx/credentials/provider/Action$Companion\n*L\n167#1:206,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Action n(Slice slice) {
            Intrinsics.checkNotNullParameter(slice, "slice");
            List items = slice.getItems();
            Intrinsics.checkNotNullExpressionValue(items, znsSxz.wMCnVvdKqVvRx);
            Iterator it = items.iterator();
            CharSequence text = "";
            PendingIntent action = null;
            CharSequence text2 = null;
            while (it.hasNext()) {
                SliceItem sliceItemN = Dsr.n(it.next());
                if (sliceItemN.hasHint("androidx.credentials.provider.action.HINT_ACTION_TITLE")) {
                    text = sliceItemN.getText();
                    Intrinsics.checkNotNullExpressionValue(text, "it.text");
                } else if (sliceItemN.hasHint("androidx.credentials.provider.action.HINT_ACTION_SUBTEXT")) {
                    text2 = sliceItemN.getText();
                } else if (sliceItemN.hasHint("androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT")) {
                    action = sliceItemN.getAction();
                }
            }
            try {
                Intrinsics.checkNotNull(action);
                return new Action(text, action, text2);
            } catch (Exception e2) {
                Log.i("Action", "fromSlice failed with: " + e2.getMessage());
                return null;
            }
        }

        public final Slice rl(Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            CharSequence title = action.getTitle();
            CharSequence subtitle = action.getSubtitle();
            PendingIntent pendingIntent = action.getPendingIntent();
            CN3.n();
            Slice.Builder builderAddText = I28.n(Uri.EMPTY, j.n("Action", 0)).addText(title, null, CollectionsKt.listOf("androidx.credentials.provider.action.HINT_ACTION_TITLE")).addText(subtitle, null, CollectionsKt.listOf("androidx.credentials.provider.action.HINT_ACTION_SUBTEXT"));
            builderAddText.addAction(pendingIntent, Wre.n(builderAddText).addHints(Collections.singletonList("androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT")).build(), null);
            Slice sliceBuild = builderAddText.build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "sliceBuilder.build()");
            return sliceBuild;
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/Action$Api34Impl;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api34Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api34Impl f37225n = new Api34Impl();

        private Api34Impl() {
        }
    }

    public Action(CharSequence title, PendingIntent pendingIntent, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.title = title;
        this.pendingIntent = pendingIntent;
        this.subtitle = charSequence;
        if (title.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }
}
