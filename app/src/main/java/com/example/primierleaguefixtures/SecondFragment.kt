package com.example.primierleaguefixtures

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.match_layout, container, false)

        val matchNumberTextView = view.findViewById<TextView>(R.id.matchNumber)
        matchNumberTextView.text = "Match Number: 1"

        val roundNumberTextView = view.findViewById<TextView>(R.id.roundNumber)
        roundNumberTextView.text = "Round Number: 1"

        val dateUtcTextView = view.findViewById<TextView>(R.id.dateUtc)
        dateUtcTextView.text = "DateUtc: 2021-08-13 19:00:00Z"

        val locationTextView = view.findViewById<TextView>(R.id.location)
        locationTextView.text = "Location: Brentford Community Stadium"

        val homeTeamTextView = view.findViewById<TextView>(R.id.homeTeam)
        homeTeamTextView.text = "HomeTeam: Brentford"

        val awayTeamTextView = view.findViewById<TextView>(R.id.awayTeam)
        awayTeamTextView.text = "AwayTeam: Arsenal"

        val groupTextView = view.findViewById<TextView>(R.id.group)
        groupTextView.text = "Group: null"

        val homeTeamScoreTextView = view.findViewById<TextView>(R.id.homeTeamScore)
        homeTeamScoreTextView.text = "HomeTeamScore: 2"

        val awayTeamScoreTextView = view.findViewById<TextView>(R.id.awayTeamScore)
        awayTeamScoreTextView.text = "AwayTeamScore: 0"


        return view
    }


}