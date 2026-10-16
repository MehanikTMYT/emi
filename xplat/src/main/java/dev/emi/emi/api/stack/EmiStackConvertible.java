package dev.emi.emi.api.stack;

import org.jetbrains.annotations.ApiStatus;

/**
 * Represents a type that can be implicitly converted into an EmiStack.
 */
@ApiStatus.Experimental
// 26.1.2 port: the two @Environment(CLIENT) markers were dropped — the NeoForge build rewrote them to @OnlyIn, which
// FML 11 no longer honours and reports on the loading warning screen. Both methods are plain throwing defaults.
public interface EmiStackConvertible {
	
	/**
	 * @return The default representation of this type as an EmiStack.
	 *  If the type has an amount of its own, it will be used.
	 *  Otherwise, it'll use the default amount for the stack type.
	 */
	@ApiStatus.Experimental
	default EmiStack emi() {
		throw new IllegalStateException();
	}

	/**
	 * @return The default representation of this type as an EmiStack.
	 *  Uses the provided amount.
	 */
	@ApiStatus.Experimental
	default EmiStack emi(long amount) {
		throw new IllegalStateException();
	}
}
