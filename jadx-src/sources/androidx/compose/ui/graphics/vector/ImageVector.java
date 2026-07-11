package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b#\b\u0007\u0018\u0000 -2\u00020\u0001:\u000234B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b'\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\r\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b%\u00102R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b+\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "root", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "", "autoMirror", "", "genId", "<init>", "(Ljava/lang/String;FFFFLandroidx/compose/ui/graphics/vector/VectorGroup;JIZILkotlin/jvm/internal/DefaultConstructorMarker;)V", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", c.f62177j, "Ljava/lang/String;", "KN", "()Ljava/lang/String;", "rl", "F", "J2", "()F", "t", "O", "nr", "az", "qie", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "xMQ", "()Landroidx/compose/ui/graphics/vector/VectorGroup;", "Uo", "J", "gh", "()J", "I", "mUb", "Z", "()Z", "Builder", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n*L\n1#1,705:1\n27#2:706\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector\n*L\n381#1:706\n*E\n"})
public final class ImageVector {
    private static final Object az;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int qie;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final VectorGroup root;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final int tintBlendMode;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float viewportHeight;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long tintColor;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final int genId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float viewportWidth;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float defaultWidth;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float defaultHeight;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final boolean autoMirror;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001PBO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0000¢\u0006\u0004\b%\u0010&J¤\u0001\u00108\u001a\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020!0 2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010,\u001a\u00020\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109J\r\u0010;\u001a\u00020:¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010=R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b8\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010?R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b;\u0010AR\u001a\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010BR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010CR$\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u00150Dj\b\u0012\u0004\u0012\u00020\u0015`E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010CR\u0014\u0010O\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "", "autoMirror", "<init>", "(Ljava/lang/String;FFFFJIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "KN", "()V", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "O", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;)Landroidx/compose/ui/graphics/vector/VectorGroup;", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", c.f62177j, "(Ljava/lang/String;FFFFFFFLjava/util/List;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "Uo", "()Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "t", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFF)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "J2", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "Ljava/lang/String;", "rl", "F", "nr", "J", "I", "Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "xMQ", "Ljava/util/ArrayList;", "nodes", "mUb", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "root", "gh", "isConsumed", "()Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "currentGroup", "GroupParams", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Builder\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,705:1\n56#2,5:706\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Builder\n*L\n337#1:706,5\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private final long tintColor;

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private final boolean autoMirror;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final float viewportHeight;

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private final int tintBlendMode;

        /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
        private boolean isConsumed;

        /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
        private GroupParams root;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final float viewportWidth;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final float defaultWidth;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final float defaultHeight;

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
        private final ArrayList nodes;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b!\b\u0002\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001b\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010,\u001a\u0004\b\u001a\u0010-\"\u0004\b.\u0010/R(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010,\u001a\u0004\b\u0014\u0010-\"\u0004\b0\u0010/¨\u00061"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/VectorNode;", "children", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", c.f62177j, "Ljava/lang/String;", "t", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "rl", "F", "J2", "()F", "setRotate", "(F)V", "nr", "setPivotX", "O", "setPivotY", "Uo", "setScaleX", "KN", "setScaleY", "xMQ", "setTranslationX", "mUb", "setTranslationY", "Ljava/util/List;", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "setChildren", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class GroupParams {

            /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
            private float scaleY;

            /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
            private float translationY;

            /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
            private float scaleX;

            /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
            private float translationX;

            /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
            private List children;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private String name;

            /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
            private float pivotY;

            /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
            private float rotate;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
            private float pivotX;

            /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
            private List clipPathData;

            public GroupParams(String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, List list, List list2) {
                this.name = str;
                this.rotate = f3;
                this.pivotX = f4;
                this.pivotY = f5;
                this.scaleX = f6;
                this.scaleY = f7;
                this.translationX = f8;
                this.translationY = f9;
                this.clipPathData = list;
                this.children = list2;
            }

            /* JADX INFO: renamed from: J2, reason: from getter */
            public final float getRotate() {
                return this.rotate;
            }

            /* JADX INFO: renamed from: KN, reason: from getter */
            public final float getScaleY() {
                return this.scaleY;
            }

            /* JADX INFO: renamed from: O, reason: from getter */
            public final float getPivotY() {
                return this.pivotY;
            }

            /* JADX INFO: renamed from: Uo, reason: from getter */
            public final float getScaleX() {
                return this.scaleX;
            }

            /* JADX INFO: renamed from: mUb, reason: from getter */
            public final float getTranslationY() {
                return this.translationY;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final List getChildren() {
                return this.children;
            }

            /* JADX INFO: renamed from: nr, reason: from getter */
            public final float getPivotX() {
                return this.pivotX;
            }

            /* JADX INFO: renamed from: rl, reason: from getter */
            public final List getClipPathData() {
                return this.clipPathData;
            }

            /* JADX INFO: renamed from: t, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: xMQ, reason: from getter */
            public final float getTranslationX() {
                return this.translationX;
            }

            public /* synthetic */ GroupParams(String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0f : f3, (i2 & 4) != 0 ? 0.0f : f4, (i2 & 8) != 0 ? 0.0f : f5, (i2 & 16) != 0 ? 1.0f : f6, (i2 & 32) != 0 ? 1.0f : f7, (i2 & 64) != 0 ? 0.0f : f8, (i2 & 128) != 0 ? 0.0f : f9, (i2 & 256) != 0 ? VectorKt.nr() : list, (i2 & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ Builder(String str, float f3, float f4, float f5, float f6, long j2, int i2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f3, f4, f5, f6, j2, i2, z2);
        }

        private Builder(String str, float f3, float f4, float f5, float f6, long j2, int i2, boolean z2) {
            this.name = str;
            this.defaultWidth = f3;
            this.defaultHeight = f4;
            this.viewportWidth = f5;
            this.viewportHeight = f6;
            this.tintColor = j2;
            this.tintBlendMode = i2;
            this.autoMirror = z2;
            ArrayList arrayList = new ArrayList();
            this.nodes = arrayList;
            GroupParams groupParams = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = groupParams;
            ImageVectorKt.J2(arrayList, groupParams);
        }

        private final void KN() {
            if (this.isConsumed) {
                InlineClassHelperKt.t("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final VectorGroup O(GroupParams groupParams) {
            return new VectorGroup(groupParams.getName(), groupParams.getRotate(), groupParams.getPivotX(), groupParams.getPivotY(), groupParams.getScaleX(), groupParams.getScaleY(), groupParams.getTranslationX(), groupParams.getTranslationY(), groupParams.getClipPathData(), groupParams.getChildren());
        }

        public static /* synthetic */ Builder rl(Builder builder, String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = "";
            }
            if ((i2 & 2) != 0) {
                f3 = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f4 = 0.0f;
            }
            if ((i2 & 8) != 0) {
                f5 = 0.0f;
            }
            if ((i2 & 16) != 0) {
                f6 = 1.0f;
            }
            if ((i2 & 32) != 0) {
                f7 = 1.0f;
            }
            if ((i2 & 64) != 0) {
                f8 = 0.0f;
            }
            if ((i2 & 128) != 0) {
                f9 = 0.0f;
            }
            if ((i2 & 256) != 0) {
                list = VectorKt.nr();
            }
            float f10 = f9;
            List list2 = list;
            float f11 = f8;
            float f12 = f6;
            return builder.n(str, f3, f4, f5, f12, f7, f11, f10, list2);
        }

        private final GroupParams xMQ() {
            return (GroupParams) ImageVectorKt.nr(this.nodes);
        }

        public final ImageVector J2() {
            KN();
            while (this.nodes.size() > 1) {
                Uo();
            }
            ImageVector imageVector = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, O(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, 0, 512, null);
            this.isConsumed = true;
            return imageVector;
        }

        public final Builder Uo() {
            KN();
            xMQ().getChildren().add(O((GroupParams) ImageVectorKt.O(this.nodes)));
            return this;
        }

        public final Builder n(String name, float rotate, float pivotX, float pivotY, float scaleX, float scaleY, float translationX, float translationY, List clipPathData) {
            KN();
            ImageVectorKt.J2(this.nodes, new GroupParams(name, rotate, pivotX, pivotY, scaleX, scaleY, translationX, translationY, clipPathData, null, 512, null));
            return this;
        }

        public final Builder t(List pathData, int pathFillType, String name, Brush fill, float fillAlpha, Brush stroke, float strokeAlpha, float strokeLineWidth, int strokeLineCap, int strokeLineJoin, float strokeLineMiter, float trimPathStart, float trimPathEnd, float trimPathOffset) {
            KN();
            xMQ().getChildren().add(new VectorPath(name, pathData, pathFillType, fill, fillAlpha, stroke, strokeAlpha, strokeLineWidth, strokeLineCap, strokeLineJoin, strokeLineMiter, trimPathStart, trimPathEnd, trimPathOffset, null));
            return this;
        }

        public /* synthetic */ Builder(String str, float f3, float f4, float f5, float f6, long j2, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, f3, f4, f5, f6, (i3 & 32) != 0 ? Color.INSTANCE.Uo() : j2, (i3 & 64) != 0 ? BlendMode.INSTANCE.nY() : i2, (i3 & 128) != 0 ? false : z2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "", "<init>", "()V", "", c.f62177j, "()I", "imageVectorCount", "I", "lock", "Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Companion\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n*L\n1#1,705:1\n32#2,2:706\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Companion\n*L\n384#1:706,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int n() {
            int i2;
            synchronized (ImageVector.az) {
                i2 = ImageVector.qie;
                ImageVector.qie = i2 + 1;
            }
            return i2;
        }
    }

    public /* synthetic */ ImageVector(String str, float f3, float f4, float f5, float f6, VectorGroup vectorGroup, long j2, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f3, f4, f5, f6, vectorGroup, j2, i2, z2, i3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) other;
        return Intrinsics.areEqual(this.name, imageVector.name) && Dp.mUb(this.defaultWidth, imageVector.defaultWidth) && Dp.mUb(this.defaultHeight, imageVector.defaultHeight) && this.viewportWidth == imageVector.viewportWidth && this.viewportHeight == imageVector.viewportHeight && Intrinsics.areEqual(this.root, imageVector.root) && Color.HI(this.tintColor, imageVector.tintColor) && BlendMode.e(this.tintBlendMode, imageVector.tintBlendMode) && this.autoMirror == imageVector.autoMirror;
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        az = companion;
    }

    private ImageVector(String str, float f3, float f4, float f5, float f6, VectorGroup vectorGroup, long j2, int i2, boolean z2, int i3) {
        this.name = str;
        this.defaultWidth = f3;
        this.defaultHeight = f4;
        this.viewportWidth = f5;
        this.viewportHeight = f6;
        this.root = vectorGroup;
        this.tintColor = j2;
        this.tintBlendMode = i2;
        this.autoMirror = z2;
        this.genId = i3;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final float getDefaultWidth() {
        return this.defaultWidth;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final float getDefaultHeight() {
        return this.defaultHeight;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final int getGenId() {
        return this.genId;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + Dp.gh(this.defaultWidth)) * 31) + Dp.gh(this.defaultHeight)) * 31) + Float.hashCode(this.viewportWidth)) * 31) + Float.hashCode(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + Color.XQ(this.tintColor)) * 31) + BlendMode.X(this.tintBlendMode)) * 31) + Boolean.hashCode(this.autoMirror);
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final int getTintBlendMode() {
        return this.tintBlendMode;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final VectorGroup getRoot() {
        return this.root;
    }

    public /* synthetic */ ImageVector(String str, float f3, float f4, float f5, float f6, VectorGroup vectorGroup, long j2, int i2, boolean z2, int i3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f3, f4, f5, f6, vectorGroup, j2, i2, z2, (i5 & 512) != 0 ? INSTANCE.n() : i3, null);
    }
}
