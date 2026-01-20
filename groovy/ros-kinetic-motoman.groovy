node {
    git url: 'https://github.com/ros-industrial/motoman.git', branch: 'kinetic-devel'
    registerROS('ros:kinetic-desktop-full', [
        'ros-kinetic-industrial-robot-client',
        'ros-kinetic-joint-state-publisher-gui'
    ], [])
}
