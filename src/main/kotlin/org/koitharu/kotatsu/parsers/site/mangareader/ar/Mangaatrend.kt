package org.koitharu.kotatsu.parsers.site.mangareader.ar

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.config.ConfigKey
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.mangareader.MangaReaderParser
import java.text.SimpleDateFormat
import java.util.Locale

@MangaSourceParser("MANGAATREND", "Mangaatrend", "ar")
internal class Mangaatrend(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MANGAATREND, pageSize = 40, searchPageSize = 20) {

	override val configKeyDomain: ConfigKey.Domain
		get() = ConfigKey.Domain("mangaatrend.net")

	override val chapterDateFormat: SimpleDateFormat = SimpleDateFormat("MMMM d, yyyy", Locale("ar", "AR"))

}