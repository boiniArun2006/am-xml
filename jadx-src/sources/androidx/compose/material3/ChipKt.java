package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aª\u0001\u0010\u0015\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a¨\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aª\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001a\u0010\u0016\u001a¨\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u0019\u001a²\u0001\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u001d2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a²\u0001\u0010!\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u001d2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b!\u0010 \u001aÉ\u0001\u0010#\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u001d2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b#\u0010$\u001a\u0093\u0001\u0010&\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b&\u0010'\u001a\u0091\u0001\u0010(\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b(\u0010)\u001a\u0093\u0001\u0010*\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b*\u0010'\u001a\u0091\u0001\u0010+\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b+\u0010)\u001a»\u0001\u00104\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aÐ\u0001\u00106\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010-\u001a\u00020,2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u001d2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a\u0094\u0001\u0010:\u001a\u00020\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0003ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a-\u0010?\u001a\u0002022\b\b\u0002\u0010<\u001a\u00020\u00072\b\b\u0002\u0010=\u001a\u00020\u00072\b\b\u0002\u0010>\u001a\u00020\u0007H\u0002¢\u0006\u0004\b?\u0010@\"\u0014\u0010B\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010A\"\u0014\u0010D\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010C\"\u0014\u0010E\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010C\"\u0014\u0010F\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010C\"\u0018\u0010J\u001a\u00020\r*\u00020G8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006K"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/runtime/Composable;", "label", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "leadingIcon", "trailingIcon", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/ChipColors;", "colors", "Landroidx/compose/material3/ChipElevation;", "elevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", c.f62177j, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/ChipBorder;", "rl", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "O", "J2", "selected", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/SelectableChipElevation;", "mUb", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Uo", "avatar", "gh", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "icon", "az", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ty", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "KN", "xMQ", "Landroidx/compose/ui/text/TextStyle;", "labelTextStyle", "Landroidx/compose/ui/graphics/Color;", "labelColor", "Landroidx/compose/ui/unit/Dp;", "minHeight", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "t", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "qie", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "leadingIconColor", "trailingIconColor", "nr", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "hasAvatar", "hasLeadingIcon", "hasTrailingIcon", "Z", "(ZZZ)Landroidx/compose/foundation/layout/PaddingValues;", "F", "HorizontalElementsPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "AssistChipPadding", "FilterChipPadding", "SuggestionChipPadding", "Landroidx/compose/material3/ColorScheme;", "o", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "defaultSuggestionChipColors", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1223#2,6:2788\n1223#2,6:2794\n1223#2,6:2800\n1223#2,6:2806\n1223#2,6:2812\n1223#2,6:2819\n148#3:2818\n148#3:2825\n148#3:2827\n148#3:2828\n148#3:2829\n1#4:2826\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n*L\n218#1:2788,6\n380#1:2794,6\n829#1:2800,6\n985#1:2806,6\n1966#1:2812,6\n2012#1:2819,6\n1973#1:2818\n2021#1:2825\n2767#1:2827\n2768#1:2828\n2773#1:2829\n*E\n"})
public final class ChipKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f24780n;
    private static final PaddingValues nr;
    private static final PaddingValues rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final PaddingValues f24781t;

    private static final PaddingValues Z(boolean z2, boolean z3, boolean z4) {
        return PaddingKt.O(Dp.KN((z2 || !z3) ? 4 : 8), 0.0f, Dp.KN(z4 ? 8 : 4), 0.0f, 10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void gh(final boolean z2, final Function0 function0, final Function2 function2, Modifier modifier, boolean z3, Function2 function22, Function2 function23, Function2 function24, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3, final int i5) {
        boolean z4;
        int i7;
        Function0 function02;
        int i8;
        int i9;
        boolean z5;
        int i10;
        final Function2 function25;
        int i11;
        final Function2 function26;
        int i12;
        Function2 function27;
        int i13;
        int i14;
        int i15;
        int i16;
        Shape shapeT;
        int i17;
        SelectableChipColors selectableChipColorsO;
        int i18;
        int i19;
        SelectableChipElevation selectableChipElevationJ2;
        int i20;
        BorderStroke borderStrokeNr;
        MutableInteractionSource mutableInteractionSource2;
        SelectableChipElevation selectableChipElevation2;
        BorderStroke borderStroke2;
        boolean z6;
        Function2 function28;
        Function2 function29;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        int i21;
        boolean z7;
        Composer composer2;
        final Modifier modifier2;
        final boolean z9;
        final Function2 function210;
        final Shape shape3;
        final SelectableChipColors selectableChipColors3;
        final SelectableChipElevation selectableChipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1658928131);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 6) == 0) {
                i7 = (composerKN.n(z4) ? 4 : 2) | i2;
            } else {
                i7 = i2;
            }
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i7 |= composerKN.E2(function2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i7 |= composerKN.p5(modifier) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                    if ((i2 & 24576) == 0) {
                        z5 = z3;
                        i7 |= composerKN.n(z5) ? 16384 : 8192;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i7 |= 196608;
                        function25 = function22;
                    } else {
                        function25 = function22;
                        if ((i2 & 196608) == 0) {
                            i7 |= composerKN.E2(function25) ? 131072 : 65536;
                        }
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                        i7 |= 1572864;
                        function26 = function23;
                    } else {
                        function26 = function23;
                        if ((i2 & 1572864) == 0) {
                            i7 |= composerKN.E2(function26) ? 1048576 : 524288;
                        }
                    }
                    i12 = i5 & 128;
                    if (i12 == 0) {
                        i7 |= 12582912;
                        function27 = function24;
                    } else {
                        function27 = function24;
                        if ((i2 & 12582912) == 0) {
                            i7 |= composerKN.E2(function27) ? 8388608 : 4194304;
                        }
                    }
                    if ((i2 & 100663296) == 0) {
                        i7 |= ((i5 & 256) == 0 && composerKN.p5(shape)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i7 |= ((i5 & 512) == 0 && composerKN.p5(selectableChipColors)) ? 536870912 : 268435456;
                    }
                    if ((i3 & 6) != 0) {
                        i13 = i3 | (((i5 & 1024) == 0 && composerKN.p5(selectableChipElevation)) ? 4 : 2);
                    } else {
                        i13 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i13 |= ((i5 & 2048) == 0 && composerKN.p5(borderStroke)) ? 32 : 16;
                    }
                    int i22 = i13;
                    i14 = i5 & 4096;
                    if (i14 == 0) {
                        i15 = i14;
                        i16 = i22 | RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else {
                        int i23 = i22;
                        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i23 |= composerKN.p5(mutableInteractionSource) ? 256 : 128;
                        }
                        i15 = i14;
                        i16 = i23;
                    }
                    int i24 = i7;
                    if ((i7 & 306783379) != 306783378 && (i16 & 147) == 146 && composerKN.xMQ()) {
                        composerKN.wTp();
                        selectableChipElevation3 = selectableChipElevation;
                        borderStroke3 = borderStroke;
                        mutableInteractionSource3 = mutableInteractionSource;
                        z9 = z5;
                        composer2 = composerKN;
                        function210 = function27;
                        modifier2 = modifier;
                        shape3 = shape;
                        selectableChipColors3 = selectableChipColors;
                    } else {
                        composerKN.e();
                        ComposableLambda composableLambdaNr = null;
                        int i25 = i16;
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier;
                            boolean z10 = i9 == 0 ? true : z5;
                            Function2 function211 = i10 == 0 ? null : function25;
                            Function2 function212 = i11 == 0 ? null : function26;
                            Function2 function213 = i12 == 0 ? null : function27;
                            if ((i5 & 256) == 0) {
                                i17 = i24 & (-234881025);
                                shapeT = InputChipDefaults.f26073n.t(composerKN, 6);
                            } else {
                                shapeT = shape;
                                i17 = i24;
                            }
                            if ((i5 & 512) == 0) {
                                i17 &= -1879048193;
                                selectableChipColorsO = InputChipDefaults.f26073n.O(composerKN, 6);
                            } else {
                                selectableChipColorsO = selectableChipColors;
                            }
                            int i26 = i17;
                            if ((i5 & 1024) == 0) {
                                modifier = modifier3;
                                i18 = 6;
                                i19 = i15;
                                selectableChipElevationJ2 = InputChipDefaults.f26073n.J2(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 1572864, 63);
                                i20 = i25 & (-15);
                            } else {
                                modifier = modifier3;
                                i18 = 6;
                                i19 = i15;
                                selectableChipElevationJ2 = selectableChipElevation;
                                i20 = i25;
                            }
                            boolean z11 = z10;
                            if ((i5 & 2048) == 0) {
                                borderStrokeNr = InputChipDefaults.f26073n.nr(z11, z4, 0L, 0L, 0L, 0L, 0.0f, 0.0f, composerKN, ((i26 >> 12) & 14) | 100663296 | ((i26 << 3) & 112), 252);
                                i20 &= -113;
                            } else {
                                borderStrokeNr = borderStroke;
                            }
                            if (i19 == 0) {
                                selectableChipElevation2 = selectableChipElevationJ2;
                                borderStroke2 = borderStrokeNr;
                                z6 = z11;
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                selectableChipElevation2 = selectableChipElevationJ2;
                                borderStroke2 = borderStrokeNr;
                                z6 = z11;
                            }
                            function28 = function211;
                            function26 = function212;
                            function29 = function213;
                            shape2 = shapeT;
                            selectableChipColors2 = selectableChipColorsO;
                            i21 = i26;
                        } else {
                            composerKN.wTp();
                            int i27 = (i5 & 256) != 0 ? i24 & (-234881025) : i24;
                            if ((i5 & 512) != 0) {
                                i27 &= -1879048193;
                            }
                            if ((i5 & 1024) != 0) {
                                i25 &= -15;
                            }
                            if ((i5 & 2048) != 0) {
                                i25 &= -113;
                            }
                            i21 = i27;
                            i18 = 6;
                            shape2 = shape;
                            selectableChipColors2 = selectableChipColors;
                            selectableChipElevation2 = selectableChipElevation;
                            borderStroke2 = borderStroke;
                            mutableInteractionSource2 = mutableInteractionSource;
                            z6 = z5;
                            function28 = function25;
                            function29 = function27;
                            i20 = i25;
                        }
                        Modifier modifier4 = modifier;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1658928131, i21, i20, "androidx.compose.material3.InputChip (Chip.kt:643)");
                        }
                        composerKN.eF(417920884);
                        if (function26 == null) {
                            final float f3 = z6 ? 1.0f : 0.38f;
                            final Shape shapeO = ShapesKt.O(InputChipTokens.f29662n.n(), composerKN, i18);
                            z7 = true;
                            composableLambdaNr = ComposableLambdaKt.nr(1154227507, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$InputChip$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i28) {
                                    if ((i28 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1154227507, i28, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:652)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    boolean zRl = composer3.rl(f3) | composer3.p5(shapeO);
                                    final float f4 = f3;
                                    final Shape shape4 = shapeO;
                                    Object objIF = composer3.iF();
                                    if (zRl || objIF == Composer.INSTANCE.n()) {
                                        objIF = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ChipKt$InputChip$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                n(graphicsLayerScope);
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(GraphicsLayerScope graphicsLayerScope) {
                                                graphicsLayerScope.rl(f4);
                                                graphicsLayerScope.pS(shape4);
                                                graphicsLayerScope.X(true);
                                            }
                                        };
                                        composer3.o(objIF);
                                    }
                                    Modifier modifierN = GraphicsLayerModifierKt.n(companion, (Function1) objIF);
                                    Alignment alignmentO = Alignment.INSTANCE.O();
                                    Function2 function214 = function26;
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion2.n();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer3.T();
                                    if (composer3.getInserting()) {
                                        composer3.s7N(function0N);
                                    } else {
                                        composer3.r();
                                    }
                                    Composer composerN = Updater.n(composer3);
                                    Updater.O(composerN, measurePolicyUo, companion2.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                    Function2 function2Rl = companion2.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion2.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    function214.invoke(composer3, 0);
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54);
                        } else {
                            z7 = true;
                        }
                        ComposableLambda composableLambda = composableLambdaNr;
                        composerKN.Xw();
                        TextStyle textStyleT = TypographyKt.t(InputChipTokens.f29662n.qie(), composerKN, i18);
                        int i28 = i21 << 3;
                        int i29 = (i21 & 14) | ((i21 >> 6) & 112) | (i28 & 896) | ((i21 >> 3) & 7168) | ((i21 << 6) & 57344) | (3670016 & i28) | (234881024 & i28) | (i28 & 1879048192);
                        int i30 = ((i21 >> 27) & 14) | 3072;
                        int i31 = i20 << 3;
                        qie(z2, modifier4, function02, z6, function2, textStyleT, function28, composableLambda, function29, shape2, selectableChipColors2, selectableChipElevation2, borderStroke2, InputChipDefaults.f26073n.rl(), Z(composableLambda == null ? z7 : false, function28 == null ? z7 : false, function29 != null ? z7 : false), mutableInteractionSource2, composerKN, i29, i30 | (i31 & 112) | (i31 & 896) | ((i20 << 9) & 458752));
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer2 = composerKN;
                        modifier2 = modifier4;
                        z9 = z6;
                        function25 = function28;
                        function210 = function29;
                        shape3 = shape2;
                        selectableChipColors3 = selectableChipColors2;
                        selectableChipElevation3 = selectableChipElevation2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$InputChip$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i32) {
                                ChipKt.gh(z2, function0, function2, modifier2, z9, function25, function26, function210, shape3, selectableChipColors3, selectableChipElevation3, borderStroke3, mutableInteractionSource3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= 24576;
                z5 = z3;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                if ((i3 & 6) != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i222 = i13;
                i14 = i5 & 4096;
                if (i14 == 0) {
                }
                int i242 = i7;
                if ((i7 & 306783379) != 306783378) {
                    composerKN.e();
                    ComposableLambda composableLambdaNr2 = null;
                    int i252 = i16;
                    if ((i2 & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if ((i5 & 256) == 0) {
                        }
                        if ((i5 & 512) == 0) {
                        }
                        int i262 = i17;
                        if ((i5 & 1024) == 0) {
                        }
                        boolean z112 = z10;
                        if ((i5 & 2048) == 0) {
                        }
                        if (i19 == 0) {
                        }
                        function28 = function211;
                        function26 = function212;
                        function29 = function213;
                        shape2 = shapeT;
                        selectableChipColors2 = selectableChipColorsO;
                        i21 = i262;
                        Modifier modifier42 = modifier;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        composerKN.eF(417920884);
                        if (function26 == null) {
                        }
                        ComposableLambda composableLambda2 = composableLambdaNr2;
                        composerKN.Xw();
                        TextStyle textStyleT2 = TypographyKt.t(InputChipTokens.f29662n.qie(), composerKN, i18);
                        int i282 = i21 << 3;
                        int i292 = (i21 & 14) | ((i21 >> 6) & 112) | (i282 & 896) | ((i21 >> 3) & 7168) | ((i21 << 6) & 57344) | (3670016 & i282) | (234881024 & i282) | (i282 & 1879048192);
                        int i302 = ((i21 >> 27) & 14) | 3072;
                        int i312 = i20 << 3;
                        qie(z2, modifier42, function02, z6, function2, textStyleT2, function28, composableLambda2, function29, shape2, selectableChipColors2, selectableChipElevation2, borderStroke2, InputChipDefaults.f26073n.rl(), Z(composableLambda2 == null ? z7 : false, function28 == null ? z7 : false, function29 != null ? z7 : false), mutableInteractionSource2, composerKN, i292, i302 | (i312 & 112) | (i312 & 896) | ((i20 << 9) & 458752));
                        if (ComposerKt.v()) {
                        }
                        composer2 = composerKN;
                        modifier2 = modifier42;
                        z9 = z6;
                        function25 = function28;
                        function210 = function29;
                        shape3 = shape2;
                        selectableChipColors3 = selectableChipColors2;
                        selectableChipElevation3 = selectableChipElevation2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            z5 = z3;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if ((i3 & 6) != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i2222 = i13;
            i14 = i5 & 4096;
            if (i14 == 0) {
            }
            int i2422 = i7;
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        z5 = z3;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((i3 & 6) != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i22222 = i13;
        i14 = i5 & 4096;
        if (i14 == 0) {
        }
        int i24222 = i7;
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(final boolean z2, final Modifier modifier, final Function0 function0, final boolean z3, final Function2 function2, final TextStyle textStyle, final Function2 function22, final Function2 function23, final Function2 function24, final Shape shape, final SelectableChipColors selectableChipColors, final SelectableChipElevation selectableChipElevation, final BorderStroke borderStroke, final float f3, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Composer composerKN = composer.KN(402951308);
        if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(modifier) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerKN.n(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerKN.E2(function2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= composerKN.p5(textStyle) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= composerKN.E2(function22) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= composerKN.E2(function23) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= composerKN.E2(function24) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i5 |= composerKN.p5(shape) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.p5(selectableChipColors) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= composerKN.p5(selectableChipElevation) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.p5(borderStroke) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i7 |= composerKN.rl(f3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= composerKN.p5(paddingValues) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i7 |= composerKN.p5(mutableInteractionSource) ? 131072 : 65536;
        }
        int i8 = i7;
        if ((i5 & 306783379) == 306783378 && (74899 & i8) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(402951308, i5, i8, "androidx.compose.material3.SelectableChip (Chip.kt:2009)");
            }
            composerKN.eF(2072749057);
            if (mutableInteractionSource == null) {
                Object objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = InteractionSourceKt.n();
                    composerKN.o(objIF);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objIF;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerKN.Xw();
            int i9 = i5;
            Modifier modifierNr = SemanticsModifierKt.nr(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    n(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.t());
                }
            }, 1, null);
            long jN = selectableChipColors.n(z3, z2);
            composerKN.eF(2072762384);
            State stateJ2 = selectableChipElevation != null ? selectableChipElevation.J2(z3, mutableInteractionSource2, composerKN, ((i9 >> 9) & 14) | ((i8 << 3) & 896)) : null;
            composerKN.Xw();
            composer2 = composerKN;
            SurfaceKt.rl(z2, function0, modifierNr, z3, shape, jN, 0L, 0.0f, stateJ2 != null ? ((Dp) stateJ2.getValue()).getValue() : Dp.KN(0), borderStroke, mutableInteractionSource2, ComposableLambdaKt.nr(-577614814, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i10) {
                    if ((i10 & 3) == 2 && composer3.xMQ()) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-577614814, i10, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:2024)");
                    }
                    ChipKt.nr(function2, textStyle, selectableChipColors.rl(z3, z2), function22, function23, function24, selectableChipColors.t(z3, z2), selectableChipColors.nr(z3, z2), f3, paddingValues, composer3, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composer2, 54), composer2, (i9 & 14) | ((i9 >> 3) & 112) | (i9 & 7168) | ((i9 >> 15) & 57344) | ((i8 << 21) & 1879048192), 48, 192);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i10) {
                    ChipKt.qie(z2, modifier, function0, z3, function2, textStyle, function22, function23, function24, shape, selectableChipColors, selectableChipElevation, borderStroke, f3, paddingValues, mutableInteractionSource, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final Modifier modifier, final Function0 function0, final boolean z2, final Function2 function2, final TextStyle textStyle, final long j2, final Function2 function22, final Function2 function23, final Shape shape, final ChipColors chipColors, final ChipElevation chipElevation, final BorderStroke borderStroke, final float f3, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i5;
        Function2 function24;
        int i7;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        Composer composerKN = composer.KN(1400504719);
        if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function0) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function24 = function2;
            i5 |= composerKN.E2(function24) ? 2048 : 1024;
        } else {
            function24 = function2;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerKN.p5(textStyle) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= composerKN.nr(j2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= composerKN.E2(function22) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= composerKN.E2(function23) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= composerKN.p5(shape) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i5 |= composerKN.p5(chipColors) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.p5(chipElevation) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= composerKN.p5(borderStroke) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.rl(f3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i7 |= composerKN.p5(paddingValues) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= composerKN.p5(mutableInteractionSource2) ? 16384 : 8192;
        }
        int i8 = i7;
        if ((i5 & 306783379) == 306783378 && (i8 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1400504719, i5, i8, "androidx.compose.material3.Chip (Chip.kt:1963)");
            }
            composerKN.eF(1985614987);
            if (mutableInteractionSource2 == null) {
                Object objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = InteractionSourceKt.n();
                    composerKN.o(objIF);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objIF;
            }
            composerKN.Xw();
            Modifier modifierNr = SemanticsModifierKt.nr(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    n(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                }
            }, 1, null);
            long jN = chipColors.n(z2);
            composerKN.eF(1985624506);
            State stateJ2 = chipElevation != null ? chipElevation.J2(z2, mutableInteractionSource2, composerKN, ((i5 >> 6) & 14) | ((i8 << 6) & 896)) : null;
            composerKN.Xw();
            composer2 = composerKN;
            int i9 = i5;
            final Function2 function25 = function24;
            SurfaceKt.nr(function0, modifierNr, z2, shape, jN, 0L, 0.0f, stateJ2 != null ? ((Dp) stateJ2.getValue()).getValue() : Dp.KN(0), borderStroke, mutableInteractionSource2, ComposableLambdaKt.nr(-1985962652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i10) {
                    if ((i10 & 3) == 2 && composer3.xMQ()) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1985962652, i10, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1976)");
                    }
                    ChipKt.nr(function25, textStyle, j2, function22, null, function23, chipColors.t(z2), chipColors.nr(z2), f3, paddingValues, composer3, 24576);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composer2, 54), composer2, ((i9 >> 15) & 7168) | ((i9 >> 3) & 14) | (i9 & 896) | ((i8 << 21) & 234881024), 6, 96);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i10) {
                    ChipKt.t(modifier, function0, z2, function2, textStyle, j2, function22, function23, shape, chipColors, chipElevation, borderStroke, f3, paddingValues, mutableInteractionSource, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
                }
            });
        }
    }

    static {
        float fKN = Dp.KN(8);
        f24780n = fKN;
        rl = PaddingKt.t(fKN, 0.0f, 2, null);
        f24781t = PaddingKt.t(fKN, 0.0f, 2, null);
        nr = PaddingKt.t(fKN, 0.0f, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void J2(final Function0 function0, final Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Function2 function24;
        Modifier modifier2;
        int i8;
        boolean z3;
        int i9;
        Function2 function25;
        int i10;
        ChipColors chipColorsO;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Shape shapeMUb;
        int i16;
        Modifier modifier3;
        int i17;
        int i18;
        ChipElevation chipElevationJ2;
        int i19;
        MutableInteractionSource mutableInteractionSource2;
        ChipElevation chipElevation2;
        ChipBorder chipBorder2;
        Function2 function26;
        Function2 function27;
        Shape shape2;
        Modifier modifier4;
        State stateN;
        final ChipBorder chipBorder3;
        Composer composer2;
        final Modifier modifier5;
        final boolean z4;
        final Function2 function28;
        final Function2 function29;
        final Shape shape3;
        final ChipColors chipColors2;
        final ChipElevation chipElevation3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1295844802);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function24) ? 32 : 16;
            }
        }
        int i20 = i5 & 4;
        if (i20 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i7 |= composerKN.n(z3) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function25 = function22;
                        i7 |= composerKN.E2(function25) ? 16384 : 8192;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i7 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i7 |= composerKN.E2(function23) ? 131072 : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i7 |= ((i5 & 64) == 0 && composerKN.p5(shape)) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) != 0) {
                        if ((i5 & 128) == 0) {
                            chipColorsO = chipColors;
                            int i21 = composerKN.p5(chipColorsO) ? 8388608 : 4194304;
                            i7 |= i21;
                        } else {
                            chipColorsO = chipColors;
                        }
                        i7 |= i21;
                    } else {
                        chipColorsO = chipColors;
                    }
                    if ((i2 & 100663296) == 0) {
                        i7 |= ((i5 & 256) == 0 && composerKN.p5(chipElevation)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    i11 = i5 & 512;
                    if (i11 != 0) {
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i12 = i11;
                            i7 |= composerKN.p5(chipBorder) ? 536870912 : 268435456;
                        }
                        i13 = i5 & 1024;
                        if (i13 != 0) {
                            i14 = i13;
                            i15 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i14 = i13;
                            i15 = i3 | (composerKN.p5(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i3;
                        }
                        int i22 = i7;
                        if ((i7 & 306783379) == 306783378 && (i15 & 3) == 2 && composerKN.xMQ()) {
                            composerKN.wTp();
                            function29 = function23;
                            chipElevation3 = chipElevation;
                            mutableInteractionSource3 = mutableInteractionSource;
                            z4 = z3;
                            composer2 = composerKN;
                            shape3 = shape;
                            chipColors2 = chipColorsO;
                            modifier5 = modifier2;
                            function28 = function25;
                            chipBorder3 = chipBorder;
                        } else {
                            composerKN.e();
                            int i23 = i15;
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier6 = i20 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z5 = i8 == 0 ? true : z3;
                                Function2 function210 = i9 == 0 ? null : function25;
                                Function2 function211 = i10 == 0 ? null : function23;
                                if ((i5 & 64) == 0) {
                                    i16 = i22 & (-3670017);
                                    shapeMUb = AssistChipDefaults.f24444n.mUb(composerKN, 6);
                                } else {
                                    shapeMUb = shape;
                                    i16 = i22;
                                }
                                if ((i5 & 128) != 0) {
                                    chipColorsO = AssistChipDefaults.f24444n.O(composerKN, 6);
                                    i16 &= -29360129;
                                }
                                ChipColors chipColors3 = chipColorsO;
                                int i24 = i16;
                                if ((i5 & 256) == 0) {
                                    modifier3 = modifier6;
                                    i18 = i23;
                                    i17 = 6;
                                    chipElevationJ2 = AssistChipDefaults.f24444n.J2(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 1572864, 63);
                                    i19 = i24 & (-234881025);
                                } else {
                                    modifier3 = modifier6;
                                    i17 = 6;
                                    i18 = i23;
                                    chipElevationJ2 = chipElevation;
                                    i19 = i24;
                                }
                                ChipBorder chipBorder4 = i12 == 0 ? null : chipBorder;
                                if (i14 == 0) {
                                    Object objIF = composerKN.iF();
                                    if (objIF == Composer.INSTANCE.n()) {
                                        objIF = InteractionSourceKt.n();
                                        composerKN.o(objIF);
                                    }
                                    chipElevation2 = chipElevationJ2;
                                    chipBorder2 = chipBorder4;
                                    mutableInteractionSource2 = (MutableInteractionSource) objIF;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    chipElevation2 = chipElevationJ2;
                                    chipBorder2 = chipBorder4;
                                }
                                z3 = z5;
                                function26 = function210;
                                chipColorsO = chipColors3;
                                function27 = function211;
                                shape2 = shapeMUb;
                                modifier4 = modifier3;
                            } else {
                                composerKN.wTp();
                                int i25 = (i5 & 64) != 0 ? i22 & (-3670017) : i22;
                                if ((i5 & 128) != 0) {
                                    i25 &= -29360129;
                                }
                                if ((i5 & 256) != 0) {
                                    i25 &= -234881025;
                                }
                                function27 = function23;
                                shape2 = shape;
                                chipElevation2 = chipElevation;
                                chipBorder2 = chipBorder;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i17 = 6;
                                modifier4 = modifier2;
                                function26 = function25;
                                i19 = i25;
                                i18 = i23;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1295844802, i19, i18, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:381)");
                            }
                            TextStyle textStyleT = TypographyKt.t(AssistChipTokens.f29393n.aYN(), composerKN, i17);
                            BorderStroke borderStroke = null;
                            long jRl = chipColorsO.rl(z3);
                            float fXMQ = AssistChipDefaults.f24444n.xMQ();
                            PaddingValues paddingValues = rl;
                            composerKN.eF(1552007127);
                            stateN = chipBorder2 != null ? null : chipBorder2.n(z3, composerKN, ((i19 >> 9) & 14) | ((i19 >> 24) & 112));
                            composerKN.Xw();
                            if (stateN != null) {
                                borderStroke = (BorderStroke) stateN.getValue();
                            }
                            int i26 = i19 << 6;
                            ChipColors chipColors4 = chipColorsO;
                            boolean z6 = z3;
                            t(modifier4, function0, z6, function24, textStyleT, jRl, function26, function27, shape2, chipColors4, chipElevation2, borderStroke, fXMQ, paddingValues, mutableInteractionSource2, composerKN, ((i19 >> 6) & 14) | ((i19 << 3) & 112) | ((i19 >> 3) & 896) | (i26 & 7168) | (3670016 & i26) | (29360128 & i26) | (234881024 & i26) | (i26 & 1879048192), ((i19 >> 24) & 14) | 3456 | ((i18 << 12) & 57344));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            chipBorder3 = chipBorder2;
                            composer2 = composerKN;
                            modifier5 = modifier4;
                            z4 = z6;
                            function28 = function26;
                            function29 = function27;
                            shape3 = shape2;
                            chipColors2 = chipColors4;
                            chipElevation3 = chipElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ElevatedAssistChip$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i27) {
                                    ChipKt.J2(function0, function2, modifier5, z4, function28, function29, shape3, chipColors2, chipElevation3, chipBorder3, mutableInteractionSource3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    i12 = i11;
                    i13 = i5 & 1024;
                    if (i13 != 0) {
                    }
                    int i222 = i7;
                    if ((i7 & 306783379) == 306783378) {
                        composerKN.e();
                        int i232 = i15;
                        if ((i2 & 1) != 0) {
                            if (i20 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if ((i5 & 64) == 0) {
                            }
                            if ((i5 & 128) != 0) {
                            }
                            ChipColors chipColors32 = chipColorsO;
                            int i242 = i16;
                            if ((i5 & 256) == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            z3 = z5;
                            function26 = function210;
                            chipColorsO = chipColors32;
                            function27 = function211;
                            shape2 = shapeMUb;
                            modifier4 = modifier3;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            TextStyle textStyleT2 = TypographyKt.t(AssistChipTokens.f29393n.aYN(), composerKN, i17);
                            BorderStroke borderStroke2 = null;
                            long jRl2 = chipColorsO.rl(z3);
                            float fXMQ2 = AssistChipDefaults.f24444n.xMQ();
                            PaddingValues paddingValues2 = rl;
                            composerKN.eF(1552007127);
                            if (chipBorder2 != null) {
                            }
                            composerKN.Xw();
                            if (stateN != null) {
                            }
                            int i262 = i19 << 6;
                            ChipColors chipColors42 = chipColorsO;
                            boolean z62 = z3;
                            t(modifier4, function0, z62, function24, textStyleT2, jRl2, function26, function27, shape2, chipColors42, chipElevation2, borderStroke2, fXMQ2, paddingValues2, mutableInteractionSource2, composerKN, ((i19 >> 6) & 14) | ((i19 << 3) & 112) | ((i19 >> 3) & 896) | (i262 & 7168) | (3670016 & i262) | (29360128 & i262) | (234881024 & i262) | (i262 & 1879048192), ((i19 >> 24) & 14) | 3456 | ((i18 << 12) & 57344));
                            if (ComposerKt.v()) {
                            }
                            chipBorder3 = chipBorder2;
                            composer2 = composerKN;
                            modifier5 = modifier4;
                            z4 = z62;
                            function28 = function26;
                            function29 = function27;
                            shape3 = shape2;
                            chipColors2 = chipColors42;
                            chipElevation3 = chipElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function25 = function22;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                i11 = i5 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i5 & 1024;
                if (i13 != 0) {
                }
                int i2222 = i7;
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            function25 = function22;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i11 = i5 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            int i22222 = i7;
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        z3 = z2;
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        function25 = function22;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i11 = i5 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        int i222222 = i7;
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final Function0 function0, final Function2 function2, Modifier modifier, boolean z2, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Function2 function23;
        final Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        Function2 function24;
        Shape shape2;
        ChipColors chipColors2;
        int i9;
        ChipElevation chipElevationRl;
        int i10;
        int i11;
        int i12;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        int i14;
        Shape shapeO;
        ChipColors chipColorsN;
        int i15;
        BorderStroke borderStroke2;
        int i16;
        MutableInteractionSource mutableInteractionSource3;
        Function2 function25;
        ChipElevation chipElevation2;
        boolean z4;
        Shape shape3;
        Composer composer2;
        final boolean z5;
        final Function2 function26;
        final Shape shape4;
        final ChipColors chipColors3;
        final ChipElevation chipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-818834969);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function23) ? 32 : 16;
            }
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function24 = function22;
                        i5 |= composerKN.E2(function24) ? 16384 : 8192;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            shape2 = shape;
                            int i18 = composerKN.p5(shape2) ? 131072 : 65536;
                            i5 |= i18;
                        } else {
                            shape2 = shape;
                        }
                        i5 |= i18;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i19 = composerKN.p5(chipColors2) ? 1048576 : 524288;
                            i5 |= i19;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i5 |= i19;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i2 & 12582912) != 0) {
                        i9 = 12582912;
                        if ((i3 & 128) == 0) {
                            chipElevationRl = chipElevation;
                            int i20 = composerKN.p5(chipElevationRl) ? 8388608 : 4194304;
                            i5 |= i20;
                        } else {
                            chipElevationRl = chipElevation;
                        }
                        i5 |= i20;
                    } else {
                        i9 = 12582912;
                        chipElevationRl = chipElevation;
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else {
                        if ((i2 & 100663296) == 0) {
                            i11 = i17;
                            i5 |= composerKN.p5(borderStroke) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 == 0) {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i13 = i12;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i5 |= composerKN.p5(mutableInteractionSource2) ? 536870912 : 268435456;
                            }
                            int i21 = i5;
                            if ((i5 & 306783379) == 306783378 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z6 = i7 == 0 ? true : z3;
                                    Function2 function27 = i8 == 0 ? null : function24;
                                    if ((i3 & 32) == 0) {
                                        i14 = i21 & (-458753);
                                        shapeO = SuggestionChipDefaults.f27932n.O(composerKN, 6);
                                    } else {
                                        i14 = i21;
                                        shapeO = shape2;
                                    }
                                    if ((i3 & 64) == 0) {
                                        i14 &= -3670017;
                                        chipColorsN = SuggestionChipDefaults.f27932n.n(composerKN, 6);
                                    } else {
                                        chipColorsN = chipColors2;
                                    }
                                    int i22 = i14;
                                    if ((i3 & 128) == 0) {
                                        i22 &= -29360129;
                                        i15 = 6;
                                        chipElevationRl = SuggestionChipDefaults.f27932n.rl(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 1572864, 63);
                                    } else {
                                        i15 = 6;
                                    }
                                    int i23 = i22;
                                    borderStroke2 = i10 == 0 ? null : borderStroke;
                                    i16 = i23;
                                    if (i13 == 0) {
                                        chipColors2 = chipColorsN;
                                        mutableInteractionSource3 = null;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        chipColors2 = chipColorsN;
                                    }
                                    function25 = function27;
                                    chipElevation2 = chipElevationRl;
                                    z4 = z6;
                                    shape3 = shapeO;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 32) != 0) {
                                        i21 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i21 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i21 &= -29360129;
                                    }
                                    borderStroke2 = borderStroke;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    function25 = function24;
                                    shape3 = shape2;
                                    chipElevation2 = chipElevationRl;
                                    i16 = i21;
                                    i15 = 6;
                                    z4 = z3;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-818834969, i16, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:903)");
                                }
                                int i24 = i16 << 6;
                                int i25 = ((i16 >> 6) & 14) | i9 | ((i16 << 3) & 112) | ((i16 >> 3) & 896) | (i24 & 7168) | (i24 & 3670016);
                                int i26 = i16 << 9;
                                int i27 = i25 | (234881024 & i26) | (i26 & 1879048192);
                                int i28 = i16 >> 21;
                                ChipColors chipColors4 = chipColors2;
                                Function2 function28 = function23;
                                Modifier modifier4 = modifier3;
                                t(modifier4, function02, z4, function28, TypographyKt.t(SuggestionChipTokens.f29910n.XQ(), composerKN, i15), chipColors2.rl(z4), function25, null, shape3, chipColors4, chipElevation2, borderStroke2, SuggestionChipDefaults.f27932n.nr(), nr, mutableInteractionSource3, composerKN, i27, (i28 & 112) | (i28 & 14) | 3456 | ((i16 >> 15) & 57344));
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                composer2 = composerKN;
                                modifier2 = modifier4;
                                z5 = z4;
                                function26 = function25;
                                shape4 = shape3;
                                chipColors3 = chipColors4;
                                chipElevation3 = chipElevation2;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            } else {
                                composerKN.wTp();
                                z5 = z3;
                                function26 = function24;
                                composer2 = composerKN;
                                shape4 = shape2;
                                chipColors3 = chipColors2;
                                chipElevation3 = chipElevationRl;
                                borderStroke3 = borderStroke;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ElevatedSuggestionChip$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i29) {
                                        ChipKt.KN(function0, function2, modifier2, z5, function26, shape4, chipColors3, chipElevation3, borderStroke3, mutableInteractionSource4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i13 = i12;
                        mutableInteractionSource2 = mutableInteractionSource;
                        int i212 = i5;
                        if ((i5 & 306783379) == 306783378) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i11 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if ((i3 & 32) == 0) {
                                }
                                if ((i3 & 64) == 0) {
                                }
                                int i222 = i14;
                                if ((i3 & 128) == 0) {
                                }
                                int i232 = i222;
                                borderStroke2 = i10 == 0 ? null : borderStroke;
                                i16 = i232;
                                if (i13 == 0) {
                                }
                                function25 = function27;
                                chipElevation2 = chipElevationRl;
                                z4 = z6;
                                shape3 = shapeO;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                int i242 = i16 << 6;
                                int i252 = ((i16 >> 6) & 14) | i9 | ((i16 << 3) & 112) | ((i16 >> 3) & 896) | (i242 & 7168) | (i242 & 3670016);
                                int i262 = i16 << 9;
                                int i272 = i252 | (234881024 & i262) | (i262 & 1879048192);
                                int i282 = i16 >> 21;
                                ChipColors chipColors42 = chipColors2;
                                Function2 function282 = function23;
                                Modifier modifier42 = modifier3;
                                t(modifier42, function02, z4, function282, TypographyKt.t(SuggestionChipTokens.f29910n.XQ(), composerKN, i15), chipColors2.rl(z4), function25, null, shape3, chipColors42, chipElevation2, borderStroke2, SuggestionChipDefaults.f27932n.nr(), nr, mutableInteractionSource3, composerKN, i272, (i282 & 112) | (i282 & 14) | 3456 | ((i16 >> 15) & 57344));
                                if (ComposerKt.v()) {
                                }
                                composer2 = composerKN;
                                modifier2 = modifier42;
                                z5 = z4;
                                function26 = function25;
                                shape4 = shape3;
                                chipColors3 = chipColors42;
                                chipElevation3 = chipElevation2;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i11 = i17;
                    i12 = i3 & 512;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    mutableInteractionSource2 = mutableInteractionSource;
                    int i2122 = i5;
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function24 = function22;
                if ((196608 & i2) != 0) {
                }
                if ((1572864 & i2) != 0) {
                }
                if ((i2 & 12582912) != 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i17;
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                mutableInteractionSource2 = mutableInteractionSource;
                int i21222 = i5;
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            function24 = function22;
            if ((196608 & i2) != 0) {
            }
            if ((1572864 & i2) != 0) {
            }
            if ((i2 & 12582912) != 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i17;
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            mutableInteractionSource2 = mutableInteractionSource;
            int i212222 = i5;
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z3 = z2;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        function24 = function22;
        if ((196608 & i2) != 0) {
        }
        if ((1572864 & i2) != 0) {
        }
        if ((i2 & 12582912) != 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i17;
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        mutableInteractionSource2 = mutableInteractionSource;
        int i2122222 = i5;
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final Function0 function0, final Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Function2 function24;
        Modifier modifier2;
        int i8;
        boolean z3;
        int i9;
        Function2 function25;
        int i10;
        ChipColors chipColorsO;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Shape shapeMUb;
        int i16;
        Modifier modifier3;
        int i17;
        int i18;
        ChipElevation chipElevationJ2;
        int i19;
        MutableInteractionSource mutableInteractionSource2;
        ChipElevation chipElevation2;
        BorderStroke borderStroke2;
        Function2 function26;
        Function2 function27;
        Modifier modifier4;
        Shape shape2;
        Composer composer2;
        final Modifier modifier5;
        final boolean z4;
        final Function2 function28;
        final Function2 function29;
        final Shape shape3;
        final ChipColors chipColors2;
        final ChipElevation chipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1594789934);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function24) ? 32 : 16;
            }
        }
        int i20 = i5 & 4;
        if (i20 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i7 |= composerKN.n(z3) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function25 = function22;
                        i7 |= composerKN.E2(function25) ? 16384 : 8192;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i7 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i7 |= composerKN.E2(function23) ? 131072 : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i7 |= ((i5 & 64) == 0 && composerKN.p5(shape)) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) != 0) {
                        if ((i5 & 128) == 0) {
                            chipColorsO = chipColors;
                            int i21 = composerKN.p5(chipColorsO) ? 8388608 : 4194304;
                            i7 |= i21;
                        } else {
                            chipColorsO = chipColors;
                        }
                        i7 |= i21;
                    } else {
                        chipColorsO = chipColors;
                    }
                    if ((i2 & 100663296) == 0) {
                        i7 |= ((i5 & 256) == 0 && composerKN.p5(chipElevation)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    i11 = i5 & 512;
                    if (i11 != 0) {
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i12 = i11;
                            i7 |= composerKN.p5(borderStroke) ? 536870912 : 268435456;
                        }
                        i13 = i5 & 1024;
                        if (i13 != 0) {
                            i14 = i13;
                            i15 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i14 = i13;
                            i15 = i3 | (composerKN.p5(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i3;
                        }
                        int i22 = i7;
                        if ((i7 & 306783379) == 306783378 && (i15 & 3) == 2 && composerKN.xMQ()) {
                            composerKN.wTp();
                            function29 = function23;
                            chipElevation3 = chipElevation;
                            mutableInteractionSource3 = mutableInteractionSource;
                            z4 = z3;
                            composer2 = composerKN;
                            shape3 = shape;
                            chipColors2 = chipColorsO;
                            modifier5 = modifier2;
                            function28 = function25;
                            borderStroke3 = borderStroke;
                        } else {
                            composerKN.e();
                            int i23 = i15;
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier6 = i20 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z5 = i8 == 0 ? true : z3;
                                Function2 function210 = i9 == 0 ? null : function25;
                                Function2 function211 = i10 == 0 ? null : function23;
                                if ((i5 & 64) == 0) {
                                    i16 = i22 & (-3670017);
                                    shapeMUb = AssistChipDefaults.f24444n.mUb(composerKN, 6);
                                } else {
                                    shapeMUb = shape;
                                    i16 = i22;
                                }
                                if ((i5 & 128) != 0) {
                                    chipColorsO = AssistChipDefaults.f24444n.O(composerKN, 6);
                                    i16 &= -29360129;
                                }
                                ChipColors chipColors3 = chipColorsO;
                                int i24 = i16;
                                if ((i5 & 256) == 0) {
                                    modifier3 = modifier6;
                                    i18 = i23;
                                    i17 = 6;
                                    chipElevationJ2 = AssistChipDefaults.f24444n.J2(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 1572864, 63);
                                    i19 = i24 & (-234881025);
                                } else {
                                    modifier3 = modifier6;
                                    i17 = 6;
                                    i18 = i23;
                                    chipElevationJ2 = chipElevation;
                                    i19 = i24;
                                }
                                BorderStroke borderStroke4 = i12 == 0 ? null : borderStroke;
                                if (i14 == 0) {
                                    chipElevation2 = chipElevationJ2;
                                    borderStroke2 = borderStroke4;
                                    z3 = z5;
                                    mutableInteractionSource2 = null;
                                    function27 = function210;
                                    chipColorsO = chipColors3;
                                    function26 = function211;
                                    shape2 = shapeMUb;
                                    modifier4 = modifier3;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    chipElevation2 = chipElevationJ2;
                                    borderStroke2 = borderStroke4;
                                    function26 = function211;
                                    z3 = z5;
                                    function27 = function210;
                                    chipColorsO = chipColors3;
                                    modifier4 = modifier3;
                                    shape2 = shapeMUb;
                                }
                            } else {
                                composerKN.wTp();
                                int i25 = (i5 & 64) != 0 ? i22 & (-3670017) : i22;
                                if ((i5 & 128) != 0) {
                                    i25 &= -29360129;
                                }
                                if ((i5 & 256) != 0) {
                                    i25 &= -234881025;
                                }
                                function26 = function23;
                                shape2 = shape;
                                chipElevation2 = chipElevation;
                                borderStroke2 = borderStroke;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i17 = 6;
                                modifier4 = modifier2;
                                function27 = function25;
                                i19 = i25;
                                i18 = i23;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1594789934, i19, i18, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:295)");
                            }
                            int i26 = i19 << 6;
                            int i27 = i19 >> 24;
                            ChipColors chipColors4 = chipColorsO;
                            boolean z6 = z3;
                            t(modifier4, function0, z6, function24, TypographyKt.t(AssistChipTokens.f29393n.aYN(), composerKN, i17), chipColorsO.rl(z3), function27, function26, shape2, chipColors4, chipElevation2, borderStroke2, AssistChipDefaults.f24444n.xMQ(), rl, mutableInteractionSource2, composerKN, ((i19 >> 6) & 14) | ((i19 << 3) & 112) | ((i19 >> 3) & 896) | (i26 & 7168) | (3670016 & i26) | (29360128 & i26) | (234881024 & i26) | (i26 & 1879048192), (i27 & 112) | (i27 & 14) | 3456 | ((i18 << 12) & 57344));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            composer2 = composerKN;
                            modifier5 = modifier4;
                            z4 = z6;
                            function28 = function27;
                            function29 = function26;
                            shape3 = shape2;
                            chipColors2 = chipColors4;
                            chipElevation3 = chipElevation2;
                            borderStroke3 = borderStroke2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ElevatedAssistChip$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i28) {
                                    ChipKt.O(function0, function2, modifier5, z4, function28, function29, shape3, chipColors2, chipElevation3, borderStroke3, mutableInteractionSource3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    i12 = i11;
                    i13 = i5 & 1024;
                    if (i13 != 0) {
                    }
                    int i222 = i7;
                    if ((i7 & 306783379) == 306783378) {
                        composerKN.e();
                        int i232 = i15;
                        if ((i2 & 1) != 0) {
                            if (i20 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if ((i5 & 64) == 0) {
                            }
                            if ((i5 & 128) != 0) {
                            }
                            ChipColors chipColors32 = chipColorsO;
                            int i242 = i16;
                            if ((i5 & 256) == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i262 = i19 << 6;
                            int i272 = i19 >> 24;
                            ChipColors chipColors42 = chipColorsO;
                            boolean z62 = z3;
                            t(modifier4, function0, z62, function24, TypographyKt.t(AssistChipTokens.f29393n.aYN(), composerKN, i17), chipColorsO.rl(z3), function27, function26, shape2, chipColors42, chipElevation2, borderStroke2, AssistChipDefaults.f24444n.xMQ(), rl, mutableInteractionSource2, composerKN, ((i19 >> 6) & 14) | ((i19 << 3) & 112) | ((i19 >> 3) & 896) | (i262 & 7168) | (3670016 & i262) | (29360128 & i262) | (234881024 & i262) | (i262 & 1879048192), (i272 & 112) | (i272 & 14) | 3456 | ((i18 << 12) & 57344));
                            if (ComposerKt.v()) {
                            }
                            composer2 = composerKN;
                            modifier5 = modifier4;
                            z4 = z62;
                            function28 = function27;
                            function29 = function26;
                            shape3 = shape2;
                            chipColors2 = chipColors42;
                            chipElevation3 = chipElevation2;
                            borderStroke3 = borderStroke2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function25 = function22;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                i11 = i5 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i5 & 1024;
                if (i13 != 0) {
                }
                int i2222 = i7;
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            function25 = function22;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i11 = i5 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            int i22222 = i7;
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        z3 = z2;
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        function25 = function22;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i11 = i5 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        int i222222 = i7;
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(final boolean z2, final Function0 function0, final Function2 function2, Modifier modifier, boolean z3, Function2 function22, Function2 function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Function0 function02;
        Function2 function24;
        Modifier modifier2;
        int i8;
        boolean z4;
        int i9;
        int i10;
        Function2 function25;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Shape shapeXMQ;
        SelectableChipColors selectableChipColorsN;
        Modifier modifier3;
        int i17;
        int i18;
        SelectableChipElevation selectableChipElevationRl;
        int i19;
        MutableInteractionSource mutableInteractionSource2;
        SelectableChipElevation selectableChipElevation2;
        BorderStroke borderStroke2;
        Function2 function26;
        Function2 function27;
        Shape shape3;
        int i20;
        boolean z5;
        int i21;
        Modifier modifier4;
        Composer composer2;
        final Modifier modifier5;
        final boolean z6;
        final Function2 function28;
        final Function2 function29;
        final Shape shape4;
        final SelectableChipColors selectableChipColors3;
        final SelectableChipElevation selectableChipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-106647389);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i7 |= composerKN.E2(function24) ? 256 : 128;
            }
        }
        int i22 = i5 & 8;
        if (i22 != 0) {
            i7 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            i8 = i5 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    z4 = z3;
                    i7 |= composerKN.n(z4) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i7 |= composerKN.E2(function22) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                    function25 = function23;
                } else {
                    function25 = function23;
                    if ((i2 & 1572864) == 0) {
                        i7 |= composerKN.E2(function25) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i5 & 128) == 0) {
                        shape2 = shape;
                        int i23 = composerKN.p5(shape2) ? 8388608 : 4194304;
                        i7 |= i23;
                    } else {
                        shape2 = shape;
                    }
                    i7 |= i23;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i5 & 256) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        int i24 = composerKN.p5(selectableChipColors2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        i7 |= i24;
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i7 |= i24;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i7 |= ((i5 & 512) == 0 && composerKN.p5(selectableChipElevation)) ? 536870912 : 268435456;
                }
                i11 = i5 & 1024;
                if (i11 != 0) {
                    i13 = i3 | 6;
                    i12 = i11;
                } else if ((i3 & 6) == 0) {
                    i12 = i11;
                    i13 = i3 | (composerKN.p5(borderStroke) ? 4 : 2);
                } else {
                    i12 = i11;
                    i13 = i3;
                }
                i14 = i5 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                    i15 = i14;
                } else if ((i3 & 48) == 0) {
                    i15 = i14;
                    i13 |= composerKN.p5(mutableInteractionSource) ? 32 : 16;
                } else {
                    i15 = i14;
                }
                int i25 = i13;
                int i26 = i7;
                if ((i7 & 306783379) == 306783378 && (i25 & 19) == 18 && composerKN.xMQ()) {
                    composerKN.wTp();
                    borderStroke3 = borderStroke;
                    mutableInteractionSource3 = mutableInteractionSource;
                    selectableChipColors3 = selectableChipColors2;
                    modifier5 = modifier2;
                    composer2 = composerKN;
                    function28 = function22;
                    function29 = function25;
                    shape4 = shape2;
                    z6 = z4;
                    selectableChipElevation3 = selectableChipElevation;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        Modifier modifier6 = i22 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z7 = i8 == 0 ? true : z4;
                        Function2 function210 = i9 == 0 ? null : function22;
                        Function2 function211 = i10 == 0 ? null : function25;
                        if ((i5 & 128) == 0) {
                            i16 = i26 & (-29360129);
                            shapeXMQ = FilterChipDefaults.f25881n.xMQ(composerKN, 6);
                        } else {
                            i16 = i26;
                            shapeXMQ = shape2;
                        }
                        if ((i5 & 256) == 0) {
                            i16 &= -234881025;
                            selectableChipColorsN = FilterChipDefaults.f25881n.n(composerKN, 6);
                        } else {
                            selectableChipColorsN = selectableChipColors2;
                        }
                        int i27 = i16;
                        if ((i5 & 512) == 0) {
                            modifier3 = modifier6;
                            i18 = i25;
                            i17 = 6;
                            selectableChipElevationRl = FilterChipDefaults.f25881n.rl(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 1572864, 63);
                            i19 = i27 & (-1879048193);
                        } else {
                            modifier3 = modifier6;
                            i17 = 6;
                            i18 = i25;
                            selectableChipElevationRl = selectableChipElevation;
                            i19 = i27;
                        }
                        BorderStroke borderStroke4 = i12 == 0 ? null : borderStroke;
                        if (i15 == 0) {
                            selectableChipElevation2 = selectableChipElevationRl;
                            borderStroke2 = borderStroke4;
                            function26 = function210;
                            function27 = function211;
                            i20 = 12582912;
                            z5 = z7;
                            mutableInteractionSource2 = null;
                            i21 = -106647389;
                            modifier4 = modifier3;
                            shape3 = shapeXMQ;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            selectableChipElevation2 = selectableChipElevationRl;
                            borderStroke2 = borderStroke4;
                            function26 = function210;
                            function27 = function211;
                            shape3 = shapeXMQ;
                            i20 = 12582912;
                            z5 = z7;
                            i21 = -106647389;
                            modifier4 = modifier3;
                        }
                    } else {
                        composerKN.wTp();
                        int i28 = (i5 & 128) != 0 ? i26 & (-29360129) : i26;
                        if ((i5 & 256) != 0) {
                            i28 &= -234881025;
                        }
                        if ((i5 & 512) != 0) {
                            i28 &= -1879048193;
                        }
                        function26 = function22;
                        selectableChipElevation2 = selectableChipElevation;
                        borderStroke2 = borderStroke;
                        mutableInteractionSource2 = mutableInteractionSource;
                        i17 = 6;
                        function27 = function25;
                        shape3 = shape2;
                        selectableChipColorsN = selectableChipColors2;
                        modifier4 = modifier2;
                        i20 = 12582912;
                        i21 = -106647389;
                        i19 = i28;
                        z5 = z4;
                        i18 = i25;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(i21, i19, i18, "androidx.compose.material3.ElevatedFilterChip (Chip.kt:552)");
                    }
                    int i29 = (i19 & 14) | i20 | ((i19 >> 6) & 112);
                    int i30 = i19 << 3;
                    int i31 = i19 << 6;
                    int i32 = i29 | (i30 & 896) | ((i19 >> 3) & 7168) | (57344 & i31) | (i30 & 3670016) | (234881024 & i31) | (1879048192 & i31);
                    int i33 = i19 >> 24;
                    qie(z2, modifier4, function02, z5, function24, TypographyKt.t(FilterChipTokens.f29642n.fD(), composerKN, i17), function26, null, function27, shape3, selectableChipColorsN, selectableChipElevation2, borderStroke2, FilterChipDefaults.f25881n.KN(), f24781t, mutableInteractionSource2, composerKN, i32, (i33 & 112) | (i33 & 14) | 27648 | ((i18 << 6) & 896) | ((i18 << 12) & 458752));
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer2 = composerKN;
                    modifier5 = modifier4;
                    z6 = z5;
                    function28 = function26;
                    function29 = function27;
                    shape4 = shape3;
                    selectableChipColors3 = selectableChipColorsN;
                    selectableChipElevation3 = selectableChipElevation2;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ElevatedFilterChip$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i34) {
                            ChipKt.Uo(z2, function0, function2, modifier5, z6, function28, function29, shape4, selectableChipColors3, selectableChipElevation3, borderStroke3, mutableInteractionSource3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 24576;
            z4 = z3;
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            i11 = i5 & 1024;
            if (i11 != 0) {
            }
            i14 = i5 & 2048;
            if (i14 != 0) {
            }
            int i252 = i13;
            int i262 = i7;
            if ((i7 & 306783379) == 306783378) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i22 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i5 & 128) == 0) {
                    }
                    if ((i5 & 256) == 0) {
                    }
                    int i272 = i16;
                    if ((i5 & 512) == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    int i292 = (i19 & 14) | i20 | ((i19 >> 6) & 112);
                    int i302 = i19 << 3;
                    int i312 = i19 << 6;
                    int i322 = i292 | (i302 & 896) | ((i19 >> 3) & 7168) | (57344 & i312) | (i302 & 3670016) | (234881024 & i312) | (1879048192 & i312);
                    int i332 = i19 >> 24;
                    qie(z2, modifier4, function02, z5, function24, TypographyKt.t(FilterChipTokens.f29642n.fD(), composerKN, i17), function26, null, function27, shape3, selectableChipColorsN, selectableChipElevation2, borderStroke2, FilterChipDefaults.f25881n.KN(), f24781t, mutableInteractionSource2, composerKN, i322, (i332 & 112) | (i332 & 14) | 27648 | ((i18 << 6) & 896) | ((i18 << 12) & 458752));
                    if (ComposerKt.v()) {
                    }
                    composer2 = composerKN;
                    modifier5 = modifier4;
                    z6 = z5;
                    function28 = function26;
                    function29 = function27;
                    shape4 = shape3;
                    selectableChipColors3 = selectableChipColorsN;
                    selectableChipElevation3 = selectableChipElevation2;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        z4 = z3;
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        i11 = i5 & 1024;
        if (i11 != 0) {
        }
        i14 = i5 & 2048;
        if (i14 != 0) {
        }
        int i2522 = i13;
        int i2622 = i7;
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void az(final Function0 function0, final Function2 function2, Modifier modifier, boolean z2, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Function2 function23;
        final Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        Function2 function24;
        Shape shape2;
        ChipColors chipColors2;
        int i9;
        ChipElevation chipElevationXMQ;
        int i10;
        int i11;
        MutableInteractionSource mutableInteractionSource2;
        int i12;
        Shape shapeO;
        ChipColors chipColorsKN;
        int i13;
        Modifier modifier3;
        int i14;
        boolean z4;
        BorderStroke borderStrokeUo;
        int i15;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke2;
        int i16;
        Function2 function25;
        ChipElevation chipElevation2;
        Shape shape3;
        boolean z5;
        Composer composer2;
        final boolean z6;
        final Function2 function26;
        final Shape shape4;
        final ChipColors chipColors3;
        final ChipElevation chipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1700130831);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function23) ? 32 : 16;
            }
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function24 = function22;
                        i5 |= composerKN.E2(function24) ? 16384 : 8192;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            shape2 = shape;
                            int i18 = composerKN.p5(shape2) ? 131072 : 65536;
                            i5 |= i18;
                        } else {
                            shape2 = shape;
                        }
                        i5 |= i18;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i19 = composerKN.p5(chipColors2) ? 1048576 : 524288;
                            i5 |= i19;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i5 |= i19;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i2 & 12582912) != 0) {
                        i9 = 12582912;
                        if ((i3 & 128) == 0) {
                            chipElevationXMQ = chipElevation;
                            int i20 = composerKN.p5(chipElevationXMQ) ? 8388608 : 4194304;
                            i5 |= i20;
                        } else {
                            chipElevationXMQ = chipElevation;
                        }
                        i5 |= i20;
                    } else {
                        i9 = 12582912;
                        chipElevationXMQ = chipElevation;
                    }
                    if ((i2 & 100663296) == 0) {
                        i5 |= ((i3 & 256) == 0 && composerKN.p5(borderStroke)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i11 = i10;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i5 |= composerKN.p5(mutableInteractionSource2) ? 536870912 : 268435456;
                        }
                        int i21 = i5;
                        if ((i5 & 306783379) == 306783378 && composerKN.xMQ()) {
                            composerKN.wTp();
                            z6 = z3;
                            function26 = function24;
                            composer2 = composerKN;
                            shape4 = shape2;
                            chipColors3 = chipColors2;
                            chipElevation3 = chipElevationXMQ;
                            borderStroke3 = borderStroke;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier4 = i17 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z7 = i7 == 0 ? true : z3;
                                Function2 function27 = i8 == 0 ? null : function24;
                                if ((i3 & 32) == 0) {
                                    i12 = i21 & (-458753);
                                    shapeO = SuggestionChipDefaults.f27932n.O(composerKN, 6);
                                } else {
                                    i12 = i21;
                                    shapeO = shape2;
                                }
                                if ((i3 & 64) == 0) {
                                    i12 &= -3670017;
                                    chipColorsKN = SuggestionChipDefaults.f27932n.KN(composerKN, 6);
                                } else {
                                    chipColorsKN = chipColors2;
                                }
                                int i22 = i12;
                                if ((i3 & 128) == 0) {
                                    i22 &= -29360129;
                                    i13 = 6;
                                    chipElevationXMQ = SuggestionChipDefaults.f27932n.xMQ(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 1572864, 63);
                                } else {
                                    i13 = 6;
                                }
                                if ((i3 & 256) == 0) {
                                    modifier3 = modifier4;
                                    i14 = i13;
                                    z4 = z7;
                                    borderStrokeUo = SuggestionChipDefaults.f27932n.Uo(z4, 0L, 0L, 0.0f, composerKN, ((i22 >> 9) & 14) | 24576, 14);
                                    i15 = i22 & (-234881025);
                                } else {
                                    modifier3 = modifier4;
                                    i14 = i13;
                                    z4 = z7;
                                    borderStrokeUo = borderStroke;
                                    i15 = i22;
                                }
                                if (i11 == 0) {
                                    borderStroke2 = borderStrokeUo;
                                    i16 = i15;
                                    chipColors2 = chipColorsKN;
                                    mutableInteractionSource3 = null;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    borderStroke2 = borderStrokeUo;
                                    i16 = i15;
                                    chipColors2 = chipColorsKN;
                                }
                                function25 = function27;
                                modifier2 = modifier3;
                                chipElevation2 = chipElevationXMQ;
                                shape3 = shapeO;
                                z5 = z4;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 32) != 0) {
                                    i21 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    i21 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i21 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i21 &= -234881025;
                                }
                                borderStroke2 = borderStroke;
                                mutableInteractionSource3 = mutableInteractionSource;
                                i14 = 6;
                                function25 = function24;
                                shape3 = shape2;
                                chipElevation2 = chipElevationXMQ;
                                i16 = i21;
                                z5 = z3;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1700130831, i16, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:746)");
                            }
                            int i23 = i16 << 6;
                            int i24 = ((i16 >> 6) & 14) | i9 | ((i16 << 3) & 112) | ((i16 >> 3) & 896) | (i23 & 7168) | (i23 & 3670016);
                            int i25 = i16 << 9;
                            int i26 = i24 | (234881024 & i25) | (i25 & 1879048192);
                            int i27 = i16 >> 21;
                            ChipColors chipColors4 = chipColors2;
                            Function2 function28 = function23;
                            Modifier modifier5 = modifier2;
                            t(modifier5, function02, z5, function28, TypographyKt.t(SuggestionChipTokens.f29910n.XQ(), composerKN, i14), chipColors2.rl(z5), function25, null, shape3, chipColors4, chipElevation2, borderStroke2, SuggestionChipDefaults.f27932n.nr(), nr, mutableInteractionSource3, composerKN, i26, (i27 & 112) | (i27 & 14) | 3456 | ((i16 >> 15) & 57344));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            composer2 = composerKN;
                            modifier2 = modifier5;
                            z6 = z5;
                            function26 = function25;
                            shape4 = shape3;
                            chipColors3 = chipColors4;
                            chipElevation3 = chipElevation2;
                            borderStroke3 = borderStroke2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SuggestionChip$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i28) {
                                    ChipKt.az(function0, function2, modifier2, z6, function26, shape4, chipColors3, chipElevation3, borderStroke3, mutableInteractionSource4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    i11 = i10;
                    mutableInteractionSource2 = mutableInteractionSource;
                    int i212 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i17 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i3 & 32) == 0) {
                            }
                            if ((i3 & 64) == 0) {
                            }
                            int i222 = i12;
                            if ((i3 & 128) == 0) {
                            }
                            if ((i3 & 256) == 0) {
                            }
                            if (i11 == 0) {
                            }
                            function25 = function27;
                            modifier2 = modifier3;
                            chipElevation2 = chipElevationXMQ;
                            shape3 = shapeO;
                            z5 = z4;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i232 = i16 << 6;
                            int i242 = ((i16 >> 6) & 14) | i9 | ((i16 << 3) & 112) | ((i16 >> 3) & 896) | (i232 & 7168) | (i232 & 3670016);
                            int i252 = i16 << 9;
                            int i262 = i242 | (234881024 & i252) | (i252 & 1879048192);
                            int i272 = i16 >> 21;
                            ChipColors chipColors42 = chipColors2;
                            Function2 function282 = function23;
                            Modifier modifier52 = modifier2;
                            t(modifier52, function02, z5, function282, TypographyKt.t(SuggestionChipTokens.f29910n.XQ(), composerKN, i14), chipColors2.rl(z5), function25, null, shape3, chipColors42, chipElevation2, borderStroke2, SuggestionChipDefaults.f27932n.nr(), nr, mutableInteractionSource3, composerKN, i262, (i272 & 112) | (i272 & 14) | 3456 | ((i16 >> 15) & 57344));
                            if (ComposerKt.v()) {
                            }
                            composer2 = composerKN;
                            modifier2 = modifier52;
                            z6 = z5;
                            function26 = function25;
                            shape4 = shape3;
                            chipColors3 = chipColors42;
                            chipElevation3 = chipElevation2;
                            borderStroke3 = borderStroke2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function24 = function22;
                if ((196608 & i2) != 0) {
                }
                if ((1572864 & i2) != 0) {
                }
                if ((i2 & 12582912) != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                mutableInteractionSource2 = mutableInteractionSource;
                int i2122 = i5;
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            function24 = function22;
            if ((196608 & i2) != 0) {
            }
            if ((1572864 & i2) != 0) {
            }
            if ((i2 & 12582912) != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            mutableInteractionSource2 = mutableInteractionSource;
            int i21222 = i5;
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z3 = z2;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        function24 = function22;
        if ((196608 & i2) != 0) {
        }
        if ((1572864 & i2) != 0) {
        }
        if ((i2 & 12582912) != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        mutableInteractionSource2 = mutableInteractionSource;
        int i212222 = i5;
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void mUb(final boolean z2, final Function0 function0, final Function2 function2, Modifier modifier, boolean z3, Function2 function22, Function2 function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3, final int i5) {
        boolean z4;
        int i7;
        Function0 function02;
        Function2 function24;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        int i10;
        Function2 function25;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        int i11;
        int i12;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        int i14;
        int i15;
        Shape shapeXMQ;
        SelectableChipColors selectableChipColorsNr;
        Modifier modifier3;
        int i16;
        int i17;
        SelectableChipElevation selectableChipElevationO;
        int i18;
        boolean z6;
        BorderStroke borderStrokeT;
        MutableInteractionSource mutableInteractionSource3;
        SelectableChipElevation selectableChipElevation2;
        BorderStroke borderStroke2;
        boolean z7;
        int i19;
        Function2 function26;
        Function2 function27;
        Shape shape3;
        SelectableChipColors selectableChipColors3;
        Modifier modifier4;
        Composer composer2;
        final Modifier modifier5;
        final boolean z9;
        final Function2 function28;
        final Function2 function29;
        final Shape shape4;
        final SelectableChipColors selectableChipColors4;
        final SelectableChipElevation selectableChipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1711985619);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 6) == 0) {
                i7 = (composerKN.n(z4) ? 4 : 2) | i2;
            } else {
                i7 = i2;
            }
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i7 |= composerKN.E2(function24) ? 256 : 128;
            }
        }
        int i20 = i5 & 8;
        if (i20 != 0) {
            i7 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            i8 = i5 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    z5 = z3;
                    i7 |= composerKN.n(z5) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i7 |= composerKN.E2(function22) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                    function25 = function23;
                } else {
                    function25 = function23;
                    if ((i2 & 1572864) == 0) {
                        i7 |= composerKN.E2(function25) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i5 & 128) == 0) {
                        shape2 = shape;
                        int i21 = composerKN.p5(shape2) ? 8388608 : 4194304;
                        i7 |= i21;
                    } else {
                        shape2 = shape;
                    }
                    i7 |= i21;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i5 & 256) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        int i22 = composerKN.p5(selectableChipColors2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        i7 |= i22;
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i7 |= i22;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i7 |= ((i5 & 512) == 0 && composerKN.p5(selectableChipElevation)) ? 536870912 : 268435456;
                }
                if ((i3 & 6) == 0) {
                    i11 = i3 | (((i5 & 1024) == 0 && composerKN.p5(borderStroke)) ? 4 : 2);
                } else {
                    i11 = i3;
                }
                i12 = i5 & 2048;
                if (i12 != 0) {
                    i13 = i12;
                    i14 = i11 | 48;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    if ((i3 & 48) == 0) {
                        i13 = i12;
                        mutableInteractionSource2 = mutableInteractionSource;
                        i11 |= composerKN.p5(mutableInteractionSource2) ? 32 : 16;
                    } else {
                        i13 = i12;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i14 = i11;
                }
                int i23 = i7;
                if ((i7 & 306783379) == 306783378 && (i14 & 19) == 18 && composerKN.xMQ()) {
                    composerKN.wTp();
                    borderStroke3 = borderStroke;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    selectableChipColors4 = selectableChipColors2;
                    modifier5 = modifier2;
                    composer2 = composerKN;
                    function28 = function22;
                    function29 = function25;
                    shape4 = shape2;
                    z9 = z5;
                    selectableChipElevation3 = selectableChipElevation;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        Modifier modifier6 = i20 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z10 = i8 == 0 ? true : z5;
                        Function2 function210 = i9 == 0 ? null : function22;
                        Function2 function211 = i10 == 0 ? null : function25;
                        if ((i5 & 128) == 0) {
                            i15 = i23 & (-29360129);
                            shapeXMQ = FilterChipDefaults.f25881n.xMQ(composerKN, 6);
                        } else {
                            i15 = i23;
                            shapeXMQ = shape2;
                        }
                        if ((i5 & 256) == 0) {
                            i15 &= -234881025;
                            selectableChipColorsNr = FilterChipDefaults.f25881n.nr(composerKN, 6);
                        } else {
                            selectableChipColorsNr = selectableChipColors2;
                        }
                        int i24 = i15;
                        if ((i5 & 512) == 0) {
                            modifier3 = modifier6;
                            i16 = 6;
                            i17 = i13;
                            selectableChipElevationO = FilterChipDefaults.f25881n.O(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 1572864, 63);
                            i18 = i24 & (-1879048193);
                        } else {
                            modifier3 = modifier6;
                            i16 = 6;
                            i17 = i13;
                            selectableChipElevationO = selectableChipElevation;
                            i18 = i24;
                        }
                        if ((i5 & 1024) == 0) {
                            z6 = z10;
                            borderStrokeT = FilterChipDefaults.f25881n.t(z6, z4, 0L, 0L, 0L, 0L, 0.0f, 0.0f, composerKN, ((i18 >> 12) & 14) | 100663296 | ((i18 << 3) & 112), 252);
                            i14 &= -15;
                        } else {
                            z6 = z10;
                            borderStrokeT = borderStroke;
                        }
                        if (i17 == 0) {
                            selectableChipElevation2 = selectableChipElevationO;
                            borderStroke2 = borderStrokeT;
                            z7 = z6;
                            i19 = i14;
                            mutableInteractionSource3 = null;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            selectableChipElevation2 = selectableChipElevationO;
                            borderStroke2 = borderStrokeT;
                            z7 = z6;
                            i19 = i14;
                        }
                        function26 = function210;
                        function27 = function211;
                        shape3 = shapeXMQ;
                        selectableChipColors3 = selectableChipColorsNr;
                        modifier4 = modifier3;
                    } else {
                        composerKN.wTp();
                        int i25 = (i5 & 128) != 0 ? i23 & (-29360129) : i23;
                        if ((i5 & 256) != 0) {
                            i25 &= -234881025;
                        }
                        if ((i5 & 512) != 0) {
                            i25 &= -1879048193;
                        }
                        if ((i5 & 1024) != 0) {
                            i14 &= -15;
                        }
                        function26 = function22;
                        selectableChipElevation2 = selectableChipElevation;
                        borderStroke2 = borderStroke;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        function27 = function25;
                        shape3 = shape2;
                        selectableChipColors3 = selectableChipColors2;
                        modifier4 = modifier2;
                        z7 = z5;
                        i18 = i25;
                        i16 = 6;
                        i19 = i14;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1711985619, i18, i19, "androidx.compose.material3.FilterChip (Chip.kt:468)");
                    }
                    int i26 = i18 << 3;
                    int i27 = i18 << 6;
                    int i28 = i18 >> 24;
                    qie(z2, modifier4, function02, z7, function24, TypographyKt.t(FilterChipTokens.f29642n.fD(), composerKN, i16), function26, null, function27, shape3, selectableChipColors3, selectableChipElevation2, borderStroke2, FilterChipDefaults.f25881n.KN(), f24781t, mutableInteractionSource3, composerKN, (i18 & 14) | 12582912 | ((i18 >> 6) & 112) | (i26 & 896) | ((i18 >> 3) & 7168) | (57344 & i27) | (i26 & 3670016) | (234881024 & i27) | (1879048192 & i27), (i28 & 112) | (i28 & 14) | 27648 | ((i19 << 6) & 896) | ((i19 << 12) & 458752));
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer2 = composerKN;
                    modifier5 = modifier4;
                    z9 = z7;
                    function28 = function26;
                    function29 = function27;
                    shape4 = shape3;
                    selectableChipColors4 = selectableChipColors3;
                    selectableChipElevation3 = selectableChipElevation2;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$FilterChip$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i29) {
                            ChipKt.mUb(z2, function0, function2, modifier5, z9, function28, function29, shape4, selectableChipColors4, selectableChipElevation3, borderStroke3, mutableInteractionSource4, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 24576;
            z5 = z3;
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if ((i3 & 6) == 0) {
            }
            i12 = i5 & 2048;
            if (i12 != 0) {
            }
            int i232 = i7;
            if ((i7 & 306783379) == 306783378) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i20 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i5 & 128) == 0) {
                    }
                    if ((i5 & 256) == 0) {
                    }
                    int i242 = i15;
                    if ((i5 & 512) == 0) {
                    }
                    if ((i5 & 1024) == 0) {
                    }
                    if (i17 == 0) {
                    }
                    function26 = function210;
                    function27 = function211;
                    shape3 = shapeXMQ;
                    selectableChipColors3 = selectableChipColorsNr;
                    modifier4 = modifier3;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    int i262 = i18 << 3;
                    int i272 = i18 << 6;
                    int i282 = i18 >> 24;
                    qie(z2, modifier4, function02, z7, function24, TypographyKt.t(FilterChipTokens.f29642n.fD(), composerKN, i16), function26, null, function27, shape3, selectableChipColors3, selectableChipElevation2, borderStroke2, FilterChipDefaults.f25881n.KN(), f24781t, mutableInteractionSource3, composerKN, (i18 & 14) | 12582912 | ((i18 >> 6) & 112) | (i262 & 896) | ((i18 >> 3) & 7168) | (57344 & i272) | (i262 & 3670016) | (234881024 & i272) | (1879048192 & i272), (i282 & 112) | (i282 & 14) | 27648 | ((i19 << 6) & 896) | ((i19 << 12) & 458752));
                    if (ComposerKt.v()) {
                    }
                    composer2 = composerKN;
                    modifier5 = modifier4;
                    z9 = z7;
                    function28 = function26;
                    function29 = function27;
                    shape4 = shape3;
                    selectableChipColors4 = selectableChipColors3;
                    selectableChipElevation3 = selectableChipElevation2;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        z5 = z3;
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((i3 & 6) == 0) {
        }
        i12 = i5 & 2048;
        if (i12 != 0) {
        }
        int i2322 = i7;
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function0 function0, final Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Function2 function24;
        Modifier modifier2;
        int i8;
        boolean z3;
        int i9;
        Function2 function25;
        int i10;
        ChipColors chipColorsT;
        int i11;
        int i12;
        int i13;
        Function2 function26;
        Shape shapeMUb;
        int i14;
        Modifier modifier3;
        int i15;
        int i16;
        ChipElevation chipElevationNr;
        boolean z4;
        BorderStroke borderStrokeRl;
        int i17;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        int i18;
        Shape shape2;
        ChipElevation chipElevation2;
        Function2 function27;
        Modifier modifier4;
        Composer composer2;
        final Modifier modifier5;
        final boolean z5;
        final Function2 function28;
        final Function2 function29;
        final Shape shape3;
        final ChipColors chipColors2;
        final ChipElevation chipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(313450168);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function24) ? 32 : 16;
            }
        }
        int i19 = i5 & 4;
        if (i19 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i7 |= composerKN.n(z3) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                    if ((i2 & 24576) == 0) {
                        function25 = function22;
                        i7 |= composerKN.E2(function25) ? 16384 : 8192;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i7 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i7 |= composerKN.E2(function23) ? 131072 : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i7 |= ((i5 & 64) == 0 && composerKN.p5(shape)) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) != 0) {
                        if ((i5 & 128) == 0) {
                            chipColorsT = chipColors;
                            int i20 = composerKN.p5(chipColorsT) ? 8388608 : 4194304;
                            i7 |= i20;
                        } else {
                            chipColorsT = chipColors;
                        }
                        i7 |= i20;
                    } else {
                        chipColorsT = chipColors;
                    }
                    if ((i2 & 100663296) == 0) {
                        i7 |= ((i5 & 256) == 0 && composerKN.p5(chipElevation)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i7 |= ((i5 & 512) == 0 && composerKN.p5(borderStroke)) ? 536870912 : 268435456;
                    }
                    i11 = i5 & 1024;
                    if (i11 == 0) {
                        i12 = i11;
                        i13 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        i12 = i11;
                        i13 = i3 | (composerKN.p5(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i12 = i11;
                        i13 = i3;
                    }
                    int i21 = i7;
                    if ((i7 & 306783379) != 306783378 && (i13 & 3) == 2 && composerKN.xMQ()) {
                        composerKN.wTp();
                        function29 = function23;
                        chipElevation3 = chipElevation;
                        mutableInteractionSource3 = mutableInteractionSource;
                        z5 = z3;
                        composer2 = composerKN;
                        shape3 = shape;
                        chipColors2 = chipColorsT;
                        modifier5 = modifier2;
                        function28 = function25;
                        borderStroke3 = borderStroke;
                    } else {
                        composerKN.e();
                        int i22 = i13;
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier6 = i19 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i8 == 0 ? true : z3;
                            function26 = i9 == 0 ? null : function25;
                            Function2 function210 = i10 == 0 ? null : function23;
                            if ((i5 & 64) == 0) {
                                i14 = i21 & (-3670017);
                                shapeMUb = AssistChipDefaults.f24444n.mUb(composerKN, 6);
                            } else {
                                shapeMUb = shape;
                                i14 = i21;
                            }
                            if ((i5 & 128) != 0) {
                                chipColorsT = AssistChipDefaults.f24444n.t(composerKN, 6);
                                i14 &= -29360129;
                            }
                            ChipColors chipColors3 = chipColorsT;
                            int i23 = i14;
                            if ((i5 & 256) == 0) {
                                modifier3 = modifier6;
                                i16 = i22;
                                i15 = 6;
                                i23 &= -234881025;
                                chipElevationNr = AssistChipDefaults.f24444n.nr(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 1572864, 63);
                            } else {
                                modifier3 = modifier6;
                                i15 = 6;
                                i16 = i22;
                                chipElevationNr = chipElevation;
                            }
                            if ((i5 & 512) == 0) {
                                z4 = z6;
                                borderStrokeRl = AssistChipDefaults.f24444n.rl(z4, 0L, 0L, 0.0f, composerKN, ((i23 >> 9) & 14) | 24576, 14);
                                i17 = i23 & (-1879048193);
                            } else {
                                z4 = z6;
                                borderStrokeRl = borderStroke;
                                i17 = i23;
                            }
                            if (i12 == 0) {
                                borderStroke2 = borderStrokeRl;
                                i18 = i17;
                                shape2 = shapeMUb;
                                chipElevation2 = chipElevationNr;
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                borderStroke2 = borderStrokeRl;
                                i18 = i17;
                                shape2 = shapeMUb;
                                chipElevation2 = chipElevationNr;
                            }
                            chipColorsT = chipColors3;
                            function27 = function210;
                            modifier4 = modifier3;
                        } else {
                            composerKN.wTp();
                            int i24 = (i5 & 64) != 0 ? i21 & (-3670017) : i21;
                            if ((i5 & 128) != 0) {
                                i24 &= -29360129;
                            }
                            if ((i5 & 256) != 0) {
                                i24 &= -234881025;
                            }
                            if ((i5 & 512) != 0) {
                                i24 &= -1879048193;
                            }
                            function27 = function23;
                            shape2 = shape;
                            chipElevation2 = chipElevation;
                            borderStroke2 = borderStroke;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i18 = i24;
                            i15 = 6;
                            modifier4 = modifier2;
                            z4 = z3;
                            function26 = function25;
                            i16 = i22;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(313450168, i18, i16, "androidx.compose.material3.AssistChip (Chip.kt:132)");
                        }
                        int i25 = i18 << 6;
                        int i26 = ((i18 >> 6) & 14) | ((i18 << 3) & 112) | ((i18 >> 3) & 896) | (i25 & 7168) | (3670016 & i25) | (29360128 & i25) | (234881024 & i25) | (i25 & 1879048192);
                        int i27 = i18 >> 24;
                        boolean z7 = z4;
                        ChipColors chipColors4 = chipColorsT;
                        t(modifier4, function0, z7, function24, TypographyKt.t(AssistChipTokens.f29393n.aYN(), composerKN, i15), chipColorsT.rl(z4), function26, function27, shape2, chipColors4, chipElevation2, borderStroke2, AssistChipDefaults.f24444n.xMQ(), rl, mutableInteractionSource2, composerKN, i26, (i27 & 112) | (i27 & 14) | 3456 | ((i16 << 12) & 57344));
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer2 = composerKN;
                        modifier5 = modifier4;
                        z5 = z7;
                        function28 = function26;
                        function29 = function27;
                        shape3 = shape2;
                        chipColors2 = chipColors4;
                        chipElevation3 = chipElevation2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$AssistChip$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i28) {
                                ChipKt.n(function0, function2, modifier5, z5, function28, function29, shape3, chipColors2, chipElevation3, borderStroke3, mutableInteractionSource3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= 24576;
                function25 = function22;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                i11 = i5 & 1024;
                if (i11 == 0) {
                }
                int i212 = i7;
                if ((i7 & 306783379) != 306783378) {
                    composerKN.e();
                    int i222 = i13;
                    if ((i2 & 1) != 0) {
                        if (i19 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i5 & 64) == 0) {
                        }
                        if ((i5 & 128) != 0) {
                        }
                        ChipColors chipColors32 = chipColorsT;
                        int i232 = i14;
                        if ((i5 & 256) == 0) {
                        }
                        if ((i5 & 512) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        chipColorsT = chipColors32;
                        function27 = function210;
                        modifier4 = modifier3;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        int i252 = i18 << 6;
                        int i262 = ((i18 >> 6) & 14) | ((i18 << 3) & 112) | ((i18 >> 3) & 896) | (i252 & 7168) | (3670016 & i252) | (29360128 & i252) | (234881024 & i252) | (i252 & 1879048192);
                        int i272 = i18 >> 24;
                        boolean z72 = z4;
                        ChipColors chipColors42 = chipColorsT;
                        t(modifier4, function0, z72, function24, TypographyKt.t(AssistChipTokens.f29393n.aYN(), composerKN, i15), chipColorsT.rl(z4), function26, function27, shape2, chipColors42, chipElevation2, borderStroke2, AssistChipDefaults.f24444n.xMQ(), rl, mutableInteractionSource2, composerKN, i262, (i272 & 112) | (i272 & 14) | 3456 | ((i16 << 12) & 57344));
                        if (ComposerKt.v()) {
                        }
                        composer2 = composerKN;
                        modifier5 = modifier4;
                        z5 = z72;
                        function28 = function26;
                        function29 = function27;
                        shape3 = shape2;
                        chipColors2 = chipColors42;
                        chipElevation3 = chipElevation2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            function25 = function22;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            i11 = i5 & 1024;
            if (i11 == 0) {
            }
            int i2122 = i7;
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        z3 = z2;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        function25 = function22;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        i11 = i5 & 1024;
        if (i11 == 0) {
        }
        int i21222 = i7;
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(final Function2 function2, final TextStyle textStyle, final long j2, final Function2 function22, final Function2 function23, final Function2 function24, final long j3, final long j4, final float f3, final PaddingValues paddingValues, Composer composer, final int i2) {
        int i3;
        Function2 function25;
        Function2 function26;
        Function2 function27;
        long j5;
        long j6;
        Composer composerKN = composer.KN(-782878228);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(textStyle) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.nr(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function25 = function22;
            i3 |= composerKN.E2(function25) ? 2048 : 1024;
        } else {
            function25 = function22;
        }
        if ((i2 & 24576) == 0) {
            function26 = function23;
            i3 |= composerKN.E2(function26) ? 16384 : 8192;
        } else {
            function26 = function23;
        }
        if ((196608 & i2) == 0) {
            function27 = function24;
            i3 |= composerKN.E2(function27) ? 131072 : 65536;
        } else {
            function27 = function24;
        }
        if ((1572864 & i2) == 0) {
            j5 = j3;
            i3 |= composerKN.nr(j5) ? 1048576 : 524288;
        } else {
            j5 = j3;
        }
        if ((12582912 & i2) == 0) {
            j6 = j4;
            i3 |= composerKN.nr(j6) ? 8388608 : 4194304;
        } else {
            j6 = j4;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerKN.rl(f3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i3 |= composerKN.p5(paddingValues) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) == 306783378 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-782878228, i3, -1, "androidx.compose.material3.ChipContent (Chip.kt:2051)");
            }
            final Function2 function28 = function25;
            final Function2 function29 = function26;
            final Function2 function210 = function27;
            final long j7 = j5;
            final long j9 = j6;
            CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(j2)), TextKt.J2().nr(textStyle)}, ComposableLambdaKt.nr(1748799148, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1748799148, i5, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:2056)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierKN = PaddingKt.KN(SizeKt.rl(companion, 0.0f, f3, 1, null), paddingValues);
                    AnonymousClass1 anonymousClass1 = new MeasurePolicy() { // from class: androidx.compose.material3.ChipKt$ChipContent$1.1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public final MeasureResult rl(MeasureScope measureScope, List list, long j10) {
                            Object obj;
                            Object obj2;
                            int size = list.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size) {
                                    obj = null;
                                    break;
                                }
                                obj = list.get(i7);
                                if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj), "leadingIcon")) {
                                    break;
                                }
                                i7++;
                            }
                            Measurable measurable = (Measurable) obj;
                            final Placeable placeableDR0 = measurable != null ? measurable.dR0(Constraints.nr(j10, 0, 0, 0, 0, 10, null)) : null;
                            final int iS = TextFieldImplKt.S(placeableDR0);
                            final int iZ = TextFieldImplKt.Z(placeableDR0);
                            int size2 = list.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size2) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = list.get(i8);
                                if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj2), "trailingIcon")) {
                                    break;
                                }
                                i8++;
                            }
                            Measurable measurable2 = (Measurable) obj2;
                            Placeable placeableDR02 = measurable2 != null ? measurable2.dR0(Constraints.nr(j10, 0, 0, 0, 0, 10, null)) : null;
                            int iS2 = TextFieldImplKt.S(placeableDR02);
                            final int iZ2 = TextFieldImplKt.Z(placeableDR02);
                            int size3 = list.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                Measurable measurable3 = (Measurable) list.get(i9);
                                if (Intrinsics.areEqual(LayoutIdKt.n(measurable3), "label")) {
                                    final Placeable placeableDR03 = measurable3.dR0(ConstraintsKt.mUb(j10, -(iS + iS2), 0, 2, null));
                                    int width = placeableDR03.getWidth() + iS + iS2;
                                    final int iMax = Math.max(iZ, Math.max(placeableDR03.getHeight(), iZ2));
                                    final Placeable placeable = placeableDR02;
                                    return MeasureScope.ER(measureScope, width, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ChipKt.ChipContent.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            n(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Placeable.PlacementScope placementScope) {
                                            Placeable.PlacementScope placementScope2;
                                            Placeable placeable2 = placeableDR0;
                                            if (placeable2 != null) {
                                                Placeable.PlacementScope.az(placementScope, placeable2, 0, Alignment.INSTANCE.xMQ().n(iZ, iMax), 0.0f, 4, null);
                                                placementScope2 = placementScope;
                                            } else {
                                                placementScope2 = placementScope;
                                            }
                                            Placeable.PlacementScope.az(placementScope2, placeableDR03, iS, 0, 0.0f, 4, null);
                                            Placeable placeable3 = placeable;
                                            if (placeable3 != null) {
                                                Placeable.PlacementScope.az(placementScope2, placeable3, iS + placeableDR03.getWidth(), Alignment.INSTANCE.xMQ().n(iZ2, iMax), 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    };
                    Function2 function211 = function29;
                    Function2 function212 = function28;
                    Function2 function213 = function210;
                    long j10 = j7;
                    Function2 function214 = function2;
                    long j11 = j9;
                    int iN = ComposablesKt.n(composer2, 0);
                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer2, modifierKN);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion2.n();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer2.T();
                    if (composer2.getInserting()) {
                        composer2.s7N(function0N);
                    } else {
                        composer2.r();
                    }
                    Composer composerN = Updater.n(composer2);
                    Updater.O(composerN, anonymousClass1, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    Function2 function2Rl = companion2.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    composer2.eF(-1293169671);
                    if (function211 != null || function212 != null) {
                        Modifier modifierRl = LayoutIdKt.rl(companion, "leadingIcon");
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                        int iN2 = ComposablesKt.n(composer2, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierRl);
                        Function0 function0N2 = companion2.n();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composer2.T();
                        if (composer2.getInserting()) {
                            composer2.s7N(function0N2);
                        } else {
                            composer2.r();
                        }
                        Composer composerN2 = Updater.n(composer2);
                        Updater.O(composerN2, measurePolicyUo, companion2.t());
                        Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                        Function2 function2Rl2 = companion2.rl();
                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                            composerN2.o(Integer.valueOf(iN2));
                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        }
                        Updater.O(composerN2, modifierO2, companion2.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        if (function211 != null) {
                            composer2.eF(832680499);
                            function211.invoke(composer2, 0);
                            composer2.Xw();
                        } else if (function212 != null) {
                            composer2.eF(832788565);
                            CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(j10)), function212, composer2, ProvidedValue.xMQ);
                            composer2.Xw();
                        } else {
                            composer2.eF(833040347);
                            composer2.Xw();
                        }
                        composer2.XQ();
                    }
                    composer2.Xw();
                    Modifier modifierMUb = PaddingKt.mUb(LayoutIdKt.rl(companion, "label"), ChipKt.f24780n, Dp.KN(0));
                    Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion3.xMQ(), composer2, 54);
                    int iN3 = ComposablesKt.n(composer2, 0);
                    CompositionLocalMap compositionLocalMapIk3 = composer2.Ik();
                    Modifier modifierO3 = ComposedModifierKt.O(composer2, modifierMUb);
                    Function0 function0N3 = companion2.n();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer2.T();
                    if (composer2.getInserting()) {
                        composer2.s7N(function0N3);
                    } else {
                        composer2.r();
                    }
                    Composer composerN3 = Updater.n(composer2);
                    Updater.O(composerN3, measurePolicyRl, companion2.t());
                    Updater.O(composerN3, compositionLocalMapIk3, companion2.O());
                    Function2 function2Rl3 = companion2.rl();
                    if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                        composerN3.o(Integer.valueOf(iN3));
                        composerN3.az(Integer.valueOf(iN3), function2Rl3);
                    }
                    Updater.O(composerN3, modifierO3, companion2.nr());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                    function214.invoke(composer2, 0);
                    composer2.XQ();
                    composer2.eF(-1293135324);
                    if (function213 != null) {
                        Modifier modifierRl2 = LayoutIdKt.rl(companion, "trailingIcon");
                        MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.O(), false);
                        int iN4 = ComposablesKt.n(composer2, 0);
                        CompositionLocalMap compositionLocalMapIk4 = composer2.Ik();
                        Modifier modifierO4 = ComposedModifierKt.O(composer2, modifierRl2);
                        Function0 function0N4 = companion2.n();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composer2.T();
                        if (composer2.getInserting()) {
                            composer2.s7N(function0N4);
                        } else {
                            composer2.r();
                        }
                        Composer composerN4 = Updater.n(composer2);
                        Updater.O(composerN4, measurePolicyUo2, companion2.t());
                        Updater.O(composerN4, compositionLocalMapIk4, companion2.O());
                        Function2 function2Rl4 = companion2.rl();
                        if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                            composerN4.o(Integer.valueOf(iN4));
                            composerN4.az(Integer.valueOf(iN4), function2Rl4);
                        }
                        Updater.O(composerN4, modifierO4, companion2.nr());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                        CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(j11)), function213, composer2, ProvidedValue.xMQ);
                        composer2.XQ();
                    }
                    composer2.Xw();
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    ChipKt.nr(function2, textStyle, j2, function22, function23, function24, j3, j4, f3, paddingValues, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final ChipColors o(ColorScheme colorScheme) {
        ChipColors defaultSuggestionChipColorsCached = colorScheme.getDefaultSuggestionChipColorsCached();
        if (defaultSuggestionChipColorsCached != null) {
            return defaultSuggestionChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jJ2 = companion.J2();
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.f29910n;
        ChipColors chipColors = new ChipColors(jJ2, ColorSchemeKt.Uo(colorScheme, suggestionChipTokens.Z()), ColorSchemeKt.Uo(colorScheme, suggestionChipTokens.S()), companion.Uo(), companion.J2(), Color.az(ColorSchemeKt.Uo(colorScheme, suggestionChipTokens.t()), suggestionChipTokens.nr(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, suggestionChipTokens.O()), suggestionChipTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), companion.Uo(), null);
        colorScheme.X4T(chipColors);
        return chipColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void rl(final Function0 function0, final Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Function2 function24;
        Modifier modifier2;
        int i8;
        boolean z3;
        int i9;
        Function2 function25;
        int i10;
        ChipColors chipColorsT;
        int i11;
        int i12;
        int i13;
        Function2 function26;
        Shape shapeMUb;
        int i14;
        Modifier modifier3;
        int i15;
        Composer composer2;
        int i16;
        ChipElevation chipElevationNr;
        ChipBorder chipBorderN;
        int i17;
        MutableInteractionSource mutableInteractionSource2;
        ChipElevation chipElevation2;
        Shape shape2;
        Function2 function27;
        Modifier modifier4;
        Composer composer3;
        final ChipBorder chipBorder2;
        final Modifier modifier5;
        final boolean z4;
        final Function2 function28;
        final Function2 function29;
        final Shape shape3;
        final ChipColors chipColors2;
        final ChipElevation chipElevation3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1932300596);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function24) ? 32 : 16;
            }
        }
        int i18 = i5 & 4;
        if (i18 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i7 |= composerKN.n(z3) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                    if ((i2 & 24576) == 0) {
                        function25 = function22;
                        i7 |= composerKN.E2(function25) ? 16384 : 8192;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i7 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i7 |= composerKN.E2(function23) ? 131072 : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i7 |= ((i5 & 64) == 0 && composerKN.p5(shape)) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) != 0) {
                        if ((i5 & 128) == 0) {
                            chipColorsT = chipColors;
                            int i19 = composerKN.p5(chipColorsT) ? 8388608 : 4194304;
                            i7 |= i19;
                        } else {
                            chipColorsT = chipColors;
                        }
                        i7 |= i19;
                    } else {
                        chipColorsT = chipColors;
                    }
                    if ((i2 & 100663296) == 0) {
                        i7 |= ((i5 & 256) == 0 && composerKN.p5(chipElevation)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i7 |= ((i5 & 512) == 0 && composerKN.p5(chipBorder)) ? 536870912 : 268435456;
                    }
                    i11 = i5 & 1024;
                    if (i11 == 0) {
                        i12 = i11;
                        i13 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        i12 = i11;
                        i13 = i3 | (composerKN.p5(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i12 = i11;
                        i13 = i3;
                    }
                    int i20 = i7;
                    if ((i7 & 306783379) != 306783378 && (i13 & 3) == 2 && composerKN.xMQ()) {
                        composerKN.wTp();
                        function29 = function23;
                        chipElevation3 = chipElevation;
                        mutableInteractionSource3 = mutableInteractionSource;
                        composer3 = composerKN;
                        z4 = z3;
                        shape3 = shape;
                        chipColors2 = chipColorsT;
                        modifier5 = modifier2;
                        function28 = function25;
                        chipBorder2 = chipBorder;
                    } else {
                        composerKN.e();
                        int i21 = i13;
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier6 = i18 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z5 = i8 == 0 ? true : z3;
                            function26 = i9 == 0 ? null : function25;
                            Function2 function210 = i10 == 0 ? null : function23;
                            if ((i5 & 64) == 0) {
                                i14 = i20 & (-3670017);
                                shapeMUb = AssistChipDefaults.f24444n.mUb(composerKN, 6);
                            } else {
                                shapeMUb = shape;
                                i14 = i20;
                            }
                            if ((i5 & 128) != 0) {
                                chipColorsT = AssistChipDefaults.f24444n.t(composerKN, 6);
                                i14 &= -29360129;
                            }
                            ChipColors chipColors3 = chipColorsT;
                            int i22 = i14;
                            if ((i5 & 256) == 0) {
                                composer2 = composerKN;
                                modifier3 = modifier6;
                                i15 = 6;
                                i16 = i21;
                                i22 &= -234881025;
                                chipElevationNr = AssistChipDefaults.f24444n.nr(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                            } else {
                                modifier3 = modifier6;
                                i15 = 6;
                                composer2 = composerKN;
                                i16 = i21;
                                chipElevationNr = chipElevation;
                            }
                            if ((i5 & 512) == 0) {
                                composerKN = composer2;
                                chipBorderN = AssistChipDefaults.f24444n.n(0L, 0L, 0.0f, composerKN, 3072, 7);
                                i17 = i22 & (-1879048193);
                            } else {
                                composerKN = composer2;
                                chipBorderN = chipBorder;
                                i17 = i22;
                            }
                            if (i12 == 0) {
                                Object objIF = composerKN.iF();
                                if (objIF == Composer.INSTANCE.n()) {
                                    objIF = InteractionSourceKt.n();
                                    composerKN.o(objIF);
                                }
                                mutableInteractionSource2 = (MutableInteractionSource) objIF;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            chipElevation2 = chipElevationNr;
                            shape2 = shapeMUb;
                            z3 = z5;
                            chipColorsT = chipColors3;
                            function27 = function210;
                            modifier4 = modifier3;
                        } else {
                            composerKN.wTp();
                            int i23 = (i5 & 64) != 0 ? i20 & (-3670017) : i20;
                            if ((i5 & 128) != 0) {
                                i23 &= -29360129;
                            }
                            if ((i5 & 256) != 0) {
                                i23 &= -234881025;
                            }
                            if ((i5 & 512) != 0) {
                                i23 &= -1879048193;
                            }
                            function27 = function23;
                            shape2 = shape;
                            chipElevation2 = chipElevation;
                            chipBorderN = chipBorder;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i15 = 6;
                            modifier4 = modifier2;
                            function26 = function25;
                            i17 = i23;
                            i16 = i21;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1932300596, i17, i16, "androidx.compose.material3.AssistChip (Chip.kt:219)");
                        }
                        TextStyle textStyleT = TypographyKt.t(AssistChipTokens.f29393n.aYN(), composerKN, i15);
                        long jRl = chipColorsT.rl(z3);
                        composerKN.eF(267317901);
                        State stateN = chipBorderN != null ? null : chipBorderN.n(z3, composerKN, ((i17 >> 9) & 14) | ((i17 >> 24) & 112));
                        composerKN.Xw();
                        int i24 = i17 << 6;
                        ChipColors chipColors4 = chipColorsT;
                        composer3 = composerKN;
                        boolean z6 = z3;
                        t(modifier4, function0, z6, function24, textStyleT, jRl, function26, function27, shape2, chipColors4, chipElevation2, stateN != null ? (BorderStroke) stateN.getValue() : null, AssistChipDefaults.f24444n.xMQ(), rl, mutableInteractionSource2, composer3, ((i17 >> 6) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & 896) | (i24 & 7168) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24) | (i24 & 1879048192), ((i17 >> 24) & 14) | 3456 | ((i16 << 12) & 57344));
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        chipBorder2 = chipBorderN;
                        modifier5 = modifier4;
                        z4 = z6;
                        function28 = function26;
                        function29 = function27;
                        shape3 = shape2;
                        chipColors2 = chipColors4;
                        chipElevation3 = chipElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeGh = composer3.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$AssistChip$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                n(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer4, int i25) {
                                ChipKt.rl(function0, function2, modifier5, z4, function28, function29, shape3, chipColors2, chipElevation3, chipBorder2, mutableInteractionSource3, composer4, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= 24576;
                function25 = function22;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                i11 = i5 & 1024;
                if (i11 == 0) {
                }
                int i202 = i7;
                if ((i7 & 306783379) != 306783378) {
                    composerKN.e();
                    int i212 = i13;
                    if ((i2 & 1) != 0) {
                        if (i18 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i5 & 64) == 0) {
                        }
                        if ((i5 & 128) != 0) {
                        }
                        ChipColors chipColors32 = chipColorsT;
                        int i222 = i14;
                        if ((i5 & 256) == 0) {
                        }
                        if ((i5 & 512) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        chipElevation2 = chipElevationNr;
                        shape2 = shapeMUb;
                        z3 = z5;
                        chipColorsT = chipColors32;
                        function27 = function210;
                        modifier4 = modifier3;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        TextStyle textStyleT2 = TypographyKt.t(AssistChipTokens.f29393n.aYN(), composerKN, i15);
                        long jRl2 = chipColorsT.rl(z3);
                        composerKN.eF(267317901);
                        if (chipBorderN != null) {
                        }
                        composerKN.Xw();
                        int i242 = i17 << 6;
                        ChipColors chipColors42 = chipColorsT;
                        composer3 = composerKN;
                        boolean z62 = z3;
                        t(modifier4, function0, z62, function24, textStyleT2, jRl2, function26, function27, shape2, chipColors42, chipElevation2, stateN != null ? (BorderStroke) stateN.getValue() : null, AssistChipDefaults.f24444n.xMQ(), rl, mutableInteractionSource2, composer3, ((i17 >> 6) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & 896) | (i242 & 7168) | (3670016 & i242) | (29360128 & i242) | (234881024 & i242) | (i242 & 1879048192), ((i17 >> 24) & 14) | 3456 | ((i16 << 12) & 57344));
                        if (ComposerKt.v()) {
                        }
                        chipBorder2 = chipBorderN;
                        modifier5 = modifier4;
                        z4 = z62;
                        function28 = function26;
                        function29 = function27;
                        shape3 = shape2;
                        chipColors2 = chipColors42;
                        chipElevation3 = chipElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                scopeUpdateScopeGh = composer3.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            function25 = function22;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            i11 = i5 & 1024;
            if (i11 == 0) {
            }
            int i2022 = i7;
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        z3 = z2;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        function25 = function22;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        i11 = i5 & 1024;
        if (i11 == 0) {
        }
        int i20222 = i7;
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void ty(final Function0 function0, final Function2 function2, Modifier modifier, boolean z2, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Function2 function23;
        final Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        Function2 function24;
        Shape shape2;
        ChipColors chipColors2;
        int i9;
        ChipElevation chipElevationXMQ;
        int i10;
        int i11;
        MutableInteractionSource mutableInteractionSource2;
        int i12;
        Shape shapeO;
        ChipColors chipColorsKN;
        int i13;
        Composer composer2;
        ChipBorder chipBorderJ2;
        MutableInteractionSource mutableInteractionSource3;
        ChipColors chipColors3;
        Function2 function25;
        int i14;
        ChipElevation chipElevation2;
        boolean z4;
        Shape shape3;
        Composer composer3;
        final ChipBorder chipBorder2;
        final boolean z5;
        final Function2 function26;
        final Shape shape4;
        final ChipColors chipColors4;
        final ChipElevation chipElevation3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(170629701);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function23) ? 32 : 16;
            }
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function24 = function22;
                        i5 |= composerKN.E2(function24) ? 16384 : 8192;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            shape2 = shape;
                            int i16 = composerKN.p5(shape2) ? 131072 : 65536;
                            i5 |= i16;
                        } else {
                            shape2 = shape;
                        }
                        i5 |= i16;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i17 = composerKN.p5(chipColors2) ? 1048576 : 524288;
                            i5 |= i17;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i5 |= i17;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i2 & 12582912) != 0) {
                        i9 = 12582912;
                        if ((i3 & 128) == 0) {
                            chipElevationXMQ = chipElevation;
                            int i18 = composerKN.p5(chipElevationXMQ) ? 8388608 : 4194304;
                            i5 |= i18;
                        } else {
                            chipElevationXMQ = chipElevation;
                        }
                        i5 |= i18;
                    } else {
                        i9 = 12582912;
                        chipElevationXMQ = chipElevation;
                    }
                    if ((i2 & 100663296) == 0) {
                        i5 |= ((i3 & 256) == 0 && composerKN.p5(chipBorder)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i11 = i10;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i5 |= composerKN.p5(mutableInteractionSource2) ? 536870912 : 268435456;
                        }
                        int i19 = i5;
                        if ((i5 & 306783379) == 306783378 && composerKN.xMQ()) {
                            composerKN.wTp();
                            z5 = z3;
                            composer3 = composerKN;
                            function26 = function24;
                            shape4 = shape2;
                            chipColors4 = chipColors2;
                            chipElevation3 = chipElevationXMQ;
                            chipBorder2 = chipBorder;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier3 = i15 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z6 = i7 == 0 ? true : z3;
                                Function2 function27 = i8 == 0 ? null : function24;
                                if ((i3 & 32) == 0) {
                                    i12 = i19 & (-458753);
                                    shapeO = SuggestionChipDefaults.f27932n.O(composerKN, 6);
                                } else {
                                    i12 = i19;
                                    shapeO = shape2;
                                }
                                if ((i3 & 64) == 0) {
                                    i12 &= -3670017;
                                    chipColorsKN = SuggestionChipDefaults.f27932n.KN(composerKN, 6);
                                } else {
                                    chipColorsKN = chipColors2;
                                }
                                int i20 = i12;
                                if ((i3 & 128) == 0) {
                                    composer2 = composerKN;
                                    i20 &= -29360129;
                                    i13 = 6;
                                    chipElevationXMQ = SuggestionChipDefaults.f27932n.xMQ(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                                } else {
                                    i13 = 6;
                                    composer2 = composerKN;
                                }
                                if ((i3 & 256) == 0) {
                                    composerKN = composer2;
                                    chipBorderJ2 = SuggestionChipDefaults.f27932n.J2(0L, 0L, 0.0f, composerKN, 3072, 7);
                                    i20 &= -234881025;
                                } else {
                                    composerKN = composer2;
                                    chipBorderJ2 = chipBorder;
                                }
                                if (i11 == 0) {
                                    Object objIF = composerKN.iF();
                                    if (objIF == Composer.INSTANCE.n()) {
                                        objIF = InteractionSourceKt.n();
                                        composerKN.o(objIF);
                                    }
                                    modifier2 = modifier3;
                                    mutableInteractionSource3 = (MutableInteractionSource) objIF;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    modifier2 = modifier3;
                                }
                                chipColors3 = chipColorsKN;
                                function25 = function27;
                                i14 = i20;
                                chipElevation2 = chipElevationXMQ;
                                z4 = z6;
                                shape3 = shapeO;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 32) != 0) {
                                    i19 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    i19 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i19 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i19 &= -234881025;
                                }
                                chipBorderJ2 = chipBorder;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function25 = function24;
                                shape3 = shape2;
                                chipColors3 = chipColors2;
                                chipElevation2 = chipElevationXMQ;
                                i13 = 6;
                                z4 = z3;
                                i14 = i19;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(170629701, i14, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:830)");
                            }
                            TextStyle textStyleT = TypographyKt.t(SuggestionChipTokens.f29910n.XQ(), composerKN, i13);
                            long jRl = chipColors3.rl(z4);
                            composerKN.eF(1248043208);
                            State stateN = chipBorderJ2 != null ? null : chipBorderJ2.n(z4, composerKN, ((i14 >> 9) & 14) | ((i14 >> 21) & 112));
                            composerKN.Xw();
                            BorderStroke borderStroke = stateN != null ? (BorderStroke) stateN.getValue() : null;
                            int i21 = i14 << 6;
                            int i22 = ((i14 >> 6) & 14) | i9 | ((i14 << 3) & 112) | ((i14 >> 3) & 896) | (i21 & 7168) | (i21 & 3670016);
                            int i23 = i14 << 9;
                            ChipColors chipColors5 = chipColors3;
                            composer3 = composerKN;
                            Function2 function28 = function23;
                            Modifier modifier4 = modifier2;
                            t(modifier4, function02, z4, function28, textStyleT, jRl, function25, null, shape3, chipColors5, chipElevation2, borderStroke, SuggestionChipDefaults.f27932n.nr(), nr, mutableInteractionSource3, composer3, i22 | (234881024 & i23) | (i23 & 1879048192), ((i14 >> 21) & 14) | 3456 | ((i14 >> 15) & 57344));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            chipBorder2 = chipBorderJ2;
                            modifier2 = modifier4;
                            z5 = z4;
                            function26 = function25;
                            shape4 = shape3;
                            chipColors4 = chipColors5;
                            chipElevation3 = chipElevation2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        scopeUpdateScopeGh = composer3.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SuggestionChip$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    n(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer4, int i24) {
                                    ChipKt.ty(function0, function2, modifier2, z5, function26, shape4, chipColors4, chipElevation3, chipBorder2, mutableInteractionSource4, composer4, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    i11 = i10;
                    mutableInteractionSource2 = mutableInteractionSource;
                    int i192 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i15 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i3 & 32) == 0) {
                            }
                            if ((i3 & 64) == 0) {
                            }
                            int i202 = i12;
                            if ((i3 & 128) == 0) {
                            }
                            if ((i3 & 256) == 0) {
                            }
                            if (i11 == 0) {
                            }
                            chipColors3 = chipColorsKN;
                            function25 = function27;
                            i14 = i202;
                            chipElevation2 = chipElevationXMQ;
                            z4 = z6;
                            shape3 = shapeO;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            TextStyle textStyleT2 = TypographyKt.t(SuggestionChipTokens.f29910n.XQ(), composerKN, i13);
                            long jRl2 = chipColors3.rl(z4);
                            composerKN.eF(1248043208);
                            if (chipBorderJ2 != null) {
                            }
                            composerKN.Xw();
                            if (stateN != null) {
                            }
                            int i212 = i14 << 6;
                            int i222 = ((i14 >> 6) & 14) | i9 | ((i14 << 3) & 112) | ((i14 >> 3) & 896) | (i212 & 7168) | (i212 & 3670016);
                            int i232 = i14 << 9;
                            ChipColors chipColors52 = chipColors3;
                            composer3 = composerKN;
                            Function2 function282 = function23;
                            Modifier modifier42 = modifier2;
                            t(modifier42, function02, z4, function282, textStyleT2, jRl2, function25, null, shape3, chipColors52, chipElevation2, borderStroke, SuggestionChipDefaults.f27932n.nr(), nr, mutableInteractionSource3, composer3, i222 | (234881024 & i232) | (i232 & 1879048192), ((i14 >> 21) & 14) | 3456 | ((i14 >> 15) & 57344));
                            if (ComposerKt.v()) {
                            }
                            chipBorder2 = chipBorderJ2;
                            modifier2 = modifier42;
                            z5 = z4;
                            function26 = function25;
                            shape4 = shape3;
                            chipColors4 = chipColors52;
                            chipElevation3 = chipElevation2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    scopeUpdateScopeGh = composer3.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function24 = function22;
                if ((196608 & i2) != 0) {
                }
                if ((1572864 & i2) != 0) {
                }
                if ((i2 & 12582912) != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                mutableInteractionSource2 = mutableInteractionSource;
                int i1922 = i5;
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer3.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            function24 = function22;
            if ((196608 & i2) != 0) {
            }
            if ((1572864 & i2) != 0) {
            }
            if ((i2 & 12582912) != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            mutableInteractionSource2 = mutableInteractionSource;
            int i19222 = i5;
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z3 = z2;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        function24 = function22;
        if ((196608 & i2) != 0) {
        }
        if ((1572864 & i2) != 0) {
        }
        if ((i2 & 12582912) != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        mutableInteractionSource2 = mutableInteractionSource;
        int i192222 = i5;
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void xMQ(final Function0 function0, final Function2 function2, Modifier modifier, boolean z2, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Function2 function23;
        final Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        Function2 function24;
        Shape shape2;
        ChipColors chipColors2;
        int i9;
        ChipElevation chipElevationRl;
        int i10;
        int i11;
        int i12;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        int i14;
        Shape shapeO;
        ChipColors chipColorsN;
        int i15;
        ChipBorder chipBorder2;
        MutableInteractionSource mutableInteractionSource3;
        Function2 function25;
        int i16;
        ChipElevation chipElevation2;
        boolean z4;
        Shape shape3;
        final ChipBorder chipBorder3;
        Composer composer2;
        final boolean z5;
        final Function2 function26;
        final Shape shape4;
        final ChipColors chipColors3;
        final ChipElevation chipElevation3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1668751803);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function23) ? 32 : 16;
            }
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function24 = function22;
                        i5 |= composerKN.E2(function24) ? 16384 : 8192;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            shape2 = shape;
                            int i18 = composerKN.p5(shape2) ? 131072 : 65536;
                            i5 |= i18;
                        } else {
                            shape2 = shape;
                        }
                        i5 |= i18;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i19 = composerKN.p5(chipColors2) ? 1048576 : 524288;
                            i5 |= i19;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i5 |= i19;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i2 & 12582912) != 0) {
                        i9 = 12582912;
                        if ((i3 & 128) == 0) {
                            chipElevationRl = chipElevation;
                            int i20 = composerKN.p5(chipElevationRl) ? 8388608 : 4194304;
                            i5 |= i20;
                        } else {
                            chipElevationRl = chipElevation;
                        }
                        i5 |= i20;
                    } else {
                        i9 = 12582912;
                        chipElevationRl = chipElevation;
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else {
                        if ((i2 & 100663296) == 0) {
                            i11 = i17;
                            i5 |= composerKN.p5(chipBorder) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 == 0) {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i13 = i12;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i5 |= composerKN.p5(mutableInteractionSource2) ? 536870912 : 268435456;
                            }
                            int i21 = i5;
                            if ((i5 & 306783379) == 306783378 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z6 = i7 == 0 ? true : z3;
                                    Function2 function27 = i8 == 0 ? null : function24;
                                    if ((i3 & 32) == 0) {
                                        i14 = i21 & (-458753);
                                        shapeO = SuggestionChipDefaults.f27932n.O(composerKN, 6);
                                    } else {
                                        i14 = i21;
                                        shapeO = shape2;
                                    }
                                    if ((i3 & 64) == 0) {
                                        i14 &= -3670017;
                                        chipColorsN = SuggestionChipDefaults.f27932n.n(composerKN, 6);
                                    } else {
                                        chipColorsN = chipColors2;
                                    }
                                    int i22 = i14;
                                    if ((i3 & 128) == 0) {
                                        i22 &= -29360129;
                                        i15 = 6;
                                        chipElevationRl = SuggestionChipDefaults.f27932n.rl(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 1572864, 63);
                                    } else {
                                        i15 = 6;
                                    }
                                    chipBorder2 = i10 == 0 ? null : chipBorder;
                                    if (i13 == 0) {
                                        Object objIF = composerKN.iF();
                                        if (objIF == Composer.INSTANCE.n()) {
                                            objIF = InteractionSourceKt.n();
                                            composerKN.o(objIF);
                                        }
                                        mutableInteractionSource3 = (MutableInteractionSource) objIF;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                    }
                                    chipColors2 = chipColorsN;
                                    function25 = function27;
                                    i16 = i22;
                                    chipElevation2 = chipElevationRl;
                                    z4 = z6;
                                    shape3 = shapeO;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 32) != 0) {
                                        i21 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i21 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i21 &= -29360129;
                                    }
                                    chipBorder2 = chipBorder;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    function25 = function24;
                                    shape3 = shape2;
                                    chipElevation2 = chipElevationRl;
                                    i15 = 6;
                                    z4 = z3;
                                    i16 = i21;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1668751803, i16, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:986)");
                                }
                                TextStyle textStyleT = TypographyKt.t(SuggestionChipTokens.f29910n.XQ(), composerKN, i15);
                                long jRl = chipColors2.rl(z4);
                                float fNr = SuggestionChipDefaults.f27932n.nr();
                                PaddingValues paddingValues = nr;
                                composerKN.eF(2121812626);
                                State stateN = chipBorder2 != null ? null : chipBorder2.n(z4, composerKN, ((i16 >> 9) & 14) | ((i16 >> 21) & 112));
                                composerKN.Xw();
                                BorderStroke borderStroke = stateN != null ? (BorderStroke) stateN.getValue() : null;
                                int i23 = i16 << 6;
                                int i24 = ((i16 >> 6) & 14) | i9 | ((i16 << 3) & 112) | ((i16 >> 3) & 896) | (i23 & 7168) | (i23 & 3670016);
                                int i25 = i16 << 9;
                                ChipColors chipColors4 = chipColors2;
                                Function2 function28 = function23;
                                Modifier modifier4 = modifier3;
                                t(modifier4, function02, z4, function28, textStyleT, jRl, function25, null, shape3, chipColors4, chipElevation2, borderStroke, fNr, paddingValues, mutableInteractionSource3, composerKN, i24 | (234881024 & i25) | (i25 & 1879048192), ((i16 >> 21) & 14) | 3456 | ((i16 >> 15) & 57344));
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                chipBorder3 = chipBorder2;
                                composer2 = composerKN;
                                modifier2 = modifier4;
                                z5 = z4;
                                function26 = function25;
                                shape4 = shape3;
                                chipColors3 = chipColors4;
                                chipElevation3 = chipElevation2;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            } else {
                                composerKN.wTp();
                                z5 = z3;
                                function26 = function24;
                                composer2 = composerKN;
                                shape4 = shape2;
                                chipColors3 = chipColors2;
                                chipElevation3 = chipElevationRl;
                                chipBorder3 = chipBorder;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ElevatedSuggestionChip$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i26) {
                                        ChipKt.xMQ(function0, function2, modifier2, z5, function26, shape4, chipColors3, chipElevation3, chipBorder3, mutableInteractionSource4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i13 = i12;
                        mutableInteractionSource2 = mutableInteractionSource;
                        int i212 = i5;
                        if ((i5 & 306783379) == 306783378) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i11 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if ((i3 & 32) == 0) {
                                }
                                if ((i3 & 64) == 0) {
                                }
                                int i222 = i14;
                                if ((i3 & 128) == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                chipColors2 = chipColorsN;
                                function25 = function27;
                                i16 = i222;
                                chipElevation2 = chipElevationRl;
                                z4 = z6;
                                shape3 = shapeO;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                TextStyle textStyleT2 = TypographyKt.t(SuggestionChipTokens.f29910n.XQ(), composerKN, i15);
                                long jRl2 = chipColors2.rl(z4);
                                float fNr2 = SuggestionChipDefaults.f27932n.nr();
                                PaddingValues paddingValues2 = nr;
                                composerKN.eF(2121812626);
                                if (chipBorder2 != null) {
                                }
                                composerKN.Xw();
                                if (stateN != null) {
                                }
                                int i232 = i16 << 6;
                                int i242 = ((i16 >> 6) & 14) | i9 | ((i16 << 3) & 112) | ((i16 >> 3) & 896) | (i232 & 7168) | (i232 & 3670016);
                                int i252 = i16 << 9;
                                ChipColors chipColors42 = chipColors2;
                                Function2 function282 = function23;
                                Modifier modifier42 = modifier3;
                                t(modifier42, function02, z4, function282, textStyleT2, jRl2, function25, null, shape3, chipColors42, chipElevation2, borderStroke, fNr2, paddingValues2, mutableInteractionSource3, composerKN, i242 | (234881024 & i252) | (i252 & 1879048192), ((i16 >> 21) & 14) | 3456 | ((i16 >> 15) & 57344));
                                if (ComposerKt.v()) {
                                }
                                chipBorder3 = chipBorder2;
                                composer2 = composerKN;
                                modifier2 = modifier42;
                                z5 = z4;
                                function26 = function25;
                                shape4 = shape3;
                                chipColors3 = chipColors42;
                                chipElevation3 = chipElevation2;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i11 = i17;
                    i12 = i3 & 512;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    mutableInteractionSource2 = mutableInteractionSource;
                    int i2122 = i5;
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function24 = function22;
                if ((196608 & i2) != 0) {
                }
                if ((1572864 & i2) != 0) {
                }
                if ((i2 & 12582912) != 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i17;
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                mutableInteractionSource2 = mutableInteractionSource;
                int i21222 = i5;
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            function24 = function22;
            if ((196608 & i2) != 0) {
            }
            if ((1572864 & i2) != 0) {
            }
            if ((i2 & 12582912) != 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i17;
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            mutableInteractionSource2 = mutableInteractionSource;
            int i212222 = i5;
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z3 = z2;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        function24 = function22;
        if ((196608 & i2) != 0) {
        }
        if ((1572864 & i2) != 0) {
        }
        if ((i2 & 12582912) != 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i17;
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        mutableInteractionSource2 = mutableInteractionSource;
        int i2122222 = i5;
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
