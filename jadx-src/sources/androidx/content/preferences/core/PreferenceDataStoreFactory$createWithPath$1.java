package androidx.content.preferences.core;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okio.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", c.f62177j, "()Ljava/io/File;"}, k = 3, mv = {1, 8, 0})
final class PreferenceDataStoreFactory$createWithPath$1 extends Lambda implements Function0<File> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function0 f37699n;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final File invoke() {
        return ((Path) this.f37699n.invoke()).toFile();
    }
}
