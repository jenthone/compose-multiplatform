@file:Suppress("Unused", "NOTHING_TO_INLINE", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "INLINE_EXTERNAL_DECLARATION", "WRONG_BODY_OF_EXTERNAL_DECLARATION", "NESTED_EXTERNAL_DECLARATION", "ClassName")

package org.jetbrains.compose.web.css

external interface CSSNumericValue<T : CSSUnit> : StylePropertyValue

external interface CSSSizeValue<T : CSSUnit> : CSSNumericValue<T> {
    val value: Float
    val unit: T
}

data class CSSUnitValueTyped<T : CSSUnit>(
    override val value: Float,
    override val unit: T
) : CSSSizeValue<T> {
    override fun toString(): String = "$value$unit"
}

external interface CSSUnitLengthOrPercentage: CSSUnit
external interface CSSUnitPercentage: CSSUnitLengthOrPercentage
external interface CSSUnitLength: CSSUnitLengthOrPercentage
external interface CSSUnitRel : CSSUnitLength
external interface CSSUnitAbs: CSSUnitLength
external interface CSSUnitAngle: CSSUnit
external interface CSSUnitTime: CSSUnit
external interface CSSUnitFrequency: CSSUnit
external interface CSSUnitResolution: CSSUnit
external interface CSSUnitFlex: CSSUnit

typealias CSSAngleValue = CSSSizeValue<out CSSUnitAngle>
typealias CSSLengthOrPercentageValue = CSSSizeValue<out CSSUnitLengthOrPercentage>
typealias CSSLengthValue = CSSSizeValue<out CSSUnitLength>
typealias CSSPercentageValue = CSSSizeValue<out CSSUnitPercentage>
typealias CSSUnitValue = CSSSizeValue<out CSSUnit>
typealias CSSpxValue = CSSSizeValue<CSSUnit.px>

// fake interfaces to distinguish units
external interface CSSUnit {
    external interface percent: CSSUnitPercentage

    external interface em: CSSUnitRel

    external interface ex: CSSUnitRel

    external interface ch: CSSUnitRel

    external interface ic: CSSUnitRel

    external interface rem: CSSUnitRel

    external interface lh: CSSUnitRel

    external interface rlh: CSSUnitRel

    external interface vw: CSSUnitRel

    external interface vh: CSSUnitRel

    external interface vi: CSSUnitRel

    external interface vb: CSSUnitRel

    external interface vmin: CSSUnitRel

    external interface vmax: CSSUnitRel

    external interface cm: CSSUnitRel

    external interface mm: CSSUnitRel

    external interface Q: CSSUnitRel

    external interface pt: CSSUnitAbs

    external interface pc: CSSUnitAbs

    external interface px: CSSUnitAbs

    external interface deg: CSSUnitAngle

    external interface grad: CSSUnitAngle

    external interface rad: CSSUnitAngle

    external interface turn: CSSUnitAngle

    external interface s: CSSUnitTime

    external interface ms: CSSUnitTime

    external interface Hz: CSSUnitFrequency

    external interface kHz: CSSUnitFrequency

    external interface dpi: CSSUnitResolution

    external interface dpcm: CSSUnitResolution

    external interface dppx: CSSUnitResolution

    external interface fr: CSSUnitFlex

    external interface number: CSSUnit
    
    external companion object {
        inline val percent get() = "%".unsafeCast<percent>()

        inline val em get() = "em".unsafeCast<em>()
        
        inline val ex get() = "ex".unsafeCast<ex>()

        inline val ch get() = "ch".unsafeCast<ch>()
        
        inline val ic get() = "ic".unsafeCast<ic>()

        inline val rem get() = "rem".unsafeCast<rem>()

        inline val lh get() = "lh".unsafeCast<lh>()

        inline val rlh get() = "rlh".unsafeCast<rlh>()
        
        inline val vw get() = "vw".unsafeCast<vw>()

        inline val vh get() = "vh".unsafeCast<vh>()

        inline val vi get() = "vi".unsafeCast<vi>()

        inline val vb get() = "vb".unsafeCast<vb>()

        inline val vmin get() = "vmin".unsafeCast<vmin>()

        inline val vmax get() = "vmax".unsafeCast<vmax>()

        inline val cm get() = "cm".unsafeCast<cm>()

        inline val mm get() = "mm".unsafeCast<mm>()

        inline val Q get() = "Q".unsafeCast<Q>()

        inline val pt get() = "pt".unsafeCast<pt>()

        inline val pc get() = "pc".unsafeCast<pc>()

        inline val px get() = "px".unsafeCast<px>()

        inline val deg get() = "deg".unsafeCast<deg>()

        inline val grad get() = "grad".unsafeCast<grad>()

        inline val rad get() = "rad".unsafeCast<rad>()

        inline val turn get() = "turn".unsafeCast<turn>()

        inline val s get() = "s".unsafeCast<s>()

        inline val ms get() = "ms".unsafeCast<ms>()

        inline val Hz get() = "Hz".unsafeCast<Hz>()

        inline val kHz get() = "kHz".unsafeCast<kHz>()

        inline val dpi get() = "dpi".unsafeCast<dpi>()

        inline val dpcm get() = "dpcm".unsafeCast<dpcm>()

        inline val dppx get() = "dppx".unsafeCast<dppx>()

        inline val fr get() = "fr".unsafeCast<fr>()

        inline val number get() = "number".unsafeCast<number>()
    }
}


val Number.number
    get(): CSSSizeValue<CSSUnit.number> = CSSUnitValueTyped(this.toFloat(), CSSUnit.number)

val Number.percent
    get() : CSSSizeValue<CSSUnit.percent> = CSSUnitValueTyped(this.toFloat(), CSSUnit.percent)

val Number.em
    get() : CSSSizeValue<CSSUnit.em> = CSSUnitValueTyped(this.toFloat(), CSSUnit.em)

val Number.ex
    get(): CSSSizeValue<CSSUnit.ex> = CSSUnitValueTyped(this.toFloat(), CSSUnit.ex)

val Number.ch
    get(): CSSSizeValue<CSSUnit.ch> = CSSUnitValueTyped(this.toFloat(), CSSUnit.ch)

val Number.cssRem
    get(): CSSSizeValue<CSSUnit.rem> = CSSUnitValueTyped(this.toFloat(), CSSUnit.rem)

val Number.vw
    get(): CSSSizeValue<CSSUnit.vw> = CSSUnitValueTyped(this.toFloat(), CSSUnit.vw)

val Number.vh
    get(): CSSSizeValue<CSSUnit.vh> = CSSUnitValueTyped(this.toFloat(), CSSUnit.vh)

val Number.vmin
    get(): CSSSizeValue<CSSUnit.vmin> = CSSUnitValueTyped(this.toFloat(), CSSUnit.vmin)

val Number.vmax
    get(): CSSSizeValue<CSSUnit.vmax> = CSSUnitValueTyped(this.toFloat(), CSSUnit.vmax)

val Number.cm
    get(): CSSSizeValue<CSSUnit.cm> = CSSUnitValueTyped(this.toFloat(), CSSUnit.cm)

val Number.mm
    get(): CSSSizeValue<CSSUnit.mm> = CSSUnitValueTyped(this.toFloat(), CSSUnit.mm)

val Number.Q
    get() : CSSSizeValue<CSSUnit.Q> = CSSUnitValueTyped(this.toFloat(), CSSUnit.Q)

val Number.pt
    get(): CSSSizeValue<CSSUnit.pt> = CSSUnitValueTyped(this.toFloat(), CSSUnit.pt)
val Number.pc
    get(): CSSSizeValue<CSSUnit.pc> = CSSUnitValueTyped(this.toFloat(), CSSUnit.pc)
val Number.px
    get(): CSSSizeValue<CSSUnit.px> = CSSUnitValueTyped(this.toFloat(), CSSUnit.px)

val Number.deg
    get(): CSSSizeValue<CSSUnit.deg> = CSSUnitValueTyped(this.toFloat(), CSSUnit.deg)
val Number.grad
    get(): CSSSizeValue<CSSUnit.grad> = CSSUnitValueTyped(this.toFloat(), CSSUnit.grad)
val Number.rad
    get(): CSSSizeValue<CSSUnit.rad> = CSSUnitValueTyped(this.toFloat(), CSSUnit.rad)
val Number.turn
    get(): CSSSizeValue<CSSUnit.turn> = CSSUnitValueTyped(this.toFloat(), CSSUnit.turn)

val Number.s
    get(): CSSSizeValue<CSSUnit.s> = CSSUnitValueTyped(this.toFloat(), CSSUnit.s)
val Number.ms
    get(): CSSSizeValue<CSSUnit.ms> = CSSUnitValueTyped(this.toFloat(), CSSUnit.ms)

val Number.Hz
    get(): CSSSizeValue<CSSUnit.Hz> = CSSUnitValueTyped(this.toFloat(), CSSUnit.Hz)
val Number.kHz
    get(): CSSSizeValue<CSSUnit.kHz> = CSSUnitValueTyped(this.toFloat(), CSSUnit.kHz)

val Number.dpi
    get(): CSSSizeValue<CSSUnit.dpi> = CSSUnitValueTyped(this.toFloat(), CSSUnit.dpi)
val Number.dpcm
    get(): CSSSizeValue<CSSUnit.dpcm> = CSSUnitValueTyped(this.toFloat(), CSSUnit.dpcm)
val Number.dppx
    get(): CSSSizeValue<CSSUnit.dppx> = CSSUnitValueTyped(this.toFloat(), CSSUnit.dppx)

val Number.fr
    get(): CSSSizeValue<CSSUnit.fr> = CSSUnitValueTyped(this.toFloat(), CSSUnit.fr)
