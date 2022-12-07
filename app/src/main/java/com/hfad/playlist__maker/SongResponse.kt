package com.hfad.playlist__maker

import com.hfad.playlist___maker.Song

class SongResponse  (val searchType: String,
                     val expression: String,
                     val results: List<Song>)