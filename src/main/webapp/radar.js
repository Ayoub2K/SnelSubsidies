$(function() {

    var $rad = $('#rad'),
        $obj = $('.obj'),
        deg = 0,
        rad = $rad.width() / 2;

    $obj.each(function(){
        var pos = $(this).data(),
            getAtan = Math.atan2(pos.x-rad, pos.y-rad),
            getDeg = (-getAtan/(Math.PI/180) + 180) | 0;
        // Read/set positions and store degree
        $(this).css({left:pos.x, top:pos.y}).attr('data-atDeg', getDeg);
    });

});