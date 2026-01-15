node {
    git url: 'https://github.com/ros-industrial/motoman.git', branch: 'hydro-devel'
    registerROS('ros_legacy:hydro-ros-precise', [
        'ros-hydro-control-msgs',
        'ros-hydro-industrial-robot-client',
        'ros-hydro-roslaunch',
        'ros-hydro-roslint'
    ], [])
}
