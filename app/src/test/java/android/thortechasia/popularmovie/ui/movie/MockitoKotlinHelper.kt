package android.thortechasia.popularmovie.ui.movie

import org.mockito.ArgumentCaptor
import org.mockito.Mockito

object MockitoKotlinHelper {
    /**
     * Returns Mockito.eq() as nullable type to avoid java.lang.IllegalStateException when
     * null is returned.
     *
     * Generic T is nullable because implicitly bounded by Any?.
     */
    fun <T> eq(obj: T): T = Mockito.eq<T>(obj)


    /**
     * Returns Mockito.any() as nullable type to avoid java.lang.IllegalStateException when
     * null is returned.
     */
    fun <T> any(): T = Mockito.any<T>()


    /**
     * Returns ArgumentCaptor.capture() as nullable type to avoid java.lang.IllegalStateException
     * when null is returned.
     */
    fun <T> capture(argumentCaptor: ArgumentCaptor<T>): T = argumentCaptor.capture()


    /**
     * Helper function for creating an argumentCaptor in kotlin.
     */
    inline fun <reified T : Any> argumentCaptor(): ArgumentCaptor<T> =
        ArgumentCaptor.forClass(T::class.java)
}
