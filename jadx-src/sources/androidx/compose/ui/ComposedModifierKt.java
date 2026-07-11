package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "Landroidx/compose/runtime/Composable;", "factory", "rl", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composer;", "modifier", "O", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "nr", "J2", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ComposedModifierKt {
    public static final Modifier J2(Composer composer, Modifier modifier) {
        return modifier == Modifier.INSTANCE ? modifier : O(composer, new CompositionLocalMapInjectionElement(composer.Ik()).Zmq(modifier));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier nr(final Composer composer, Modifier modifier) {
        if (modifier.e(new Function1<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Modifier.Element element) {
                return Boolean.valueOf(!(element instanceof ComposedModifier));
            }
        })) {
            return modifier;
        }
        composer.te(1219399079);
        Modifier modifier2 = (Modifier) modifier.g(Modifier.INSTANCE, new Function2<Modifier, Modifier.Element, Modifier>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Modifier invoke(Modifier modifier3, Modifier.Element element) {
                boolean z2 = element instanceof ComposedModifier;
                Modifier modifierNr = element;
                if (z2) {
                    Function3 factory = ((ComposedModifier) element).getFactory();
                    Intrinsics.checkNotNull(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    modifierNr = ComposedModifierKt.nr(composer, (Modifier) ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(factory, 3)).invoke(Modifier.INSTANCE, composer, 0));
                }
                return modifier3.Zmq(modifierNr);
            }
        });
        composer.M7();
        return modifier2;
    }

    public static final Modifier rl(Modifier modifier, Function1 function1, Function3 function3) {
        return modifier.Zmq(new ComposedModifier(function1, function3));
    }

    public static /* synthetic */ Modifier t(Modifier modifier, Function1 function1, Function3 function3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = InspectableValueKt.n();
        }
        return rl(modifier, function1, function3);
    }

    public static final Modifier O(Composer composer, Modifier modifier) {
        composer.eF(439770924);
        Modifier modifierNr = nr(composer, modifier);
        composer.Xw();
        return modifierNr;
    }
}
