package androidx.view.serialization;

import DGv.Ml;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B'\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration;", "", "LDGv/Ml;", "serializersModule", "", "classDiscriminatorMode", "", "encodeDefaults", "<init>", "(LDGv/Ml;IZ)V", c.f62177j, "LDGv/Ml;", "t", "()LDGv/Ml;", "rl", "I", "()I", "Z", "()Z", "nr", "Builder", "Companion", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateConfiguration {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Ml serializersModule;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int classDiscriminatorMode;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean encodeDefaults;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final SavedStateConfiguration f41895O = new SavedStateConfiguration(null, 0, false, 7, null);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration$Builder;", "", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
    }

    private SavedStateConfiguration(Ml ml, int i2, boolean z2) {
        this.serializersModule = ml;
        this.classDiscriminatorMode = i2;
        this.encodeDefaults = z2;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Ml getSerializersModule() {
        return this.serializersModule;
    }

    /* synthetic */ SavedStateConfiguration(Ml ml, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? SavedStateConfigurationKt.f41898n : ml, (i3 & 2) != 0 ? 2 : i2, (i3 & 4) != 0 ? false : z2);
    }
}
